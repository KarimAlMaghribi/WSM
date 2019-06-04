
package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Computer {

    @SerializedName("type")
    @Expose
    public String type;


    public String getType() {
        return type;
    }
}
