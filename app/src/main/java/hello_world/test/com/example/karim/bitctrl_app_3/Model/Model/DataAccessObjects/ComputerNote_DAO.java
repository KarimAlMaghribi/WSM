package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects;

import android.provider.ContactsContract;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.Computer_Note;

@Dao
public interface ComputerNote_DAO {

    @Insert
    void insert (Computer_Note computerNote);

    @Update
    void update(Computer_Note computerNote);

    @Delete
    void delete(Computer_Note computerNote);

    @Query("DELETE FROM computers")
    void deleteAllNoted();

    @Query("SELECT * FROM computers ODER BY priority DESC")
    LiveData<List<Computer_Note>> getAllComputers();
}
