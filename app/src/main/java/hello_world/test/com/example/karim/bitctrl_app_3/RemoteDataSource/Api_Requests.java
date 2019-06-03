package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource;

import java.util.List;

import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerEntity;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.PlayersystemEntity;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.PlayersystemTypEntity;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ServicePointEntity;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_Requests {

    @GET("playersystems")
    Call<List<PlayersystemEntity>> getPlayersystems();

    @GET("playersystemtyps")
    Call<List<PlayersystemTypEntity>> getPlayersystemtyps();

    @GET("computers")
    Call<List<ComputerEntity>> getComputers();

    @GET("servicepoints")
    Call<List<ServicePointEntity>> getservicepoints();


}
