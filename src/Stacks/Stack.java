package Stacks;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    int count = 0;

    void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalArgumentException();
        return items[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalArgumentException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public String toString() {
        var list = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(list);
    }
}
