package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.LocalDataBase;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.List;

import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects.ComputerNoteDAO;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Connector.RetrieveComputerTask;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Converter.RemoteDataLocalDataComputer;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.Computer;

@Database(entities = {ComputerNote.class}, version = 1, exportSchema = false)

public abstract class LocalDataBase extends RoomDatabase {

    private static LocalDataBase instance;

    public abstract ComputerNoteDAO computerNoteDao();


    public static synchronized LocalDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDataBase.class, "database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDBAsyncTask(instance).execute();
        }
    };

    private static class PopulateDBAsyncTask extends AsyncTask<Void, Void, Void> {
        private ComputerNoteDAO computerNoteDAO;
        RetrieveComputerTask computerTask = new RetrieveComputerTask();

        private PopulateDBAsyncTask(LocalDataBase db) {
            computerNoteDAO = db.computerNoteDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            if(android.os.Debug.isDebuggerConnected())
                android.os.Debug.waitForDebugger();
           /* List<Computer> allComputers = computerTask.getAllComputers();
            if (allComputers == null ){
                System.out.println("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            }
            for (Computer computer : allComputers) {


                //RemoteDataLocalDataComputer.convertRemoteComputerToLocalComputer(computer)
            } */
            ComputerNote computerNote = new ComputerNote();
            computerNote.setId(2);
            ComputerNote computerNote1 = new ComputerNote();
            computerNote.setId(1);
            computerNoteDAO.insert(computerNote);
            computerNoteDAO.insert(computerNote1);

            //computerTask.getAllComputers().stream().map(c -> RemoteDataLocalDataComputer.convertRemoteComputerToLocalComputer(c)).forEach(c -> computerNoteDAO.insert(c));


            return null;
        }
    }
}
