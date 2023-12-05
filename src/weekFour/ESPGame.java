package weekFour;

import java.util.*;

public class ESPGame {
    public static void main(String[] args) {

        //Setting up variables
        Random random = new Random();

        Scanner console = new Scanner(System.in);

        //Initialize Variables
        int wins = 0;
        List<String> colors = Arrays.asList("red", "green", "blue", "orange", "yellow");

        //main game loop
        for(int i = 0;i<10;i++){
            int colNum = random.nextInt(5);
            String color = colors.get(colNum);
            System.out.println("Please enter a color: red, green, blue, orange, yellow");
            String guess = console.nextLine();
            if(guess.equals(color)){
                wins++;
            }
            System.out.println(color);
            System.out.println("");

        }
        double winPercent = (double) wins /10;
        System.out.printf("You won %d games.\nYour win percent is: %.2f",wins,winPercent);
    }
}
