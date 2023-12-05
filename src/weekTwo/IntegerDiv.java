package weekTwo;

import java.awt.*;
import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {
        //concole input
        //scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = keyboard.nextLine();

        System.out.println(firstName);

        System.out.println("What is your age?");
        //int age = keyboard.nextInt(); //this does work
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);

        System.out.println("What was you GPA last year?");
        double gpa = Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);



        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne/numTwo;
        System.out.println(results);

        double testing = (double) numOne;
        int testing2 = (int) results;
        double testing3 = (double) testing2;

        System.out.println(testing3);
    }
}
