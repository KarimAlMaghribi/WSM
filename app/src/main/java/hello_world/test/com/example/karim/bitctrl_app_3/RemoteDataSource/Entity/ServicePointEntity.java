package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ServicePointEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("playerSystem")
    private int playerSystem;

    @SerializedName("user")
    private int user;

    @SerializedName("serviceTime")
    private Date serviceTime;

    @SerializedName("shortDescription")
    private String shortDescription;

    @SerializedName("description")
    private String description;

    @SerializedName("externoderno")
    private String externoderno;

    @SerializedName("assembler")
    private String assembler;

    public int getId() {
        return id;
    }

    public int getPlayerSystem() {
        return playerSystem;
    }

    public int getUser() {
        return user;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getExternoderno() {
        return externoderno;
    }

    public String getAssembler() {
        return assembler;
    }
}
