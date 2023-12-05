package weekTen.abstInter.abstractClasses;

public class testAbstract {
    public static void main(String[] args) {

        Customer Katie = new Customer("Katie", "Smith", "Astrocat", "test123", 12575, "Franklin's on Main");
        Staff John = new Staff("John", "Fait", "SentinelBlaster", "AutobotCity", "Cashier", 17.50);

        Katie.displayAccountInfo();
        John.displayAccountInfo();
        John.testingmethod();
        Katie.testingmethod();
    }
}
