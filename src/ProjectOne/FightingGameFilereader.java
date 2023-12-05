package ProjectOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//Code that you can tell hasn't been taught in this class was found at:
//https://www.youtube.com/watch?v=Ek6HFMNi3fs&list=PLrqwM2iFaguj8s35Icp3vDcLnlzmR3GUA&index=12 (readCol)
//https://www.youtube.com/watch?v=bIjMDpspzog&list=PLrqwM2iFaguj8s35Icp3vDcLnlzmR3GUA&index=2 (The searching in the beginning)

public class FightingGameFilereader {
    public static void main(String[] args) throws FileNotFoundException {
        //Initialize
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        int playerOneScore = 0;
        int playerTwoScore = 0;
        String pathname = "C:\\Users\\jpfai\\IdeaProjects\\cs121\\src\\ProjectOne\\char.txt";

        System.out.println("Roles:");
        String roles = readCol(0, pathname, " ");
        System.out.println(roles);
        System.out.println("Please make sure to type the role you want exactly.");


        System.out.println("============================");
        System.out.println("Player One, please choose a role:");
        String choiceone = console.nextLine();

        boolean foundOne = false;
        String role1 = "";
        String hp1 = "";
        String attackOneName1 = "";
        String attackOneDamage1 = "";
        String attackOneSpeed1 = "";
        String attackTwoName1 = "";
        String attackTwoSpeed1 = "";
        String attackTwoDamage1 = "";
        try {
            Scanner x = new Scanner(new File(pathname));

            while (x.hasNext() && !foundOne) {
                role1 = x.next();
                hp1 = x.next();
                attackOneName1 = x.next();
                attackOneDamage1 = x.next();
                attackOneSpeed1 = x.next();
                attackTwoName1 = x.next();
                attackTwoDamage1 = x.next();
                attackTwoSpeed1 = x.next();

                if (role1.equals(choiceone)) {
                    foundOne = true;
                }
            }
            String roleOne = null;int hpOne = 0;String attackOneOne = null;
            int damageOneOne = 0;int speedOneOne = 0;String attackOneTwo = null;
            int damageOneTwo = 0;int speedOneTwo = 0;
            if (foundOne) {
                roleOne = role1;
                hpOne = Integer.parseInt(hp1);
                attackOneOne = attackOneName1;
                damageOneOne = Integer.parseInt(attackOneDamage1);
                speedOneOne = Integer.parseInt(attackOneSpeed1);
                attackOneTwo = attackTwoName1;
                damageOneTwo = Integer.parseInt(attackTwoDamage1);
                speedOneTwo = Integer.parseInt(attackTwoSpeed1);

            }
            charAssignment playerOne = new charAssignment(roleOne, hpOne, attackOneOne, damageOneOne, speedOneOne, attackOneTwo, damageOneTwo, speedOneTwo);


            System.out.println("============================");

            System.out.println("============================");
            System.out.println("Player Two, please choose a role:");
            String choicetwo = console.nextLine();

            boolean foundTwo = false;
            String role2 = "";
            String hp2 = "";
            String attackOneName2 = "";
            String attackOneDamage2 = "";
            String attackOneSpeed2 = "";
            String attackTwoName2 = "";
            String attackTwoSpeed2 = "";
            String attackTwoDamage2 = "";
            try {
                Scanner y = new Scanner(new File(pathname));

                while (y.hasNext() && !foundTwo) {
                    role2 = y.next();
                    hp2 = y.next();
                    attackOneName2 = y.next();
                    attackOneDamage2 = y.next();
                    attackOneSpeed2 = y.next();
                    attackTwoName2 = y.next();
                    attackTwoDamage2 = y.next();
                    attackTwoSpeed2 = y.next();


                    if (role2.equals(choicetwo)) {
                        foundTwo = true;
                    }
                }
                String roleTwo = null;
                int hpTwo = 0;
                String attackTwoOne = null;
                int damageTwoOne = 0;
                int speedTwoOne = 0;
                String attackTwoTwo = null;
                int damageTwoTwo = 0;
                int speedTwoTwo = 0;
                if (foundOne) {
                    roleTwo = role2;
                    hpTwo = Integer.parseInt(hp2);
                    attackTwoOne = attackOneName2;
                    damageTwoOne = Integer.parseInt(attackOneDamage2);
                    speedTwoOne = Integer.parseInt(attackOneSpeed2);
                    attackTwoTwo = attackTwoName2;
                    damageTwoTwo = Integer.parseInt(attackTwoDamage2);
                    speedTwoTwo = Integer.parseInt(attackTwoSpeed2);

                }
                charAssignment playerTwo = new charAssignment(roleTwo, hpTwo, attackTwoOne, damageTwoOne, speedTwoOne, attackTwoTwo, damageTwoTwo, speedTwoTwo);
                System.out.println("============================");

                //game loop set up
                System.out.println("How many rounds would you like to play?");
                int rounds = Integer.parseInt(console.nextLine());
                if (rounds % 2 == 0) {
                    rounds += 1;
                }
                int round = 1;
                boolean playingRound = true;
                //game loop
                while (round <= rounds) {
                    System.out.println("============================");
                    System.out.printf("Round %d of %d%nPlayer One Score: %d%nPlayer Two Score %d%n", round, rounds, playerOneScore, playerTwoScore);
                    System.out.println("============================");
                    while (playingRound) {
                        //display current health
                        int playerOneHealth = playerOne.calcDamage(0);
                        int playerTwoHealth = playerTwo.calcDamage(0);
                        System.out.printf("Player one health: %d%nPlayer two health: %d%n", playerOneHealth, playerTwoHealth);

                        System.out.println("============================");

                        System.out.printf("Player One: %s%n", roleOne);
                        int choiceOne = playerOne.chooseAttack();
                        int attackOneDamage = playerOne.getAttackDamage(choiceOne);
                        int attackOneSpeed = playerOne.getAttackSpeed(choiceOne);

                        System.out.println("============================");

                        System.out.printf("Player Two: %s%n", roleTwo);
                        int choiceTwo = playerTwo.chooseAttack();
                        int attackTwoDamage = playerTwo.getAttackDamage(choiceTwo);
                        int attackTwoSpeed = playerTwo.getAttackSpeed(choiceTwo);

                        //makes sure that the speeds are not equal
                        while (attackOneSpeed == attackTwoSpeed) {
                            attackOneSpeed = random.nextInt(9);
                            attackTwoSpeed = random.nextInt(9);
                        }
                        System.out.println("============================");

                        if (attackOneSpeed > attackTwoSpeed) {
                            int healthTwo = playerTwo.calcDamage(attackOneDamage);
                            if (healthTwo <= 0) {
                                System.out.println("Player One wins!");
                                playerOneScore += 1;
                                playingRound = false;
                            } else {
                                int healthOne = playerOne.calcDamage(attackTwoDamage);
                                if (healthOne <= 0) {
                                    System.out.println("Player Two wins!");
                                    playerTwoScore += 1;
                                    playingRound = false;
                                }
                            }
                        } else {
                            int healthOne = playerOne.calcDamage(attackTwoDamage);
                            if (healthOne <= 0) {
                                System.out.println("Player Two wins!");
                                playerTwoScore += 1;
                                playingRound = false;
                            }else {
                                int healthTwo = playerTwo.calcDamage(attackOneDamage);
                                if (healthTwo <= 0) {
                                    System.out.println("Player One wins!");
                                    playerOneScore += 1;
                                    playingRound = false;
                                }
                            }
                        }
                    }
                    round += 1;
                    playerOne.resetHealth();
                    playerTwo.resetHealth();
                    playingRound = true;
                }
                System.out.println("============================");
                System.out.println("Game Complete");
                System.out.println("============================");
                if (playerOneScore > playerTwoScore) {
                    System.out.println("Player One wins!");
                } else {
                    System.out.println("Player Two wins!");
                }
                System.out.printf("Final Score:%nPlayer One Score: %d%nPlayer Two Score: %d%n", playerOneScore, playerTwoScore);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readCol(int col, String filepath, String deliminiter){
        String[] data;
        String currentLine;
        ArrayList<String> colData = new ArrayList<String>();
        try{
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            while((currentLine = br.readLine()) != null){
                data = currentLine.split(deliminiter);
                colData.add(data[col]);
            }
        }
        catch (Exception e){
            return null;
        }
        colData.remove(0);
        return colData.toString();
    }
}
