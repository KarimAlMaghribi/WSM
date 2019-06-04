
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
    "Role",
    "User",
    "PlayerSystemTyp",
    "PlayerSystem",
    "Computer",
    "InstallationPoint",
    "ServicePoint"
})
public class Types {

    @JsonProperty("Role")
    private Role role;
    @JsonProperty("User")
    private User user;
    @JsonProperty("PlayerSystemTyp")
    private PlayerSystemTyp playerSystemTyp;
    @JsonProperty("PlayerSystem")
    private PlayerSystem playerSystem;
    @JsonProperty("Computer")
    private Computer computer;
    @JsonProperty("InstallationPoint")
    private InstallationPoint installationPoint;
    @JsonProperty("ServicePoint")
    private ServicePoint servicePoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Role")
    public Role getRole() {
        return role;
    }

    @JsonProperty("Role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonProperty("User")
    public User getUser() {
        return user;
    }

    @JsonProperty("User")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("PlayerSystemTyp")
    public PlayerSystemTyp getPlayerSystemTyp() {
        return playerSystemTyp;
    }

    @JsonProperty("PlayerSystemTyp")
    public void setPlayerSystemTyp(PlayerSystemTyp playerSystemTyp) {
        this.playerSystemTyp = playerSystemTyp;
    }

    @JsonProperty("PlayerSystem")
    public PlayerSystem getPlayerSystem() {
        return playerSystem;
    }

    @JsonProperty("PlayerSystem")
    public void setPlayerSystem(PlayerSystem playerSystem) {
        this.playerSystem = playerSystem;
    }

    @JsonProperty("Computer")
    public Computer getComputer() {
        return computer;
    }

    @JsonProperty("Computer")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @JsonProperty("InstallationPoint")
    public InstallationPoint getInstallationPoint() {
        return installationPoint;
    }

    @JsonProperty("InstallationPoint")
    public void setInstallationPoint(InstallationPoint installationPoint) {
        this.installationPoint = installationPoint;
    }

    @JsonProperty("ServicePoint")
    public ServicePoint getServicePoint() {
        return servicePoint;
    }

    @JsonProperty("ServicePoint")
    public void setServicePoint(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
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
