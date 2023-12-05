package ProjectOne;

import java.util.Scanner;

public class charAssignment {
    Scanner console = new Scanner(System.in);
    String role, attackOneName, attackTwoName;
    int hitPoints, hpMax, attackOneDamage, attackOneSpeed, attackTwoDamage, attackTwoSpeed;

    //constructor
    public charAssignment(String role, int hitPoints, String attackOneName, int attackOneDamage, int attackOneSpeed, String attackTwoName, int attackTwoDamage, int attackTwoSpeed){
        this.role = role;
        this.hitPoints = hitPoints;
        this.hpMax = hitPoints;
        this.attackOneName = attackOneName;
        this.attackOneDamage = attackOneDamage;
        this.attackOneSpeed = attackOneSpeed;
        this.attackTwoName = attackTwoName;
        this.attackTwoDamage = attackTwoDamage;
        this.attackTwoSpeed = attackTwoSpeed;
    }

    public int getAttackDamage(int attackNum){
        if (attackNum == 1){
            return attackOneDamage;
        } else if (attackNum == 2) {
            return attackTwoDamage;
        } else{
            System.out.println("ERROR: attack damage getter");
            return attackNum;
        }
    }

    public int getAttackSpeed(int attackNum){
        if (attackNum == 1){
            return attackOneSpeed;
        } else if (attackNum == 2) {
            return attackTwoSpeed;
        } else{
            System.out.println("ERROR: attack speed getter");
            return attackNum;
        }
    }

    public int calcDamage(int damage){
        hitPoints = hitPoints - damage;
        return hitPoints;
    }

    public int chooseAttack(){
        System.out.printf("Please select an attack:%n1. %s 2. %s%n",attackOneName,attackTwoName);
        int choice = Integer.parseInt(console.nextLine());
        if (choice == 1){
            return 1;
        } else if (choice == 2) {
            return 2;
        } else {
            System.out.println("ERROR: attack chooser");
            return 0;
        }
    }

    public void resetHealth(){
        hitPoints = hpMax;
    }
}
