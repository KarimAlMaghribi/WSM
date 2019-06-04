
package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "company",
    "support",
    "owner",
    "channel",
    "playersystem",
    "typ",
    "distributiontyp",
    "playeros",
    "playertyp",
    "hostname",
    "phonenumber",
    "sim",
    "logid",
    "enable",
    "description",
    "lastvalidupdate",
    "ip",
    "mac",
    "iplan",
    "maclan",
    "macversion",
    "maincontrolversion",
    "sernumber",
    "operationhours",
    "installationpoint"
})
public class ComputerProperties {

    @JsonProperty("id")
    private String id;
    @JsonProperty("company")
    private String company;
    @JsonProperty("support")
    private String support;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("playersystem")
    private String playersystem;
    @JsonProperty("typ")
    private String typ;
    @JsonProperty("distributiontyp")
    private String distributiontyp;
    @JsonProperty("playeros")
    private String playeros;
    @JsonProperty("playertyp")
    private String playertyp;
    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("phonenumber")
    private String phonenumber;
    @JsonProperty("sim")
    private String sim;
    @JsonProperty("logid")
    private String logid;
    @JsonProperty("enable")
    private String enable;
    @JsonProperty("description")
    private String description;
    @JsonProperty("lastvalidupdate")
    private String lastvalidupdate;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("mac")
    private String mac;
    @JsonProperty("iplan")
    private String iplan;
    @JsonProperty("maclan")
    private String maclan;
    @JsonProperty("macversion")
    private String macversion;
    @JsonProperty("maincontrolversion")
    private String maincontrolversion;
    @JsonProperty("sernumber")
    private String sernumber;
    @JsonProperty("operationhours")
    private String operationhours;
    @JsonProperty("installationpoint")
    private String installationpoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("support")
    public String getSupport() {
        return support;
    }

    @JsonProperty("support")
    public void setSupport(String support) {
        this.support = support;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("playersystem")
    public String getPlayersystem() {
        return playersystem;
    }

    @JsonProperty("playersystem")
    public void setPlayersystem(String playersystem) {
        this.playersystem = playersystem;
    }

    @JsonProperty("typ")
    public String getTyp() {
        return typ;
    }

    @JsonProperty("typ")
    public void setTyp(String typ) {
        this.typ = typ;
    }

    @JsonProperty("distributiontyp")
    public String getDistributiontyp() {
        return distributiontyp;
    }

    @JsonProperty("distributiontyp")
    public void setDistributiontyp(String distributiontyp) {
        this.distributiontyp = distributiontyp;
    }

    @JsonProperty("playeros")
    public String getPlayeros() {
        return playeros;
    }

    @JsonProperty("playeros")
    public void setPlayeros(String playeros) {
        this.playeros = playeros;
    }

    @JsonProperty("playertyp")
    public String getPlayertyp() {
        return playertyp;
    }

    @JsonProperty("playertyp")
    public void setPlayertyp(String playertyp) {
        this.playertyp = playertyp;
    }

    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @JsonProperty("phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    @JsonProperty("phonenumber")
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @JsonProperty("sim")
    public String getSim() {
        return sim;
    }

    @JsonProperty("sim")
    public void setSim(String sim) {
        this.sim = sim;
    }

    @JsonProperty("logid")
    public String getLogid() {
        return logid;
    }

    @JsonProperty("logid")
    public void setLogid(String logid) {
        this.logid = logid;
    }

    @JsonProperty("enable")
    public String getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(String enable) {
        this.enable = enable;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("lastvalidupdate")
    public String getLastvalidupdate() {
        return lastvalidupdate;
    }

    @JsonProperty("lastvalidupdate")
    public void setLastvalidupdate(String lastvalidupdate) {
        this.lastvalidupdate = lastvalidupdate;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("mac")
    public String getMac() {
        return mac;
    }

    @JsonProperty("mac")
    public void setMac(String mac) {
        this.mac = mac;
    }

    @JsonProperty("iplan")
    public String getIplan() {
        return iplan;
    }

    @JsonProperty("iplan")
    public void setIplan(String iplan) {
        this.iplan = iplan;
    }

    @JsonProperty("maclan")
    public String getMaclan() {
        return maclan;
    }

    @JsonProperty("maclan")
    public void setMaclan(String maclan) {
        this.maclan = maclan;
    }

    @JsonProperty("macversion")
    public String getMacversion() {
        return macversion;
    }

    @JsonProperty("macversion")
    public void setMacversion(String macversion) {
        this.macversion = macversion;
    }

    @JsonProperty("maincontrolversion")
    public String getMaincontrolversion() {
        return maincontrolversion;
    }

    @JsonProperty("maincontrolversion")
    public void setMaincontrolversion(String maincontrolversion) {
        this.maincontrolversion = maincontrolversion;
    }

    @JsonProperty("sernumber")
    public String getSernumber() {
        return sernumber;
    }

    @JsonProperty("sernumber")
    public void setSernumber(String sernumber) {
        this.sernumber = sernumber;
    }

    @JsonProperty("operationhours")
    public String getOperationhours() {
        return operationhours;
    }

    @JsonProperty("operationhours")
    public void setOperationhours(String operationhours) {
        this.operationhours = operationhours;
    }

    @JsonProperty("installationpoint")
    public String getInstallationpoint() {
        return installationpoint;
    }

    @JsonProperty("installationpoint")
    public void setInstallationpoint(String installationpoint) {
        this.installationpoint = installationpoint;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
