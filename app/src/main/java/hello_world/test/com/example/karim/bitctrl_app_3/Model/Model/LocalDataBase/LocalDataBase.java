package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.LocalDataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects.ComputerNote_DAO;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.Computer_Note;

@Database(entities = {Computer_Note.class}, version = 1)

public abstract class LocalDataBase extends RoomDatabase {

    private static LocalDataBase instance;

    public abstract ComputerNote_DAO computerNote_dao();


    public static synchronized LocalDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDataBase.class, "Database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
