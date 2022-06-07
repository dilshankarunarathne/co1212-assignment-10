package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharQueue;

public class Stack {
    private final CharQueue queue;
    private int size;
    private boolean debug = false;

    public Stack() {
        queue = new CharQueue();
        size = 0;
    }

    public Stack(boolean logging) {
        queue = new CharQueue();
        size = 0;
        this.debug = logging;
        if (debug) System.out.println("Operation \tChar \tSize\tCurrent State");
    }

    public void push(char c) {
//        if (debug) System.out.println("push \t(" + c + ") -> " + this);
        queue.enqueue(c);
    }

//    public Character pop() {
//        size = queue.getSize();
//        int i = 0;
//        char ch;
//        while (true) {
//            if (i == size-1) {
//                ch = queue.dequeue();
//                break;
//            }
//            queue.enqueue(queue.dequeue());
//            i ++ ;
//        }
//        if (debug) System.out.println("dequeue \t(" + ch + ") <- " + this);
//        return ch;
//    }

    public Character pop() {
        size = queue.getSize();
        int i = 0;
        while (true) {
            if (i == size-1) return queue.dequeue();
            queue.enqueue(queue.dequeue());
            i ++ ;
        }
    }

    @Override
    public String toString() {
        String s = "\t  " + size + " \t[ ";

        size = queue.getSize();
        for (int i=0; i<size; i++) {
            char c = queue.dequeue();
            s = s + c + " ";
            System.out.print(c + " ");
        }

        s = s + "]";
        return s;
    }

    public void display() {
        size = queue.getSize();
        for (int i=0; i<size; i++) {
            char c = queue.dequeue();
            queue.enqueue(c);
            System.out.print(c + " ");
        }
    }
}
