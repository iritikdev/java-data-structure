package Searching;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 4, 8, 3, 6, 4, 2 };
        var search = new Search();
        int index = search.LinearSearch(numbers, 3);
        System.out.println(index);
    }

    
}
