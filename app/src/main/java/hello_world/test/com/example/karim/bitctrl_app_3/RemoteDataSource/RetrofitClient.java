package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource;

import android.content.Context;

import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static final String HOST = "http://192.168.1.227:8080/json/";
    private HttpURLConnection connection = null;
    private static URL url;

    public static Retrofit getClient(Context mContext) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(HOST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}

