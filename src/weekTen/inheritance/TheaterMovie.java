package weekTen.inheritance;

public class TheaterMovie extends Movie{
    private String description;

    public TheaterMovie()   {
    }

    public TheaterMovie(String tile, int runtime, String genre, String description) {
        super(tile, runtime, genre);
        this.description = description;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Description:%s",description);
    }
}
