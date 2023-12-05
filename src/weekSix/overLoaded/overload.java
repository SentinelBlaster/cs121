package weekSix.overLoaded;

public class overload {
    int testOne, testTwo, testThree, testFour;

    public overload(){
        this.testOne = 1;
        this.testTwo = 2;
        this.testThree = 3;
        this.testFour = 4;
    }

    public overload(int testingOne){
        this.testOne = testingOne;
    }

    public  overload(int testingOne, int testingTwo, int testingThree, int testingFour){
        this.testOne = testingOne;
        this.testTwo = testingTwo;
        this.testThree = testingThree;
        this.testFour = testingFour;
    }

    public int getTestOne() {
        return testOne;
    }

    public int getTestTwo() {
        return testTwo;
    }

    public int getTestThree() {
        return testThree;
    }

    public int getTestFour() {
        return testFour;
    }

    public void setTestOne(int testOne) {
        this.testOne = testOne;
    }

    public void setTestTwo(int testTwo) {
        this.testTwo = testTwo;
    }

    public void setTestThree(int testThree) {
        this.testThree = testThree;
    }

    public void setTestFour(int testFour) {
        this.testFour = testFour;
    }

    public void setTestFour(int testFour, String testing) {
        this.testFour = testFour;
        System.out.println(testing);
    }

}
