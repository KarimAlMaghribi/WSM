package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.User;

@Entity(tableName="computers")
public class ComputerNote {

    @PrimaryKey
    @NonNull
    private int id;

    //@ForeignKey()
    private int playersystem;
    //@ForeignKey()
    private int  installationpoint;

    private String company;
    private int supportID;
    private String channel;
    private String typ;
    private String distributiontyp;
    private String playeros;
    private String playertyp;
    private String hostname;
    private String phonenumber;
    private  String sim;
    private String logid;
    private boolean enable;
    private  String description;
    private String lastvalidupdate;
    private String ip;
    private String mac;
    private String maclan;
    private String macversion;
    private String maincontrolversion;
    private String sernumber;
    private int operationhours;



    public ComputerNote(int id, int playersystem, int installationpoint,
                        String company, int supportID, String channel, String typ,
                        String distributiontyp, String playeros, String playertyp,
                        String hostname, String phonenumber, String sim, String logid,
                        boolean enable, String description, String lastvalidupdate, String ip,
                        String mac, String maclan, String macversion, String maincontrolversion,
                        String sernumber, int operationhours) {
        this.id = id;
        this.playersystem = playersystem;
        this.installationpoint = installationpoint;
        this.company = company;
        this.supportID = supportID;
        this.channel = channel;
        this.typ = typ;
        this.distributiontyp = distributiontyp;
        this.playeros = playeros;
        this.playertyp = playertyp;
        this.hostname = hostname;
        this.phonenumber = phonenumber;
        this.sim = sim;
        this.logid = logid;
        this.enable = enable;
        this.description = description;
        this.lastvalidupdate = lastvalidupdate;
        this.ip = ip;
        this.mac = mac;
        this.maclan = maclan;
        this.macversion = macversion;
        this.maincontrolversion = maincontrolversion;
        this.sernumber = sernumber;
        this.operationhours = operationhours;
    }

    public int getId() {
        return id;
    }

    public int getPlayersystem() {
        return playersystem;
    }

    public int getInstallationpoint() {
        return installationpoint;
    }

    public String getCompany() {
        return company;
    }

    public int getSupportID() {
        return supportID;
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

    public String getPlayeros() {
        return playeros;
    }

    public String getPlayertyp() {
        return playertyp;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getSim() {
        return sim;
    }

    public String getLogid() {
        return logid;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getDescription() {
        return description;
    }

    public String getLastvalidupdate() {
        return lastvalidupdate;
    }

    public String getIp() {
        return ip;
    }

    public String getMac() {
        return mac;
    }

    public String getMaclan() {
        return maclan;
    }

    public String getMacversion() {
        return macversion;
    }

    public String getMaincontrolversion() {
        return maincontrolversion;
    }

    public String getSernumber() {
        return sernumber;
    }

    public int getOperationhours() {
        return operationhours;
    }
}

