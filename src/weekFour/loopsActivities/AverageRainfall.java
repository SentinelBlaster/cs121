package weekFour.loopsActivities;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double totalRainfall = 0.0;
        int numMonths = 0;

        System.out.println("Please enter the number of years.");
        int numYears = Integer.parseInt(console.nextLine());
        System.out.println(" ");

        for (int i = 1;i<=numYears;i++){
            for (int j =1; j<=12;j++){
                System.out.printf("Please enter rainfall for year %d month %d.%n",i,j);
                Double rainInMonth = Double.parseDouble(console.nextLine());
                totalRainfall = totalRainfall + rainInMonth;
                numMonths++;
            }
        }
        Double avgRain = totalRainfall/numMonths;
        System.out.printf("%n---------------------------%n");
        System.out.println("Number of Months: "+numMonths);
        System.out.printf("Total Rainfall: %.2f in. %n",totalRainfall);
        System.out.printf("Average Rainfall: %.2f in. %n",avgRain);
        System.out.printf("%n---------------------------%n");

    }
}
