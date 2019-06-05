package hello_world.test.com.example.karim.bitctrl_app_3.Activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.R;
import hello_world.test.com.example.karim.bitctrl_app_3.ViewModel.ComputerNoteViewModel;
import retrofit2.Callback;
import retrofit2.Response;

public class ComputerFragment extends Fragment {

    private TextView textView;
    private ComputerNoteViewModel computerNoteViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_computer, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    textView = view.findViewById(R.id.comp_id);



    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        computerNoteViewModel = ViewModelProviders.of(this).get(ComputerNoteViewModel.class);
        computerNoteViewModel.getAllComputers().observe(this, new Observer<List<ComputerNote>>() {
            @Override
            public void onChanged(List<ComputerNote> computerNotes) {
                //update RecyclerView
                Toast.makeText(getActivity(), "onchanged", Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
