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
//        if (size == 0) {
//            stack.push(c);
//            return;
//        }
//        CharStack oldStack = stack;
//        stack = new CharStack();
        stack.push(c);
//        copyAllFrom(oldStack);
        size ++ ;
    }

    public Character dequeue() {
        

        size -- ;
        return null;
    }

    private void copyAllFrom(CharStack otherStack) {
        stack.push(otherStack.pop());
    }
}
