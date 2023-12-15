package weekFifteen.bianarySearchTreeActivity;

public class testing {
    public static void main(String[] args) {
        BinarySearchTreeDemo BinarySearch = new BinarySearchTreeDemo();

        BinarySearch.addNode('D');
        BinarySearch.addNode('B');
        BinarySearch.addNode('F');
        BinarySearch.addNode('A');
        BinarySearch.addNode('C');
        BinarySearch.addNode('E');
        BinarySearch.addNode('G');

        BinarySearch.preOrderTraverse(BinarySearch.getRoot());
        System.out.println();
        BinarySearch.inOrderTraverse(BinarySearch.getRoot());
        System.out.println();
        BinarySearch.postOrderTraverse(BinarySearch.getRoot());

    }
}
