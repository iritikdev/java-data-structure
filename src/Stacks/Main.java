package Stacks;

public class Main {
    public static void main(String[] args) {
        var stack = new MinStack();
        stack.push(10);
        stack.push(2);
        stack.push(0);
        stack.pop();
        System.out.println(stack.min());
        

        System.out.println(stack.toString()); 
       
    }
}