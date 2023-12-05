import java.util.Locale;
import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Boolean cafe = true;

        //Questions
        System.out.println("Please enter 'yes' or 'no'");
        System.out.println("Is any one in your party vegetarian?");
        String vegetarian = console.nextLine().toLowerCase();
        System.out.println("Is any one in your party vegan?");
        String vegan = console.nextLine().toLowerCase();
        System.out.println("Is any one in your party need gluten-free options?");
        String glutenFree = console.nextLine().toLowerCase();

        System.out.println("Here are your options:");
        if ((vegetarian.equals("no")) && (vegan.equals("no")) && (glutenFree.equals("no"))){
            System.out.println("     Joe's Gourmet Burgers");
        }
        if (vegan.equals("no")){
            System.out.println("     Main Street Pizza Company");
        }
        if (cafe){
            System.out.println("     Corner Cafe");
        }
        if ((vegan.equals("no")) && (glutenFree.equals("no"))){
            System.out.println("     Mama's Fine Italian");
        }
        if (cafe){
            System.out.println("     The Chef's Kitchen");
        }
    }
}
