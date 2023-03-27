import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //Executar no cmd e antes usar o comando chcp 65001 

        BufferedReader bufferedReader = new BufferedReader(new FileReader("Link.txt"));
        String url = null;

        do
        {
            url = bufferedReader.readLine();
            if(url!=null)
            {
                String[] parteLink = url.split("/");
                parteLink = parteLink[parteLink.length-1].split(".json");

                System.out.println("\n");
                for(int i=1;i<=102;i++)
                {
                    System.out.print("-");
                }
                System.out.print("\n");

                for(int i=1;i<=(102-parteLink[0].length())/2;i++)
                {
                    System.out.print(" ");
                }

                System.out.println("\u001b[1m\u001b[44m\u001b[37m" + parteLink[0] + "\u001b[0m");

                URI endereco = URI.create(url);

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                String body = response.body();

                // Extrair só os dados que interessam (Título, poster, classificação)
                JsonParser parser = new JsonParser();
                List<Map<String,String>> listaDeFilmes = parser.parse(body);

                //Exibir e manipular os dados.

                int maxCaract = 0;
                for (Map<String,String> filme : listaDeFilmes) 
                {
                    int numCaract = filme.get("title").length();
                    if(numCaract > maxCaract)
                    {
                        maxCaract = numCaract;
                    }
                }

                maxCaract = 69;


                System.out.println("\n");
                for (Map<String,String> filme : listaDeFilmes) 
                {
                    System.out.print("\u001b[45m\u001b[37m" + filme.get("title"));

                    for(int i=filme.get("title").length();i<=maxCaract;i++)
                    {
                        System.out.print(" ");
                    }

                    System.out.print(" | ");

                    float fRating = Float.parseFloat(filme.get("imDbRating"));
                    int rating = (int) Math.floor(fRating);

                    if(rating>=5)
                    {
                        System.out.print("👍 ");
                    }
                    else
                    {
                        System.out.print("👎 ");
                    }

                    System.out.print(fRating + " \u001b[1m\u001b[33m");
                    for(int i=1; i<=rating;i++)
                    {
                        System.out.print("⭐");
                    }

                    for(int i=rating;i<=10;i++)
                    {
                        System.out.print("  ");
                    }

                    System.out.println("\u001b[0m");

                    System.out.println("\u001b[1m\u001b[31mPoster: \u001b[0m\u001b[36m" + filme.get("image")+"\u001b[0m");

                    System.out.println("\n");

                }

            }
        }while(url!=null);

        bufferedReader.close();
    }
}
