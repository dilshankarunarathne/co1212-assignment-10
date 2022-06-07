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
        int size = stack.getSize();
        CharStack aux = new CharStack();
        for (int i=0; i<size-1; i++) {
            move(stack, aux);
        }
        char c = stack.pop();

        size = aux.getSize();
        for (int i=0; i<size; i++) {
            move(aux, stack);
        }

        size -- ;
        return null;
    }

    public void display() {
        size = stack.getSize();
        for (int i=0; i<size; i++) {
            char c = stack.pop();
            stack.push(c);
            System.out.print(c + " ");
        }
    }

    private void move(CharStack from, CharStack to) {
        to.push(from.pop());
    }
}
