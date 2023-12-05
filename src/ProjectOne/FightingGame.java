package ProjectOne;

import java.util.Random;
import java.util.Scanner;

public class FightingGame {
    public static void main(String[] args) {
        //Initialize
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        int playerOneScore = 0;
        int playerTwoScore = 0;

        //Player One
        System.out.println("Please enter character one role:");
        String roleOne = console.nextLine();
        System.out.println("Please enter HP:");
        int hpOne = Integer.parseInt(console.nextLine());
        System.out.println("Please enter attack one name:");
        String attackOneOne = console.nextLine();
        System.out.println("Please enter attack one damage:");
        int damageOneOne = Integer.parseInt(console.next());
        System.out.println("Please enter attack one speed:");
        int speedOneOne = Integer.parseInt(console.next());
        System.out.println("Please enter attack two name:");
        String attackOneTwo = console.next();
        System.out.println("Please enter attack two damage:");
        int damageOneTwo = Integer.parseInt(console.next());
        System.out.println("Please enter attack two speed:");
        int speedOneTwo = Integer.parseInt(console.next());
        charAssignment playerOne = new charAssignment(roleOne, hpOne, attackOneOne, damageOneOne, speedOneOne, attackOneTwo, damageOneTwo, speedOneTwo);

        //this next line has to be here to work. I don't know why
        String testing = console.nextLine();
        System.out.println("============================");

        //Player Two
        System.out.println("Please enter character two role:");
        String roleTwo = console.nextLine();
        System.out.println("Please enter HP:");
        int hpTwo = Integer.parseInt(console.nextLine());
        System.out.println("Please enter attack one name:");
        String attackTwoOne = console.nextLine();
        System.out.println("Please enter attack one damage:");
        int damageTwoOne = Integer.parseInt(console.next());
        System.out.println("Please enter attack one speed:");
        int speedTwoOne = Integer.parseInt(console.next());
        System.out.println("Please enter attack two name:");
        String attackTwoTwo = console.next();
        System.out.println("Please enter attack two damage:");
        int damageTwoTwo = Integer.parseInt(console.next());
        System.out.println("Please enter attack two speed:");
        int speedTwoTwo = Integer.parseInt(console.next());
        charAssignment playerTwo = new charAssignment(roleTwo, hpTwo, attackTwoOne, damageTwoOne, speedTwoOne, attackTwoTwo, damageTwoTwo, speedTwoTwo);

        //see above
        String testingTwo = console.nextLine();
        System.out.println("============================");

        //game loop set up
        System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(console.nextLine());
        if (rounds%2 == 0){
            rounds += 1;
        }
        int round = 0;
        boolean playingRound = true;
        //game loop
        while (round <= rounds) {
            System.out.println("============================");
            System.out.printf("Round %d of %d%nPlayer One Score: %d%nPlayer Two Score %d%n",round,rounds,playerOneScore,playerTwoScore);
            System.out.println("============================");
            while (playingRound) {
                //display current health
                int playerOneHealth = playerOne.calcDamage(0);
                int playerTwoHealth = playerTwo.calcDamage(0);
                System.out.printf("Player one health: %d%nPlayer two health: %d%n",playerOneHealth,playerTwoHealth);

                System.out.println("============================");

                System.out.printf("Player One: %s%n",roleOne);
                int choiceOne = playerOne.chooseAttack();
                int attackOneDamage = playerOne.getAttackDamage(choiceOne);
                int attackOneSpeed = playerOne.getAttackSpeed(choiceOne);

                System.out.println("============================");

                System.out.printf("Player Two: %s%n",roleTwo);
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
                    }
                    int healthOne = playerOne.calcDamage(attackTwoDamage);
                    if (healthOne <= 0) {
                        System.out.println("Player Two wins!");
                        playerTwoScore += 1;
                        playingRound = false;
                    }
                } else{
                    int healthOne = playerOne.calcDamage(attackTwoDamage);
                    if (healthOne <= 0) {
                        System.out.println("Player Two wins!");
                        playerTwoScore += 1;
                        playingRound = false;
                    }
                    int healthTwo = playerTwo.calcDamage(attackOneDamage);
                    if (healthTwo <= 0) {
                        System.out.println("Player One wins!");
                        playerOneScore += 1;
                        playingRound = false;
                    }
                }
            }
            round += 1;
        }
        System.out.println("============================");
        System.out.println("Game Complete");
        System.out.println("============================");
        if (playerOneScore > playerTwoScore){
            System.out.println("Player One wins!");
        } else{
            System.out.println("Player Two wins!");;
        }
        System.out.printf("Final Score: %d%nPlayer Two Score %d%n",playerOneScore,playerTwoScore);

    }
}
