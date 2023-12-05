package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        //Instance of file
        File file = new File("courses.txt"); //relative path
        //OR
        //File file2 = new File("C:\\Users\\jpfai\\IdeaProjects\\cs121\\courses.txt");

        //Reading file
        try {
            Scanner scanner = new Scanner(file);
            String header = scanner.nextLine();
            while (scanner.hasNextLine()){
                /*String Line = scanner.nextLine();
                System.out.println(Line);*/
                String course = scanner.next();
                int credits = Integer.parseInt(scanner.next());
                int score = Integer.parseInt(scanner.next());
                System.out.printf("%-7s %3d %7d\n",course,credits,score);
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("FILE NOT FOUND");
        }

    }
}
