import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
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

                int maxCaract = 69;

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

                    String textoFigurinha = "";
                    String figurinhaWilliam = "";

                    if(rating>=5)
                    {
                        textoFigurinha = "RECOMENDO!";
                        figurinhaWilliam = "img/AuxiliarSticker/Recomendo.jpg";
                        System.out.print("👍 ");
                    }
                    else
                    {
                        textoFigurinha = "NÃO RECOMENDO!";
                        figurinhaWilliam = "img/AuxiliarSticker/NaoRecomendo.jpg";
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

                    String urlImagem = filme.get("image");
                    System.out.println("\u001b[1m\u001b[31mPoster: \u001b[0m\u001b[36m" + urlImagem +"\u001b[0m");

                    System.out.println("\n");
                    
                    InputStream inputStream = new URL(urlImagem).openStream();
                    InputStream imagemWilliam = new FileInputStream(new File(figurinhaWilliam));

                    GeradoraDeFigurinhas geradoraDeFigurinhas = new GeradoraDeFigurinhas();
                    geradoraDeFigurinhas.cria(inputStream, filme.get("title").replace(":", " -") +".png", textoFigurinha, imagemWilliam);
                }

            }
        }while(url!=null);

        bufferedReader.close();
    }
}
