package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharQueue;

public class Stack {
    private final CharQueue queue;
    private int size;

    public Stack() {
        queue = new CharQueue();
        size = 0;
    }

    public void push(char c) {
        queue.enqueue(c);
    }

    public Character pop() {
        size = queue.getSize();
        int i = 0;
        while (true) {
            if (i == size) return queue.dequeue();
            queue.enqueue(queue.dequeue());
            i ++ ;
        }
    }

    public void display() {
        size = queue.getSize();
        for (int i=0; i<size; i++) {
            
        }
    }
}
