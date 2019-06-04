
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
    "playersystem",
    "typ",
    "name"
})
public class InstallationPointProperties {

    @JsonProperty("id")
    private String id;
    @JsonProperty("playersystem")
    private String playersystem;
    @JsonProperty("typ")
    private String typ;
    @JsonProperty("name")
    private String name;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
