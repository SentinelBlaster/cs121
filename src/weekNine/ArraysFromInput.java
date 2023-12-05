package weekNine;

import java.util.Scanner;

public class ArraysFromInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numInList = 3;

        String[] usernames = new String[numInList];
        String[] gameTitle = new String[numInList];
        int[] level = new int[3];

        for (int i = 0; i<numInList;i++){
            System.out.println("Username:");
            usernames[i] = console.nextLine();
            System.out.println("Game Title:");
            gameTitle[i] = console.nextLine();
            System.out.println("Level:");
            level[i] = Integer.parseInt(console.nextLine());
        }

        System.out.printf("%-14s %s %14s\n", "Username", "Game", "Level");

        for (int i = 0; i <usernames.length; i++){
            System.out.printf("%-14s %s %14s\n", usernames[i], gameTitle[i], level[i]);
        }
        console.close();
    }
}
