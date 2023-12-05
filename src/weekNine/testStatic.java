package weekNine;

public class testStatic {
    private int testNum;
    private String testing;
    private boolean real;

    //static variable, for the class, not the instance
    private static int instanceCount = 0;

    //default constructor
    public testStatic(){
        instanceCount += 1;
    }

    public testStatic(int testNum, String testing, boolean real){
        this.testNum = testNum;
        this.testing = testing;
        this.real = real;
        instanceCount += 1;
    }

    //setters and getters

    public int getTestNum() {
        return testNum;
    }

    public void setTestNum(int testNum) {
        this.testNum = testNum;
    }

    public String getTesting() {
        return testing;
    }

    public void setTesting(String testing) {
        this.testing = testing;
    }

    public boolean isReal() {
        return real;
    }

    public void setReal(boolean real) {
        this.real = real;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }
}
