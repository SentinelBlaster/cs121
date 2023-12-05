package weekThree;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        Double numOne = Double.parseDouble(JOptionPane.showInputDialog("Please enter the first number"));
        Double numTwo = Double.parseDouble(JOptionPane.showInputDialog("Please enter the second number"));
        Double numThree = Double.parseDouble(JOptionPane.showInputDialog("Please enter the third number"));

        if ((numOne.equals(numTwo))  && (numTwo.equals(numThree))) {
            JOptionPane.showMessageDialog(null, "This triangle is an equilateral triangle");
        } else if ((numOne.equals(numTwo)) || (numOne.equals(numThree)) || (numTwo.equals(numThree))) {
            JOptionPane.showMessageDialog(null, "This triangle is an isosceles triangle");
        } else {
            JOptionPane.showMessageDialog(null, "This triangle is a scalene triangle");
        }

    }
}
