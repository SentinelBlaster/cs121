package weekThirteen.genericsActivity;

import java.util.ArrayList;

public class GenericsMain {

    public static void main(String[] args) {
        GenericMethods genMethods = new GenericMethods();

        //Double [] doubleArray = {1.3,5.2,7.3,76.1};
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.3);doubles.add(5.2);doubles.add(7.3);doubles.add(76.1);
        genMethods.printArrayList(doubles);

        //Character [] charArray = {'A','B','C','D'};
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');chars.add('B');chars.add('C');chars.add('D');
        genMethods.printArrayList(chars);

        //String [] stringArray = {"Alpha","Beta","Gamma"};
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Alpha");strings.add("Beta");strings.add("Gamma");
        genMethods.printArrayList(strings);

        //Integer [] intArray = {1,5,2,65,2};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);integers.add(5);integers.add(2);integers.add(65);integers.add(2);
        genMethods.printArrayList(integers);

    }
}
