package Stacks;

import java.util.Arrays;

public class MinStack {
    private int[] items = new int[5];
    private int count = 0;
    private int min = Integer.MAX_VALUE;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();
        if (item < min)
            min = item;
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalArgumentException();
        return items[--count];
    }

    public int min() {
        return min;
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
