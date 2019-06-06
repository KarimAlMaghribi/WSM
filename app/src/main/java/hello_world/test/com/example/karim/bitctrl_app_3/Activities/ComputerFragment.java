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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.R;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.Computer;
import hello_world.test.com.example.karim.bitctrl_app_3.ViewModel.ComputerNoteViewModel;
import retrofit2.Callback;
import retrofit2.Response;

public class ComputerFragment extends Fragment {

    private TextView textView;
    private ComputerNoteViewModel computerNoteViewModel;
    final ComputerAdapter adapter = new ComputerAdapter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_computer, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = getActivity().findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        computerNoteViewModel = ViewModelProviders.of(getActivity()).get(ComputerNoteViewModel.class);

        LiveData<List<ComputerNote>> liveNotes = computerNoteViewModel.getAllComputers();
        List<ComputerNote> notes = liveNotes.getValue();
        recyclerView.setAdapter(adapter);
        adapter.setNotes(notes);


        computerNoteViewModel.getAllComputers().observe(this, new Observer<List<ComputerNote>>() {
            @Override
            public void onChanged(@Nullable List<ComputerNote> notes) {
                adapter.setNotes(notes);
            }
        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }
}
