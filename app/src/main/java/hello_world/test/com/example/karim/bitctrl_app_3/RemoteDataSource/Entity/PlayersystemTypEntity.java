package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

public class PlayersystemTypEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
