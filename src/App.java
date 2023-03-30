import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        API api = API.LINGUAGENS;
        
        String url = api.getUrl();
        ExtratorDeConteudo extrator = api.getExtrator();
        
        if(url!=null)
        {
            ClienteHttp http = new ClienteHttp();
            String json = http.buscarDados(url);

            // Extrair só os dados que interessam (Título, poster, classificação)
            List<Conteudo> listaDeConteudos = extrator.extrairConteudos(json);

            //Exibir e manipular os dados.
            int maxCaract = 90;

            System.out.println("\n");
            for (Conteudo conteudo : listaDeConteudos) 
            {
                System.out.print("\u001b[45m\u001b[37m" + conteudo.titulo());

                for(int i=conteudo.titulo().length();i<=maxCaract;i++)
                {
                    System.out.print(" ");
                }

                System.out.println("\u001b[0m");

                String urlImagem = conteudo.urlImagem();
                System.out.println("\u001b[1m\u001b[31mPoster: \u001b[0m\u001b[36m" + urlImagem +"\u001b[0m");

                System.out.println("\n");
                
                InputStream inputStream = new URL(urlImagem).openStream();

                int fontSize = 100;
                if(url.indexOf("nasa")>0)
                {
                    fontSize = 50;
                }
                else
                {
                    fontSize = 60;
                }

                GeradoraDeFigurinhas geradoraDeFigurinhas = new GeradoraDeFigurinhas();
                geradoraDeFigurinhas.cria(inputStream, conteudo.titulo().replace(":", " -") +".png", conteudo.titulo(),fontSize);
            }
        }
    }
}
