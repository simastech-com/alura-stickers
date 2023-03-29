import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDoIMDB implements ExtratorDeConteudo
{
    public List<Conteudo> extrairConteudos(String json)
    {
        MyJsonParser parser = new MyJsonParser();
        List<Map<String,String>> listaDeAtributos = parser.parse(json, new String[]{"title","image"});

        return listaDeAtributos.stream().map(atributos->      
            new Conteudo(atributos.get("title"), atributos.get("image"))
        ).toList();
    }
}
