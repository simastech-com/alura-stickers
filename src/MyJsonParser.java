import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//Classe desenvolvida para fazer o parse das imagens da nasa
//Sugestão encontrada em https://stackoverflow.com/questions/2591098/how-to-parse-json-in-java
public class MyJsonParser 
{
    public List<Map<String,String>> parse(String json, String[] fields)
    {
        List<Map<String,String>> mapList = new ArrayList<>();

        int index =0;
        int oldIndex = 0;
        String jSonPart="";

        index = json.indexOf("[", 0)+1;
        oldIndex = json.indexOf("[", 0)+1;

        do
        {
            index = json.indexOf("}", oldIndex);
            if(index>=0 && oldIndex>=0)
            {
                jSonPart = json.substring(oldIndex, index+1);
                JsonObject jsonObject = new JsonParser().parse(jSonPart).getAsJsonObject();

                Map<String,String> mapItem = new HashMap<>();
                for (String field : fields) 
                {
                    mapItem.put(field, jsonObject.get(field).getAsString());
                }

                mapList.add(mapItem);
            }
            oldIndex = json.indexOf("{", index);
        }while(index>=0 && oldIndex>=0);

        return mapList;
    } 
}
