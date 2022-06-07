package me.karunarathne.FreakyDataStructures;

public class Main {
    public static void main(String[] args) {
//        newStackTests();
        newQueueTests();
    }

    private static void newQueueTests() {
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
    }
}
