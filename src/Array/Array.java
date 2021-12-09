package Array;

class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }
    
    public void insertAt(int item, int index) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        // shifting the element to right      
        for (int i = count; i > index; i--)
            items[i] = items[i - 1];

        items[index] = item;
        count++;
    }

    public void remove() {
        count--;
    }

    public void removeAt(int index) {
        // validate a index
        if (index < 0 || index >= count) 
            throw new IllegalArgumentException();
        
        // shift the items to left to fill the hole
        // [10,20,30,40]
        // index = 1
        // After shifting [10,30,40]
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        // Best case - O(1)
        // wrost case - O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
    
    public int get(int index) {
        return items[index];
    }

    public void set(int index, int item) {
        items[index] = item;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++)
            if (items[i] < min)
                min = items[i];
        return min;
    }
    
    public void reverse() {
        for (int i = 0, j = count - 1; i < j; i++, j--) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
        }
    }

    public void leftRotation() {
        int item = items[0];
        for (int i = 0; i < count; i++)
            items[i] = items[i + 1];
        items[count - 1] = item;
    }

    public boolean isSorted() {
        for (int i = 0; i < count - 1; i++) {
            if (items[i] > items[i + 1])
                return false;
        }
        return true;
    }

    public void insertAtSorted(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        if (isSorted()) {
            int i = count;
            while (items[i-1] > item) {
                items[i] = items[i - 1];
                i--;
            }
            items[i] = item;
            count++;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
    }
}