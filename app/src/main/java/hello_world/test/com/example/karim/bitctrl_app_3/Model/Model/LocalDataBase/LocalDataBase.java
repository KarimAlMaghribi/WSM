package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.LocalDataBase;

import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects.ComputerNoteDAO;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Connector.RetrieveComputerTask;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Converter.RemoteDataLocalDataComputer;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerImpl;

@Database(entities = {ComputerNote.class}, version = 1, exportSchema = false)

public abstract class LocalDataBase extends RoomDatabase {

    private static LocalDataBase instance;
    public abstract ComputerNoteDAO computerNoteDao();



    public static synchronized LocalDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDataBase.class, "Database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDBAsyncTask(instance).execute();
        }
    };

    private static class PopulateDBAsyncTask extends AsyncTask<Void, Void, Void>{
        private ComputerNoteDAO computerNoteDAO;
        RetrieveComputerTask computerTask = new RetrieveComputerTask();

        private  PopulateDBAsyncTask(LocalDataBase db){
            computerNoteDAO = db.computerNoteDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            List<ComputerImpl> allRemoteDataSourceComputers = computerTask.getAllComputers();
            RemoteDataLocalDataComputer remoteDataLocalDataComputer = new RemoteDataLocalDataComputer();

            for (ComputerImpl computer : allRemoteDataSourceComputers){

                computerNoteDAO.insert( remoteDataLocalDataComputer.convertRemoteDataToLocalData(computer));
            }
            return null;
        }
    }
}
