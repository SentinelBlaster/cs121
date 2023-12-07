package weekThirteen.linkedListActivity;

public class Main {
    public static void main(String[] args) {
        UserBooking john = new UserBooking("SentinelBlaster", "Transformers: Rise of the Beasts", 127, "Action","The sequal to Bumblebee", "Regal");
        UserBooking alan = new UserBooking("Creepalan", "Five Nights at Freddie's", 110, "Horror","Based on the hit game", "IMAX");

        john.addTheater("Noblesville");
        john.addTheater("Carmel");
        john.addTheater("Westfield");
        john.getUserInfo();
        john.displayUserBooking();
        john.removeTheater("Carmel");
        john.displayUserBooking();

        alan.addTheater("Noblesville");
        alan.addTheater("Anderson");
        alan.addTheater("Westfield");
        alan.getUserInfo();
        alan.displayUserBooking();
        alan.removeTheater("Westfield");
        alan.displayUserBooking();

    }
}
