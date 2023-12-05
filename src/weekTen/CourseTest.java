package weekTen;

import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CourseInfo courseInfo = new CourseInfo();

        while(true){
            System.out.println("Enter course or 'q' to quit: ");
            String input = console.nextLine();
            if(input.equals("q")){
                System.out.println("You have finished enter courses and decided to quit");
                break;
            }else {
                courseInfo.addName(input);
                System.out.println("Enter GPA:");
                courseInfo.addGPA(Double.parseDouble(console.nextLine()));
                System.out.println("Enter Score");
                courseInfo.addScores(Integer.parseInt(console.nextLine()));
                System.out.println("Add Letter Grade");
                courseInfo.addLetterGrade(console.next().charAt(0));
                console.nextLine();
            }
        }
        //display
        courseInfo.displayCourses();
    }
}
