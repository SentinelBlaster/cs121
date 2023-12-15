package ProjectTwo;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

//Code that you can tell hasn't been taught in this class was found at:
//https://www.youtube.com/watch?v=Ek6HFMNi3fs&list=PLrqwM2iFaguj8s35Icp3vDcLnlzmR3GUA&index=12 (readCol)
//https://www.youtube.com/watch?v=bIjMDpspzog&list=PLrqwM2iFaguj8s35Icp3vDcLnlzmR3GUA&index=2 (The searching in the beginning)

public class FightingProjectTwo {
    public static void main(String[] args){
        //Initialize
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        RoleSelector roleSelectorA = new RoleSelector();
        RoleSelector roleSelectorB = new RoleSelector();


        int playerOneScore = 0;
        int playerTwoScore = 0;
        roleSelectorA.roleDisplay();

        System.out.println("============================");
        System.out.println("Player One, please choose a role:");
        String choiceone = console.nextLine();

        roleSelectorA.choseRole(choiceone);

        charAssignmentProjectTwo playerOne = new charAssignmentProjectTwo(roleSelectorA.getRole(), roleSelectorA.getHp(),
                roleSelectorA.getAttackOneName(), roleSelectorA.getAttackOneDamage(), roleSelectorA.getAttackOneSpeed(),
                roleSelectorA.getAttackTwoName(), roleSelectorA.getAttackTwoDamage(), roleSelectorA.getAttackTwoSpeed());


        System.out.println("============================");

        System.out.println("============================");
        System.out.println("Player Two, please choose a role:");
        String choicetwo = console.nextLine();
        roleSelectorB.choseRole(choicetwo);
        charAssignmentProjectTwo playerTwo = new charAssignmentProjectTwo(roleSelectorB.getRole(), roleSelectorB.getHp(),
                roleSelectorB.getAttackOneName(), roleSelectorB.getAttackOneDamage(), roleSelectorB.getAttackOneSpeed(),
                roleSelectorB.getAttackTwoName(), roleSelectorB.getAttackTwoDamage(), roleSelectorB.getAttackTwoSpeed());
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
                System.out.printf("Player One: %s%n", roleSelectorA.getRole());
                int choiceOne = playerOne.chooseAttack();
                int attackOneDamage = playerOne.getAttackDamage(choiceOne);
                int attackOneSpeed = playerOne.getAttackSpeed(choiceOne);
                 System.out.println("============================");

                 System.out.printf("Player Two: %s%n", roleSelectorB.getRole());
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
    }
}
