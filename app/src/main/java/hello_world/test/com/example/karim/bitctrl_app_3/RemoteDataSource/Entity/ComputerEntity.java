package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.UserEntity;

public class ComputerEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("playerSystem")
    private int playerSystem;

    @SerializedName("installationPoint")
    private int installationPoint;

    @SerializedName("company")
    private String company;

    @SerializedName("support")
    private UserEntity support;

    @SerializedName("owner")
    private String owner;

    @SerializedName("channel")
    private String channel;

    @SerializedName("typ")
    private String typ;

    @SerializedName("distributiontyp")
    private String distributiontyp;

    @SerializedName("pyeros")
    private String pyeros;

    @SerializedName("hostName")
    private String hostName;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("sim")
    private String sim;

    @SerializedName("loid")
    private String loid;

    @SerializedName("enable")
    private boolean enable;

    @SerializedName("description")
    private String description;

    @SerializedName("lastValidUpdate")
    private Date lastValidUpdate;

    @SerializedName("ip")
    private String ip;

    @SerializedName("mac")
    private  String mac;

    @SerializedName("id")
    private  String ipLan;

    @SerializedName("macLan")
    private String macLan;

    @SerializedName("macVersion")
    private String macVersion;

    @SerializedName("mainControlVersion")
    private String mainControlVersion;

    @SerializedName("serNumber")
    private  String serNumber;

    @SerializedName("operationhours")
    private int operationhours;

    public int getId() {
        return id;
    }

    public int getPlayerSystem() {
        return playerSystem;
    }

    public int getInstallationPoint() {
        return installationPoint;
    }

    public String getCompany() {
        return company;
    }

    public UserEntity getSupport() {
        return support;
    }

    public String getOwner() {
        return owner;
    }

    public String getChannel() {
        return channel;
    }

    public String getTyp() {
        return typ;
    }

    public String getDistributiontyp() {
        return distributiontyp;
    }

    public String getPyeros() {
        return pyeros;
    }

    public String getHostName() {
        return hostName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSim() {
        return sim;
    }

    public String getLoid() {
        return loid;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getDescription() {
        return description;
    }

    public Date getLastValidUpdate() {
        return lastValidUpdate;
    }

    public String getIp() {
        return ip;
    }

    public String getMac() {
        return mac;
    }

    public String getIpLan() {
        return ipLan;
    }

    public String getMacLan() {
        return macLan;
    }

    public String getMacVersion() {
        return macVersion;
    }

    public String getMainControlVersion() {
        return mainControlVersion;
    }

    public String getSerNumber() {
        return serNumber;
    }

    public int getOperationhours() {
        return operationhours;
    }
}
