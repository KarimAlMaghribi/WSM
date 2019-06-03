package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerEntity;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataBaseConnector {

    private static final String HOST = "http://192.168.1.227:8080/json/computers";
    private HttpURLConnection connection = null;
    private static URL url;

    static {
        try {
            url = new URL(HOST);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static final String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Call<List<ComputerEntity>> get_request() throws IOException {

        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        String password = md5("bitctrl");
        connection.setRequestProperty("Authorization",
                "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(("bitctrl:" + password).getBytes()));

        connection.setDoOutput(true);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api_Requests request = retrofit.create(Api_Requests.class);

        Call<List<ComputerEntity>> call = request.getComputers();

        return call;
    }

}
