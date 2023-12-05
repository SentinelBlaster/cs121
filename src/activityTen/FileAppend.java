package activityTen;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("dndClass.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String classType  = JOptionPane.showInputDialog("Enter name of class to be added");
            String abilityScore = JOptionPane.showInputDialog("Enter the main ability score");
            String attackType = JOptionPane.showInputDialog("Enter their role in the party");

            printWriter.printf("%n%s %s %s",classType,abilityScore,attackType);

            fileWriter.close();
            printWriter.close();
    } catch (FileNotFoundException e){
            System.err.println("FILE ISSUE");
        }

        }
}
