package me.karunarathne.FreakyDataStructures;

public class Tests {
    public static void main(String[] args) {
        newStackTests();
        newQueueTests();
    }

    private static void newQueueTests() {
        System.out.println("Q2 - Queue made of a Stack");
        Queue queue = new Queue(true);
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        queue.dequeue();
        queue.dequeue();
    }

    private static void newStackTests() {
        System.out.println("Q1 - Stack made of a Queue");
        Stack stack = new Stack(true);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.pop();
        stack.pop();
        System.out.println("");
    }
}
