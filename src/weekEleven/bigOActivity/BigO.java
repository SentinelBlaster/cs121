package weekEleven.bigOActivity;

public class BigO {
    public BigO() {
    }

    public void printOnce(){
        System.out.println("This is line 1 of 1");
    }

    public void printNTimes(int n){
        for (int i = 1; i<=n;i++){
            System.out.printf("This is line %d of %d%n",i,n);
        }
    }

    public void printNSquaredTimes(int n){
        int m = n*n;
        for (int i = 1; i<=m;i++){
            System.out.printf("This is line %d of %d%n",i,m);
        }
    }
}
