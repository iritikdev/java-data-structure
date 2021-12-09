package Searching;

public class Search {
    public int LinearSearch(int[] items, int item) {
        for (int i = 0; i < items.length; i++) 
            if (items[i] == item)
                return i;
                
        return -1;
    }
}
