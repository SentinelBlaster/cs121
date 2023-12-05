package activityTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        //Instance of file
        File file = new File("dndClass.txt"); //relative path
        //OR
        //File file2 = new File("C:\\Users\\jpfai\\IdeaProjects\\cs121\\courses.txt");

        //Reading file
        try {
            Scanner scanner = new Scanner(file);
            //String header = scanner.nextLine();
            //System.out.println(header);
            while (scanner.hasNextLine()){
                /*String Line = scanner.nextLine();
                System.out.println(Line);*/
                String classType = scanner.next();
                String abilityScore = scanner.next();
                String attackType = scanner.next();
                System.out.printf("%-7s %3s %14s\n",classType,abilityScore,attackType);
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("FILE NOT FOUND");
        }

    }
}
