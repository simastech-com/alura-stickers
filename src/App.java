import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        limparTerminal();
        Scanner scanner = new Scanner(System.in);
        
        int op = 0;
        do
        {
            System.out.println(FormataTerminal.formatar("Selecione a API desejada para gerar as figurinhas: ",new String[]{FormataTerminal.TEXTO_CIANO}));
            System.out.println(FormataTerminal.formatar("1",new String[]{FormataTerminal.TEXTO_CIANO}) + " - TopMovies IMDB");
            System.out.println(FormataTerminal.formatar("2",new String[]{FormataTerminal.TEXTO_CIANO}) + " - TopTVs IMDB");
            System.out.println(FormataTerminal.formatar("3",new String[]{FormataTerminal.TEXTO_CIANO}) + " - MostPopularMovies IMDB");
            System.out.println(FormataTerminal.formatar("4",new String[]{FormataTerminal.TEXTO_CIANO}) + " - MostPopularTVs IMDB");
            System.out.println(FormataTerminal.formatar("5",new String[]{FormataTerminal.TEXTO_CIANO}) + " - Nasa");
            System.out.println(FormataTerminal.formatar("6",new String[]{FormataTerminal.TEXTO_CIANO}) + " - Linguagens");
            System.out.println(FormataTerminal.formatar("0",new String[]{FormataTerminal.TEXTO_CIANO}) + " - Sair");
            System.out.print(FormataTerminal.formatar("Escolha uma opção: ",new String[]{FormataTerminal.TEXTO_CIANO}));

            op = scanner.nextInt();
            
            switch(op)
            {
                case 0: break;
                case 1: gerarFigurinhas(API.IMDB_TOP_MOVIES,scanner); break;
                case 2: gerarFigurinhas(API.IMDB_TOP_TVS,scanner); break;
                case 3: gerarFigurinhas(API.IMDB_MOST_POPULAR_MOVIES,scanner); break;
                case 4: gerarFigurinhas(API.IMDB_MOST_POPULAR_TVS,scanner); break;
                case 5: gerarFigurinhas(API.NASA,scanner); break;
                case 6: gerarFigurinhas(API.LINGUAGENS,scanner); break;
                default: System.out.println("Opção inválida!");
            }
            
            limparTerminal();
        }while(op!=0);
        
        scanner.close();
    }

    private static void limparTerminal() throws Exception
    {
        if (System.getProperty("os.name").contains("Windows"))
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }

    private static void gerarFigurinhas(API api, Scanner scanner) throws Exception 
    {
        limparTerminal();
        String url = api.getUrl();
        ExtratorDeConteudo extrator = api.getExtrator();
        
        if(url!=null)
        {
            ClienteHttp http = new ClienteHttp();
            String json = http.buscarDados(url);

            // Extrair só os dados que interessam (Título, poster, classificação)
            List<Conteudo> listaDeConteudos = extrator.extrairConteudos(json);

            //Exibir e manipular os dados.
            for (Conteudo conteudo : listaDeConteudos) 
            {
                System.out.println(FormataTerminal.formatar(conteudo.titulo(), new String[]{FormataTerminal.NEGRITO,FormataTerminal.TEXTO_AMARELO}));

                String urlImagem = conteudo.urlImagem();
                System.out.print(FormataTerminal.formatar("Imagem: ", new String[]{FormataTerminal.NEGRITO,FormataTerminal.TEXTO_VERMELHO}));
                System.out.println(FormataTerminal.formatar(urlImagem, new String[]{FormataTerminal.NEGRITO,FormataTerminal.TEXTO_CIANO}));
                System.out.println("");

                InputStream inputStream = new URL(urlImagem).openStream();


                GeradoraDeFigurinhas geradoraDeFigurinhas = new GeradoraDeFigurinhas();
                geradoraDeFigurinhas.cria(inputStream, conteudo.titulo().replace(":", " -") +".png", conteudo.titulo());
            }
        }

        System.out.println("Geração concluída!");
    }
}
