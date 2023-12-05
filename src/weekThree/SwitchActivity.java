package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String house = JOptionPane.showInputDialog("Please chose Gryffindor, Hufflepuff, Ravenclaw, or Slytherin");
        String info = switch (house){
            case "Gryffindor" -> "The house of the brave, symbolised by a lion.";
            case "Hufflepuff" -> "The house of the loyal, symbolised by a badger.";
            case "Ravenclaw" -> "The house of the smart, symbolised by an eagle.";
            case "Slytherin" -> "The house of the cunning, symbolised by a snake.";
            default -> "You may have misspelled the house. Please try again, typing your answer as you see it.";
        };

        JOptionPane.showMessageDialog(null, info);

    }
}
