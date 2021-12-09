package Array;

public class App {
    public static void main(String[] args) {
        var numbers = new Array(3);
        
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        var nums = new Array(3);
        nums.insert(12);
        nums.insert(14);
        nums.insert(16);
       
        numbers.print();
        nums.print();
    }
}
