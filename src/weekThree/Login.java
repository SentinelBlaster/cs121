package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String userName = "jfait24";
        String password = "iLikeDogs";

        String userInput = JOptionPane.showInputDialog("Please enter your Username");
        String passInput = JOptionPane.showInputDialog("Please enter your Password");

        if (!userName.equals(userInput) && password.equals(passInput)){
            JOptionPane.showMessageDialog(null,"Your username is incorrect");
        } else if (userName.equals(userInput) && !password.equals(passInput)) {
            JOptionPane.showMessageDialog(null,"Your password is incorrect");
        } else if (!userName.equals(userInput) && !password.equals(passInput)) {
            JOptionPane.showMessageDialog(null,"No credential are correct");
        } else {
            JOptionPane.showMessageDialog(null,"Welcome to  CS121");
        }
    }
}
