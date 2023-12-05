package weekTwelve.setAndIteratorActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieCollectionSet {

    ArrayList<String> movies = new ArrayList<>();

    public MovieCollectionSet() {
    }

    public void addMovies(String movie){
        movies.add(movie);
    }

    public void displayMovies(){
        int i = 0;
        for (String movie : movies) {
            System.out.print(movie + "     ");
            i++;
            if (i >= 5){
                System.out.print("\n");
                i = 0;
            }
        }
        System.out.println();

    }
}
