package weekTwo;

import javax.swing.*;

public class stringsDialog {
    public static void main(String[] args) {
        //Strings
        String name = "John";
        //.concat()
        name = name.concat(" Fait");

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.replace("John","SentinelBlaster"));
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,6));


        String fName = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "You entered: "+ fName);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You entered: "+ age);

        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Please enter your GPA: "));
        JOptionPane.showMessageDialog(null, "You entered: "+ gpa);

    }
}
