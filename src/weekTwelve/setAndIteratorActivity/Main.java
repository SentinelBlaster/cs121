package weekTwelve.setAndIteratorActivity;

public class Main {
    public static void main(String[] args) {
        MovieCollectionSet movies = new MovieCollectionSet();

        movies.addMovies("Transformers 2007");
        movies.addMovies("Cars");
        movies.addMovies("James Bond: Goldfinger");
        movies.addMovies("Ready Player One");
        movies.addMovies("Pixel");
        movies.addMovies("Up");
        movies.addMovies("Transformers: Rise of the Beasts");

        movies.displayMovies();
    }

}
