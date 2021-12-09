package LinkedList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        var list = new LinkedList();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.println(Arrays.toString(list.toArray()));
        
    }
}
