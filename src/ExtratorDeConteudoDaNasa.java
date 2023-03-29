import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo
{
    
    public List<Conteudo> extrairConteudos(String json)
    {
        MyJsonParser parser = new MyJsonParser();
        List<Map<String,String>> listaDeAtributos = parser.parse(json, new String[]{"title","url"});

        return listaDeAtributos.stream().map(atributos->      
            new Conteudo(atributos.get("title"), atributos.get("url"))
        ).toList();
    }
}
