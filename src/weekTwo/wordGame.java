package weekTwo;

import javax.swing.*;

public class wordGame {
    public static void main(String[] args) {

        //Innitialize variables
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        String city = JOptionPane.showInputDialog("Please enter your hometown: ");
        String college = JOptionPane.showInputDialog("Please enter your college: ");
        String major = JOptionPane.showInputDialog("Please enter your major: ");
        String animal = JOptionPane.showInputDialog("Please enter a type of animal: ");
        String petName = JOptionPane.showInputDialog("Please enter the name of a pet: ");

        //Generate text
        String outputText = String.format("There once was a person named %s who lived in %s." +
                " %n At the age of %d, %s went to college at %s. %n %s graduated with a %s. " +
                "Then, %s adopted a(n) %s named %s. %n They both lived happily ever after!",
                name, city, age, name, college, name, major, name, animal, petName);

        //Display text
        JOptionPane.showMessageDialog(null, outputText);

    }
}
