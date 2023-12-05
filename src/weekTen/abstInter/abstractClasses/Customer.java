package weekTen.abstInter.abstractClasses;

import weekTen.abstInter.abstractClasses.interfaces.UserInteractable;

//extend the user class
public class Customer extends User implements UserInteractable {
    private int loyaltyPoints;
    private String favTheater;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String username, String password, int loyaltyPoints, String favTheater) {
        super(firstName, lastName, username, password);
        this.loyaltyPoints = loyaltyPoints;
        this.favTheater = favTheater;
    }

    @Override
    public void displayAccountInfo(){
        System.out.printf("Name: %s, %s%nUser Name %s%nPassword: %s%nLoyalty Points: %d%nFavorite Theater: %s%n", lastName,firstName,username,password,loyaltyPoints,favTheater);
    }
    @Override
    public void testingmethod() {
        System.out.println("Test Print for Customer");
    }

}
