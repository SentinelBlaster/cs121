package weekFourteen;

import java.util.ArrayList;

public class MyQueue {
    ArrayList<Integer> dataset = new ArrayList<>();

    public void enqueue(int element){
        dataset.add(element);
    }
    public int dequeue(){
        return dataset.remove(0);
    }
    public int peek(){
        return dataset.get(0);
    }
    public boolean isEmpty(){
        return dataset.isEmpty();
    }
}
