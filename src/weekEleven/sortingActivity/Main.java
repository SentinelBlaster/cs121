package weekEleven.sortingActivity;

public class Main {
    public static void main(String[] args) {
        Sorting bubble = new Sorting();
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
