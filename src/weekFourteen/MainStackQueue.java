package weekFourteen;

public class MainStackQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(4);
        stack.push(6);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        MyQueue queue = new MyQueue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
