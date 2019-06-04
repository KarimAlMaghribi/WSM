package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Connector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpRequest {

    Credentials credentials = new Credentials();

    private static final String HOST = "http://192.168.1.227:8080/json/";

    HttpURLConnection connection = null;
    URL url_data = null;

    public StringBuffer getJSONObject(String apiTarget)  throws IOException {


        url_data = new URL(HOST + "target");
        String authToken = credentials.getAuthToken();

        connection = (HttpURLConnection) url_data.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", authToken);
        connection.setDoOutput(true);

        // Get Response
        try (InputStream is = connection.getInputStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            StringBuffer response = new StringBuffer();
            String line;

            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();

            //HashMap<String, JSON_Object> hashMap = new HashMap<>();
            //ObjectMapper mapper = new ObjectMapper();
            //JSONArray jsonArray = new JSONArray();
            //String s = response.substring(1, response.length()-2);

            //JSON_Object json_object = mapper.readValue(s, JSON_Object.class);

            //String channel = json_object.getChannel();

            return response;

        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}
