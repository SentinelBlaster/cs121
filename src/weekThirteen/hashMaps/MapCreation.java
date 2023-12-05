package weekThirteen.hashMaps;

import java.util.HashMap;

public class MapCreation {
    HashMap<String,String> PokemonType = new HashMap<String,String>();

    public MapCreation() {
    }

    public void addToMap(String name, String type){
        PokemonType.putIfAbsent(name,type);
    }

    public void removeFromMap(String name){
        PokemonType.remove(name);
    }

    public String  returnType(String name){
        return PokemonType.get(name);
    }
    public void displayTypes(){
        System.out.println(PokemonType);
    }
}
