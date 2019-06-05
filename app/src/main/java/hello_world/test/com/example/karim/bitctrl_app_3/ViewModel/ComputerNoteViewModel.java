package hello_world.test.com.example.karim.bitctrl_app_3.ViewModel;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.Repository.ComputerRepository;

public class ComputerNoteViewModel extends AndroidViewModel {
    private ComputerRepository computerRepository;
    private LiveData<List<ComputerNote>> allNotes;


    public ComputerNoteViewModel(@NonNull Application application) {
        super(application);
        computerRepository = new ComputerRepository(application);
        allNotes = computerRepository.getAllComputers();
    }

    public void insert(ComputerNote computerNote){
        computerRepository.insert(computerNote);
    }

    public void update(ComputerNote computerNote){
        computerRepository.update(computerNote);
    }

    public void delete(ComputerNote computerNote){
        computerRepository.delete(computerNote);
    }

    public void deleteAllNotes(){
        computerRepository.deleteAllNotes();
    }

    public LiveData<List<ComputerNote>> getAllComputers(){
        return allNotes;
    }
}
