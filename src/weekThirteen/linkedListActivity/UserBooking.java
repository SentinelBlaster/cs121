package weekThirteen.linkedListActivity;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UserBooking {
    private String userName;
    private String movieTitle;
    private int runTime;
    private String genre;
    private String description;
    private String theater;

    //Set<String> theaters = new HashSet<>();
     private LinkedList<String> theaters = new LinkedList<>();

    public UserBooking(String userName, String movieTitle, int runTime, String genre, String description, String theater) {
        this.userName = userName;
        this.movieTitle = movieTitle;
        this.runTime = runTime;
        this.genre = genre;
        this.description = description;
        this.theater = theater;
    }

    public void addTheater(String newTheater){
        this.theaters.add(newTheater);
    }

    public void removeTheater(String oldTheater){
        this.theaters.remove(oldTheater);
    }

    public void getUserInfo(){
        System.out.println(userName);
        System.out.println(movieTitle);
        System.out.printf("%s minutes%n",runTime);
        System.out.println(genre);
        System.out.println(description);
        System.out.println(theater);
        //I wasn't sure what counted for "user info"
    }

    public void displayUserBooking(){
        System.out.println(theaters);
    }
}
