
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
    "computer",
    "playersystem",
    "user",
    "servicetime",
    "shortdescription",
    "description",
    "externorderno",
    "assembler"
})
public class ServicePointProperties {

    @JsonProperty("id")
    private String id;
    @JsonProperty("computer")
    private String computer;
    @JsonProperty("playersystem")
    private String playersystem;
    @JsonProperty("user")
    private String user;
    @JsonProperty("servicetime")
    private String servicetime;
    @JsonProperty("shortdescription")
    private ServicePointShortdescription shortdescription;
    @JsonProperty("description")
    private ServicePointDescription description;
    @JsonProperty("externorderno")
    private ServicePointExternorderno externorderno;
    @JsonProperty("assembler")
    private ServicePointAssembler assembler;
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

    @JsonProperty("computer")
    public String getComputer() {
        return computer;
    }

    @JsonProperty("computer")
    public void setComputer(String computer) {
        this.computer = computer;
    }

    @JsonProperty("playersystem")
    public String getPlayersystem() {
        return playersystem;
    }

    @JsonProperty("playersystem")
    public void setPlayersystem(String playersystem) {
        this.playersystem = playersystem;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("servicetime")
    public String getServicetime() {
        return servicetime;
    }

    @JsonProperty("servicetime")
    public void setServicetime(String servicetime) {
        this.servicetime = servicetime;
    }

    @JsonProperty("shortdescription")
    public ServicePointShortdescription getShortdescription() {
        return shortdescription;
    }

    @JsonProperty("shortdescription")
    public void setShortdescription(ServicePointShortdescription shortdescription) {
        this.shortdescription = shortdescription;
    }

    @JsonProperty("description")
    public ServicePointDescription getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(ServicePointDescription description) {
        this.description = description;
    }

    @JsonProperty("externorderno")
    public ServicePointExternorderno getExternorderno() {
        return externorderno;
    }

    @JsonProperty("externorderno")
    public void setExternorderno(ServicePointExternorderno externorderno) {
        this.externorderno = externorderno;
    }

    @JsonProperty("assembler")
    public ServicePointAssembler getAssembler() {
        return assembler;
    }

    @JsonProperty("assembler")
    public void setAssembler(ServicePointAssembler assembler) {
        this.assembler = assembler;
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
