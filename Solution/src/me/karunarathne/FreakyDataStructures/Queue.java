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
        CharStack aux = new CharStack();
        for (int i=0; i<size; i++) {
            moveTo(aux);
        }
        char c = stack.pop();


        size -- ;
        return null;
    }

    private void moveTo(CharStack otherStack) {
        otherStack.push(stack.pop());
    }
}
