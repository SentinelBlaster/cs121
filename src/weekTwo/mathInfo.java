package weekTwo;

import java.util.Scanner;

public class mathInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second number: ");
        int numTwo = Integer.parseInt(console.nextLine());

        //Addition
        int add = (numOne+numTwo);
        System.out.printf("%d + %d = %d%n", numOne,numTwo,add);

        //Subtraction
        int sub = (numOne-numTwo);
        System.out.printf("%d - %d = %d%n", numOne,numTwo,sub);


        //Multiplication
        int mult = (numOne*numTwo);
        System.out.printf("%d * %d = %d%n", numOne,numTwo,mult);


        //Division
        int div = (numOne/numTwo);
        System.out.printf("%d / %d = %d%n", numOne,numTwo,div);

        //Square Root
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f", numOne, sqrt1);

        double sqrt2 = Math.sqrt(numTwo);
        System.out.printf("The square root of %d is %.2f", numTwo, sqrt2);

        //Power
        double power1 = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d amd %d is %.2f", numOne,numTwo,power1);

        double power2 = Math.pow(numTwo, numOne);
        System.out.printf("The power of %d amd %d is %.2f", numTwo,numOne,power2);

        //logarithm
        double log1 = Math.log(numOne);
        System.out.printf("The log of %d is %.2f", numOne, log1);

        //math.abs()
        //math.max
        //math.min
        //math.round

    }


}
