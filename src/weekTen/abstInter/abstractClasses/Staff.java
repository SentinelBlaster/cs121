package weekTen.abstInter.abstractClasses;

import weekTen.abstInter.abstractClasses.interfaces.UserInteractable;

//extend the user class
public class Staff extends User implements UserInteractable {
    private String position;
    private double hourlyWage;

    public Staff() {
    }

    public Staff(String firstName, String lastName, String username, String password, String position, double hourlyWage) {
        super(firstName, lastName, username, password);
        this.position = position;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void displayAccountInfo(){
        System.out.printf("Name: %s, %s%nUser Name %s%nPassword: %s%nPosition: %s%nHourly Wage: %.2f%n", lastName,firstName,username,password,position,hourlyWage);
    }

    @Override
    public void testingmethod() {
        System.out.println("Test Print for Staff");
    }
}
