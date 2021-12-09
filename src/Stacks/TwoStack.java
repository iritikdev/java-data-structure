package Stacks;

import java.util.Arrays;

public class TwoStack {
    int[] items = new int[10];
    private int count1 = 0;
    private int count2 = items.length-1;

    public void push1(int item) {
        if (count1 + 1 == count2)
            throw new StackOverflowError();
        items[count1++] = item;
    }
    
    public void push2(int item) {
        if (count2 + 1 == count1)
            throw new StackOverflowError();
        items[count2--] = item;
    }

    public int pop1() {
        return items[--count1];
    }

    public int pop2() {
        return items[++count2];
    }

    public boolean isEmpty1() {
        return count1 == 0;
    }

    public boolean isEmpty2() {
        return count2 == items.length - 1;
    }
    
    public boolean isFull1() {
        return count1 - 1 == count2;
    }

    public boolean isFull2() {
        return count2 + 1 == count1;
    }


    @Override
    public String toString() {
        var list = Arrays.copyOfRange(items, 0, count1);
        var list2 = Arrays.copyOfRange(items, count2+1, items.length);
        return Arrays.toString(list) + " " + Arrays.toString(list2);
    }
}
