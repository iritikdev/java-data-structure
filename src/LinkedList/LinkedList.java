
package LinkedList;
import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node first;
    private Node last;
    private int size = 0;

    // check list is empty 
    public boolean isEmpty() {
        return first == null;
    }

    // addFirst
    public void addFirst(int item) {
        // 1. create a new node
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;

    }
    // addLast
    public void addLast(int item) {
        // 1. create a new node
        var node = new Node(item);

        // 2. check list is empty
        if (isEmpty())
            first = last = node;
        // else not empty
        else {
            last.next = node;
            // making "node" as last
            last = node;
        }
        size++;
    }
    
    // deleteFirst
    public void removeFirst() {
        // [ 10 -> 20 -> 30 ]
        // if list is empty throe an Error: NoSuchElementException
        if (isEmpty()) 
            throw new NoSuchElementException();
        
        // if we have one element in the list
        if (first == last) {
            first = last = null;
            return;
        }

        // if moe than one element
        var second = first.next;
        first.next = null;
        first = second;

        size--;

    }

    // deleteLast
    public void removeLast() {
        // [ 10 -> 20 -> 30 ]
        if (isEmpty()) 
            throw new NoSuchElementException();
        
        // if we have one element in the list
        if (first == last) {
            first = last = null;
            return;
        }

        var current = first;
        while (current != null) {
            if (current.next == last)
                break;
            current = current.next;
        }
        current.next = null;
        last = current;

        size--;
    }

    // indexOf
    public int indexOf(int item) {
        int count = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return count;
            count++;
            current = current.next;
        }
        return -1;
    }
    // contains
    public boolean contains(int item) {
        Node current = first;
        while (current != null) {
            if (current.value == item)
                return true;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        
        return array;
    }
    public void print() {
        Node current = first;
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
