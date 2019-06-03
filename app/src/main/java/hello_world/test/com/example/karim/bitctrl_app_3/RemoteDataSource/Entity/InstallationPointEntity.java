package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

public class InstallationPointEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("playersystem")
    private int playersystem;

    @SerializedName("typ")
    private int typ;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPlayersystem() {
        return playersystem;
    }

    public int getTyp() {
        return typ;
    }
}
