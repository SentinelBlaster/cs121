package weekTen.inheritance;

public class SeatCategory extends Movie{
    private Double price;

    public SeatCategory()   {
    }

    public SeatCategory(String tile, int runtime, String genre, double price) {
        super(tile, runtime, genre);
        this.price = price;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Description:%.2f",price);
    }
}
