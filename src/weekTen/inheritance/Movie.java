package weekTen.inheritance;

public class Movie {
    private String tile;
    private int runtime;
    //note: runtime is in minutes
    private String genre;

    //setters and getters
    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //default constructor
    public Movie() {
    }
    //parameterized constructor
    public Movie(String tile, int runtime, String genre) {
        this.tile = tile;
        this.runtime = runtime;
        this.genre = genre;
    }


    //toString method
    @Override
    public String toString(){
        return String.format("The Film Title:%s Runtime:%d minutes Genre:%s",tile,runtime,genre);
    }
}
