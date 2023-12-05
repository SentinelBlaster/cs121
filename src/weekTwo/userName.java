package weekTwo;

import javax.swing.*;

public class userName {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        StringBuilder nameReverse = new StringBuilder(name);
        nameReverse.reverse();

        String nameOut = String.format("%s%n %s%n %s%n %s%n", name, nameUpper, nameLower, nameReverse);
        JOptionPane.showMessageDialog(null,nameOut);

    }
}
