
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
    "owner",
    "playerstystemGroup",
    "playersystemType",
    "manufactor",
    "name",
    "description",
    "enable",
    "bordcomputerid"
})
public class PlayerSystemProperties {

    @JsonProperty("id")
    private String id;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("playerstystemGroup")
    private String playerstystemGroup;
    @JsonProperty("playersystemType")
    private String playersystemType;
    @JsonProperty("manufactor")
    private String manufactor;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enable")
    private String enable;
    @JsonProperty("bordcomputerid")
    private String bordcomputerid;
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

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("playerstystemGroup")
    public String getPlayerstystemGroup() {
        return playerstystemGroup;
    }

    @JsonProperty("playerstystemGroup")
    public void setPlayerstystemGroup(String playerstystemGroup) {
        this.playerstystemGroup = playerstystemGroup;
    }

    @JsonProperty("playersystemType")
    public String getPlayersystemType() {
        return playersystemType;
    }

    @JsonProperty("playersystemType")
    public void setPlayersystemType(String playersystemType) {
        this.playersystemType = playersystemType;
    }

    @JsonProperty("manufactor")
    public String getManufactor() {
        return manufactor;
    }

    @JsonProperty("manufactor")
    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("enable")
    public String getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(String enable) {
        this.enable = enable;
    }

    @JsonProperty("bordcomputerid")
    public String getBordcomputerid() {
        return bordcomputerid;
    }

    @JsonProperty("bordcomputerid")
    public void setBordcomputerid(String bordcomputerid) {
        this.bordcomputerid = bordcomputerid;
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
