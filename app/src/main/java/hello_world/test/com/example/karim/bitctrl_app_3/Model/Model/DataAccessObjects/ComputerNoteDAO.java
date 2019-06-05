package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.DataAccessObjects;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;

@Dao
public interface ComputerNoteDAO {

    @Insert
    void insert (ComputerNote computerNote);

    @Update
    void update(ComputerNote computerNote);

    @Delete
    void delete(ComputerNote computerNote);

    @Query("DELETE FROM computers")
    void deleteAllNotes();

    @Query("SELECT * FROM computers ORDER BY id ASC")
    LiveData<List<ComputerNote>> getAllComputers();
}
