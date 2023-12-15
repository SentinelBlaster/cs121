package ProjectTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RoleSelector {
    private String pathname = "C:\\Users\\jpfai\\IdeaProjects\\cs121\\src\\ProjectTwo\\char.txt";

    ArrayList<String> searchInfo = new ArrayList<>(8);
    private String roleOne = null; private int hpOne = 0; private String attackOneOne = null; private int damageOneOne = 0;
    private int speedOneOne = 0; private String attackOneTwo = null; private int damageOneTwo = 0;
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
                //this.role = x.next();
                searchInfo.set(0,x.next());
                searchInfo.set(1,x.next());
                searchInfo.set(2,x.next());
                searchInfo.set(3,x.next());
                searchInfo.set(4,x.next());
                searchInfo.set(5,x.next());
                searchInfo.set(6,x.next());
                searchInfo.set(7,x.next());

                if (searchInfo.get(0).equals(choice)) {
                    foundOne = true;
                }
            }
            if (foundOne) {
                this.roleOne = searchInfo.get(0);
                this.hpOne = Integer.parseInt(searchInfo.get(1));
                this.attackOneOne = searchInfo.get(2);
                this.damageOneOne = Integer.parseInt(searchInfo.get(3));
                this.speedOneOne = Integer.parseInt(searchInfo.get(4));
                this.attackOneTwo = searchInfo.get(5);
                this.damageOneTwo = Integer.parseInt(searchInfo.get(6));
                this.speedOneTwo = Integer.parseInt(searchInfo.get(7));

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getRole() {
        return roleOne;
    }

    public int getHp() {
        return hpOne;
    }

    public String getAttackOneName() {
        return attackOneOne;
    }

    public int getAttackOneDamage() {
        return damageOneOne;
    }

    public int getAttackOneSpeed() {
        return speedOneOne;
    }

    public String getAttackTwoName() {
        return attackOneTwo;
    }

    public int getAttackTwoSpeed() {
        return speedOneTwo;
    }

    public int getAttackTwoDamage() {
        return damageOneTwo;
    }
}
