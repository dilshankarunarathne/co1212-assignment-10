package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharStack;

public class Queue {
    private CharStack stack;
    private int size;
    private boolean debug = false;

    public Queue() {
        stack = new CharStack();
        size = 0;
    }

    public Queue(boolean logging) {
        this();
        debug = logging;
        if (debug) System.out.println("Operation \tChar \tSize\tCurrent State");
    }

    public void enqueue(char c) {
        stack.push(c);
        size ++ ;
        if (debug) System.out.println("enqueue \t(" + c + ") -> " + this);
    }

    public Character dequeue() {
        int tempSize = stack.getSize();
        CharStack aux = new CharStack();
        for (int i=0; i<tempSize-1; i++) {
            move(stack, aux);
        }
        char c = stack.pop();

        tempSize = aux.getSize();
        for (int i=0; i<tempSize; i++) {
            move(aux, stack);
        }

        size -- ;
        if (debug) System.out.println("dequeue \t(" + c + ") <- " + this);
        return c;
    }

    public void display() {
        CharStack aux = new CharStack();

        int tempSize = stack.getSize();
        for (int i=0; i<tempSize; i++) {
            char c = move(stack, aux);
            System.out.print(c + " ");
        }

        for (int i=0; i<tempSize; i++) {
            char c = move(aux, stack);
        }
    }

    @Override
    public String toString() {
        String s = "\t  " + size + " \t[ ";

        CharStack aux = new CharStack();
        int tempSize = stack.getSize();
        for (int i=0; i<tempSize; i++) {
            char c = move(stack, aux);
            s = s + c + " ";
        }
        for (int i=0; i<tempSize; i++) {
            char c = move(aux, stack);
        }

        s = s + "]";
        return s;
    }

    private char move(CharStack from, CharStack to) {
        char c = from.pop();
        to.push(c);
        return c;
    }
}
