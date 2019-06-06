package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Connector;

import android.os.AsyncTask;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;

import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.Computer;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerImpl;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.PlayerSystem;

public class RetrieveComputerTask   {

    private static final String HOST = "http://192.168.1.227:8080/json/";
    private Exception exception;


    public List<Computer> getAllComputers() {

        Credentials credentials = new Credentials();


        try {

            String authToken = credentials.getAuthToken();
            final URL url = new URL("http://192.168.1.227:8080/json/computers");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", authToken);

            try(InputStream in = con.getInputStream()){
                BufferedReader rd = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")));
                StringBuffer response = new StringBuffer();
                String line;
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();

                ObjectMapper mapper = new ObjectMapper();
                Computer[] result = mapper.readValue(response.toString(),ComputerImpl[].class);
                return  Arrays.asList(result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
