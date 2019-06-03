package hello_world.test.com.example.karim.bitctrl_app_3.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import hello_world.test.com.example.karim.bitctrl_app_3.R;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.DataBaseConnector;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerEntity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComputerFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_computer, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    textView = view.findViewById(R.id.comp_id);

        DataBaseConnector connector = new DataBaseConnector();

        Call<List<ComputerEntity>> call = null;
        try {
            call = connector.get_call(view.getContext());
        } catch (IOException e) {
            e.printStackTrace();
        }
        call.enqueue(new Callback<List<ComputerEntity>>() {
            @Override
            public void onResponse(Call<List<ComputerEntity>> call, Response<List<ComputerEntity>> response) {

                if (!response.isSuccessful()) {
                    textView.setText("Code: " + response.code());
                    return;
                }

                List<ComputerEntity> posts = response.body();

                for (ComputerEntity post : posts) {
                    String content = "";
                    content += "ID: " + post.getId() + "\n";


                    textView.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<ComputerEntity>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });


    }
}
