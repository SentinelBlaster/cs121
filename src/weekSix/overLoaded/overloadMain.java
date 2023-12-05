package weekSix.overLoaded;

public class overloadMain {
    public static void main(String[] args) {

        overload overload = new overload();
        overload overloadOne = new overload(5);
        overload overloadTwo = new overload(6,7,8,9);

        System.out.println(overload.getTestFour());
        overload.setTestFour(10);
        System.out.println(overload.getTestFour());

        System.out.println(overloadOne.getTestTwo());
        overloadOne.setTestTwo(11);
        System.out.println(overloadOne.getTestTwo());

        System.out.println(overloadTwo.getTestFour());
        overloadTwo.setTestFour(12,"This is the test string.");
        System.out.println(overloadTwo.getTestFour());
    }
}
