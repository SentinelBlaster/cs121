package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your a number: ");
        Integer num = Integer.parseInt(console.nextLine());

        String answer = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + answer);
    }
}
