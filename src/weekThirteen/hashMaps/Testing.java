package weekThirteen.hashMaps;

public class Testing {
    public static void main(String[] args) {
        MapCreation pokemon = new MapCreation();

        pokemon.addToMap("Pikachu","Electric");
        pokemon.addToMap("Lucario","Steel/Fighting");
        pokemon.addToMap("Gible","Ground/Dragon");

        pokemon.displayTypes();

        pokemon.removeFromMap("Gible");

        pokemon.displayTypes();
    }
}
