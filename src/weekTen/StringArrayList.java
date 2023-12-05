package weekTen;
import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String>names;

    //constructor
    public StringArrayList(){
        this.names = new ArrayList<>();
    }

    //add string
    public void addName(String name){
        names.add(name);
    }
    //remove string
    public void removeName(String name){
        names.remove(name);
    }
    //get the size
    public int numOfNames(){
        return names.size();
    }
    //get element by index
    public String getName(int index){
        return names.get(index);
    }
    //display with for each
    public void displayForEach(){
        for (String n: names) {
            System.out.println(n);
        }
    }
    //display with for
    public void displayFor(){
        for(int i = 0; i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
