package weekSix.packagesDemo;

public class classTest {
    public int numOne, numTwo;
    private int max, min;

    public classTest(int numOne, int numTwo, int max, int min){
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.max = max;
        this.min = min;
    }

    private void test1(){
        System.out.println("Testing no.1");
    }
    void test2(){
        System.out.println("Testing no.2");
    }
    protected void test3(){
        System.out.println("Testing no.3");
    }
    public void test4(){
        System.out.println("Testing no.4");
    }
}
