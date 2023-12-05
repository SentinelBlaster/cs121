package weekEleven.sortingActivity;

import java.util.Scanner;

public class Sorting {
    public Integer[] getArray(){
        Scanner console = new Scanner(System.in);
        Integer[] array = new Integer[5];
        System.out.println("Enter 5 unsorted integers");
        for(int i = 0;i < array.length;i++){
            array[i] = Integer.parseInt(console.nextLine());
        }
        console.close();
        return array;
    }

    public Integer[] sortArray(Integer[] array){
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n-i); j++) {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
