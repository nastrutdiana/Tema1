package practice10aug;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class HttpGet {
    CloseableHttpClient httpClient = HttpClients.createDefault();
    //https://jsonplaceholder.typicode.com/user
    HttpGet httpGet = new HttpGet();
    HttpResponse httpResponse = httpClient.execute(httpGet);

}
