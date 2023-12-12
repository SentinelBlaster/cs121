package weekFourteen;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> dataset = new ArrayList<>();

    public void push(int element){
        dataset.add(0,element);
    }
    public int pop(){
        return dataset.remove(0);
    }
    public int peek(){
        return dataset.get(0);
    }
    public boolean isEmpty(){
        return dataset.isEmpty();
    }
}
