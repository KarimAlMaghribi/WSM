package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

public class PlayersystemEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("owner")
    private  String owner;

    @SerializedName("playerSystemGroup")
    private String playerSystemGroup;

    @SerializedName("playerSystemTypEntity")
    private int playerSystemTypEntity;

    @SerializedName("manufactor")
    private String manufactor;

    @SerializedName("description")
    private String description;

    @SerializedName("enable")
    private boolean enable;

    @SerializedName("boardcomputerid")
    private String boardcomputerid;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getPlayerSystemGroup() {
        return playerSystemGroup;
    }

    public int getPlayerSystemTypEntity() {
        return playerSystemTypEntity;
    }

    public String getManufactor() {
        return manufactor;
    }

    public String getDescription() {
        return description;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getBoardcomputerid() {
        return boardcomputerid;
    }
}
