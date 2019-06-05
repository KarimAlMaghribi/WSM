package hello_world.test.com.example.karim.bitctrl_app_3.Repository;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects.ComputerNoteDAO;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.LocalDataBase.LocalDataBase;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;

public class ComputerRepository {
    private ComputerNoteDAO computerNoteDAO;
    private LiveData<List<ComputerNote>> allComputers;

    public ComputerRepository(Application application){

        LocalDataBase localDataBase = LocalDataBase.getInstance(application);
        computerNoteDAO = localDataBase.computerNoteDao();
        allComputers = computerNoteDAO.getAllComputers();

    }

    public void insert(ComputerNote computerNote){
        new InsertComputerNoteAsyncTask(computerNoteDAO).execute(computerNote);
    }

    public void update(ComputerNote computerNote){
        new UpdateComputerNoteAsyncTask(computerNoteDAO).execute(computerNote);
    }

    public void delete(ComputerNote computerNote){
        new DeleteComputerNoteAsyncTask(computerNoteDAO).execute(computerNote);
    }

    public void deleteAllNotes(){
        new DeleteAllComputerNoteAsyncTask(computerNoteDAO).execute();
    }

    public LiveData<List<ComputerNote>> getAllComputers(){
       return allComputers;
    }


    private static class InsertComputerNoteAsyncTask extends AsyncTask<ComputerNote, Void, Void>{

        private ComputerNoteDAO computerNoteDAO;

        private InsertComputerNoteAsyncTask(ComputerNoteDAO computerNoteDAO){
            this.computerNoteDAO = computerNoteDAO;
        }

        @Override
        protected Void doInBackground(ComputerNote... computerNotes) {
            computerNoteDAO.insert(computerNotes[0]);
            return null;
        }
    }

    private static class UpdateComputerNoteAsyncTask extends AsyncTask<ComputerNote, Void, Void>{

        private ComputerNoteDAO computerNoteDAO;

        private UpdateComputerNoteAsyncTask(ComputerNoteDAO computerNoteDAO){
            this.computerNoteDAO = computerNoteDAO;
        }

        @Override
        protected Void doInBackground(ComputerNote... computerNotes) {
            computerNoteDAO.update(computerNotes[0]);
            return null;
        }
    }

    private static class DeleteComputerNoteAsyncTask extends AsyncTask<ComputerNote, Void, Void>{

        private ComputerNoteDAO computerNoteDAO;

        private DeleteComputerNoteAsyncTask(ComputerNoteDAO computerNoteDAO){
            this.computerNoteDAO = computerNoteDAO;
        }

        @Override
        protected Void doInBackground(ComputerNote... computerNotes) {
            computerNoteDAO.delete(computerNotes[0]);
            return null;
        }
    }

    private static class DeleteAllComputerNoteAsyncTask extends AsyncTask<Void, Void, Void>{

        private ComputerNoteDAO computerNoteDAO;

        private DeleteAllComputerNoteAsyncTask(ComputerNoteDAO computerNoteDAO){
            this.computerNoteDAO = computerNoteDAO;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            computerNoteDAO.deleteAllNotes();
            return null;
        }
    }
}
