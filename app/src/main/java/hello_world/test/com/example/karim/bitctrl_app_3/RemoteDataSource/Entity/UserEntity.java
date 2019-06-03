package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.SerializedName;

public class UserEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("roles")
    private int[] roles;

    @SerializedName("country")
    private String country;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("login")
    private String login;

    @SerializedName("street")
    private String street;

    @SerializedName("city")
    private  String city;

    @SerializedName("phone")
    private String phone;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("fax")
    private String fax;

    @SerializedName("enmail")
    private String enmail;

    public int getId() {
        return id;
    }

    public int[] getRoles() {
        return roles;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFax() {
        return fax;
    }

    public String getEnmail() {
        return enmail;
    }
}
