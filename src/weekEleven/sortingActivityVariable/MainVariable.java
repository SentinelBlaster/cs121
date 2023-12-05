package weekEleven.sortingActivityVariable;

import weekEleven.sortingActivity.Sorting;

import java.util.Scanner;

public class MainVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many items would you like to sort?");
        int numItems = Integer.parseInt(console.nextLine());
        SortingVariable bubble = new SortingVariable(numItems);
        String unsorted = "";
        String sorted = "";

        Integer[] unsortedArray = bubble.getArray();

        System.out.println(" ");
        System.out.println("Unsorted Array: ");
        for(Integer i: unsortedArray){
            unsorted = unsorted + i + " ";
        }
        System.out.println(unsorted);

        System.out.println(" ");

        Integer[] sortedArray = bubble.sortArray(unsortedArray);
        System.out.println("Unsorted Array: ");
        for(Integer i: sortedArray){
            sorted = sorted + i + " ";
        }
        System.out.println(sorted);

    }

}
