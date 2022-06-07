package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharStack;

public class Queue {
    private CharStack stack;

    public Queue() {
        stack = new CharStack();
    }

    public void enqueue(char c) {
        CharStack oldStack = stack;
        stack = new CharStack();
        stack.push(c);
        copyAllFrom(oldStack);
    }

    public Character dequeue() {

        return null;
    }

    private void copyAllFrom(CharStack otherStack) {

    }
}
