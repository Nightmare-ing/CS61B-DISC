package disc05;

import java.util.Stack;

public class Queue<T> {
    private final Stack<T> inStack;
    private final Stack<T> outStack;

    public Queue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(T elem) {
        inStack.push(elem);
    }

    public T poll() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.poll() + " " + q.poll());
        q.push(4);
        q.push(5);
        System.out.println(q.poll() + " " + q.poll() + " " + q.poll());
    }
}
