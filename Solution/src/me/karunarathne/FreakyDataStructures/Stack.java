package me.karunarathne.FreakyDataStructures;

import me.karunarathne.NormalDataStructures.CharQueue;
import me.karunarathne.NormalDataStructures.CharStack;

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
