package activityTen;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("dndClass.txt");
        PrintWriter output = new PrintWriter(outputFile);

        //variabbles
        String classType, abilityScore, attackType;
        output.printf("%s %s %s\n","Class","Ability","Role");
        int numEntry = Integer.parseInt(JOptionPane.showInputDialog("How many classes would you like to enter?"));
        for(int i = 1; i <=numEntry;i++){
            classType  = JOptionPane.showInputDialog(String.format("Enter name of class %d", i));
            abilityScore = JOptionPane.showInputDialog("Enter the main ability score");
            attackType = JOptionPane.showInputDialog("Enter their role in the party");

            output.printf("%s %s %s",classType,abilityScore,attackType);
            if (i != numEntry){
                output.printf("\n");
            }
        }

        output.close();
    }
}
