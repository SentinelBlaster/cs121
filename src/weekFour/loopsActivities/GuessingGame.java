package weekFour.loopsActivities;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        //Set up
        Random random = new Random();
        int num = random.nextInt(101);
        Boolean stillPlaying = true;
        Scanner console = new Scanner(System.in);


        //Game loop
        while (stillPlaying){
            System.out.println("Please enter a number between 1 and 100. You may enter 'q' to quit.");
            String input = console.nextLine();
            if (input.toLowerCase().equals("q")) {
                System.out.println("Thanks for playing!");
                stillPlaying = false;
            } else{
                int guess = Integer.parseInt(input);
                if (guess == num) {
                    System.out.println("Congratulations! You got it right!");
                    stillPlaying = false;
                } else if (guess > num) {
                    System.out.println("You guessed too high. Please try again.\n");
                } else if (guess < num) {
                    System.out.println("You guessed too low. Please try again.\n");
                }
            }
        }



    }
}
