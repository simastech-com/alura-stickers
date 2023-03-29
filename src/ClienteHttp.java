import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp 
{
    public String buscarDados(String url)
    {
        String body = "";        

        try 
        {
            URI endereco = URI.create(url);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            body = response.body();
        } 
        catch (IOException | InterruptedException e) 
        {
            throw new ClienteHttpException("Falha ao consultar a API");
        }

        return body;
    }
}
