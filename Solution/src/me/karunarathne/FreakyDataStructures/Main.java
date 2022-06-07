package me.karunarathne.FreakyDataStructures;

public class Main {
    public static void main(String[] args) {
        newStackTests();
        newQueueTests();
    }

    private static void newQueueTests() {
        Queue queue = new Queue();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        queue.display();
        System.out.println("-------");
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("-------");
    }

    private static void newStackTests() {
        Stack stack = new Stack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.display();
        System.out.println("-------");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("-------");
    }
}
