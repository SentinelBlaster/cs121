package weekFour.loopsActivities;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        //Set up
        Scanner console = new Scanner(System.in);

        //requesting loop info
        System.out.println("Please enter number of students:");
        int numStudents = Integer.parseInt(console.nextLine());
        System.out.println("Please enter number of tests each student took:");
        int numTest = Integer.parseInt(console.nextLine());

        System.out.println(" ");

        //loop
        for(int i = 0;i<numStudents;i++){
            System.out.printf("Student number %d%n-----------------%n",i+1);
            int testScores = 0;
            for (int j = 0;j<numTest;j++){
                System.out.printf("Please enter score %d%n",j+1);
                testScores = testScores+Integer.parseInt(console.nextLine());
            }
            //output
            Double testAvg = (double)testScores/numTest;
            System.out.printf("The average score for student %d is %.2f percent.%n%n",i+1,testAvg);

        }
    }
}
