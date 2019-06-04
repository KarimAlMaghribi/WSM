package hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.User;

@Entity(tableName="computers")
public class Computer_Note {

    @PrimaryKey
    private String id;

    //@ForeignKey()
    private int playersystem;
    //@ForeignKey()
    private int  installationpoint;

    private String company;
    private User support;
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
    private Date lastvalidupdate;
    private String ip;
    private String mac;
    private String maclan;
    private String macversion;
    private String maincontrolversion;
    private String sernumber;
    private int operationhours;

    public Computer_Note(String id, int playersystem, int installationpoint,
                         String company, User support, String channel, String typ,
                         String distributiontyp, String playeros, String playertyp,
                         String hostname, String phonenumber, String sim, String logid,
                         boolean enable, String description, Date lastvalidupdate, String ip,
                         String mac, String maclan, String macversion, String maincontrolversion,
                         String sernumber, int operationhours) {
        this.id = id;
        this.playersystem = playersystem;
        this.installationpoint = installationpoint;
        this.company = company;
        this.support = support;
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

    public String getId() {
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

    public User getSupport() {
        return support;
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

    public Date getLastvalidupdate() {
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

