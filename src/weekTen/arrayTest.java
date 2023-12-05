package weekTen;

public class arrayTest {
    public static void main(String[] args) {
        StringArrayList names = new StringArrayList();
        names.addName("John");
        names.addName("Katherine");
        names.addName("Jennifer");
        names.addName("Brisco");
        System.out.printf("Number of names: %d%n",names.numOfNames());
        names.displayForEach();
        System.out.println(names.getName(3));
        names.removeName("Brisco");
        names.addName("Comet");
        names.displayFor();
    }
}
