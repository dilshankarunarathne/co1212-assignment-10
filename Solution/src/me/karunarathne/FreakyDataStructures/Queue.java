package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharStack;

public class Queue {
    private CharStack stack;
    private int size;

    public Queue() {
        stack = new CharStack();
        size = 0;
    }

    public void enqueue(char c) {
        stack.push(c);
        size ++ ;
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
        return c;
    }

    public void display() {
        CharStack aux = new CharStack();

        int tempSize = stack.getSize();
        for (int i=0; i<tempSize; i++) {
            char c = stack.pop();
            stack.push(c);
            System.out.print(c + " ");
        }
    }

    private char move(CharStack from, CharStack to) {
        char c = from.pop();
        to.push(c);
        return c;
    }
}
