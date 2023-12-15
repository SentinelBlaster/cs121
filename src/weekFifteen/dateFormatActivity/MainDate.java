package weekFifteen.dateFormatActivity;

import java.util.Scanner;

public class MainDate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TotalCalories totalCalories = new TotalCalories();

        System.out.println("Please enter the number of calories per day: ");
        int dailyCal = Integer.parseInt(console.nextLine());
        System.out.println("Please enter the starting day in the MM/dd/yyy format: ");
        String startDate = console.nextLine();
        System.out.println("Please enter the ending day in the MM/dd/yyy format: ");
        String endDate = console.next();

        System.out.printf("You will consume %d calories during the diet.",totalCalories.calcCalories(dailyCal,startDate,endDate));
    }
}
