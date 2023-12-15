package ProjectTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RoleSelector {
    Scanner console = new Scanner(System.in);
    private String pathname = "C:\\Users\\jpfai\\IdeaProjects\\cs121\\src\\ProjectTwo\\char.txt";
    private String role;
    private String hp;
    private String attackOneName;
    private String attackOneDamage;
    private String attackOneSpeed;
    private String attackTwoName;
    private String attackTwoSpeed;
    private String attackTwoDamage;

    private String roleOne = null;
    private int hpOne = 0;
    private String attackOneOne = null;
    private int damageOneOne = 0;
    private int speedOneOne = 0;
    private String attackOneTwo = null;
    private int damageOneTwo = 0;
    private int speedOneTwo = 0;



    public static String readCol(int col, String filepath, String deliminiter) {
        String[] data;
        String currentLine;
        ArrayList<String> colData = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(deliminiter);
                colData.add(data[col]);
            }
        } catch (Exception e) {
            return null;
        }
        colData.remove(0);
        return colData.toString();
    }

    public void roleDisplay() {
        System.out.println("Roles:");
        String roles = readCol(0, pathname, " ");
        System.out.println(roles);
        System.out.println("Please make sure to type the role you want exactly.");

    }

    public void choseRole(String choice) {
        boolean foundOne = false;
        try {
            Scanner x = new Scanner(new File(pathname));

            while (x.hasNext() && !foundOne) {
                this.role = x.next();
                this.hp = x.next();
                this.attackOneName = x.next();
                this.attackOneDamage = x.next();
                this.attackOneSpeed = x.next();
                this.attackTwoName = x.next();
                this.attackTwoDamage = x.next();
                this.attackTwoSpeed = x.next();

                if (role.equals(choice)) {
                    foundOne = true;
                }
            }
            if (foundOne) {
                this.roleOne = role;
                this.hpOne = Integer.parseInt(hp);
                this.attackOneOne = attackOneName;
                this.damageOneOne = Integer.parseInt(attackOneDamage);
                this.speedOneOne = Integer.parseInt(attackOneSpeed);
                this.attackOneTwo = attackTwoName;
                this.damageOneTwo = Integer.parseInt(attackTwoDamage);
                this.speedOneTwo = Integer.parseInt(attackTwoSpeed);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getRole() {
        return role;
    }

    public int getHp() {
        return Integer.parseInt(hp);
    }

    public String getAttackOneName() {
        return attackOneName;
    }

    public int getAttackOneDamage() {
        return Integer.parseInt(attackOneDamage);
    }

    public int getAttackOneSpeed() {
        return Integer.parseInt(attackOneSpeed);
    }

    public String getAttackTwoName() {
        return attackTwoName;
    }

    public int getAttackTwoSpeed() {
        return Integer.parseInt(attackTwoSpeed);
    }

    public int getAttackTwoDamage() {
        return Integer.parseInt(attackTwoDamage);
    }
}
