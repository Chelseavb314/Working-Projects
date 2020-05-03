/** required package class namespace */
package linkedlist;

import java.lang.reflect.Array;
import static javax.swing.UIManager.get;

/**
 * LinkedList.java - description
 *
 * @author Chelsea Bahsler
 * @since Jan. 9, 2020, 9:46:50 a.m.
 */
public class List {

    private Node head;
    private Node tail;
    private int length;

    /**
     * Constructor instantiates list from the passed data
     *
     * @param array the data objects to create the list from
     */
    public List(int[] array) {
        fromArray(array);
    }

    /**
     * Returns an array that contains the same data as the list
     *
     * @param array the data type array
     * @return an array of generic type T
     */
    public int[] toArray(int[] array) {
        array = (int[]) (Array.newInstance(
                array.getClass().getComponentType(),
                length));
        // create empty array
        for (int i = 0; i < length; i++) {      // traverse list
            array[i] = get(i);
            System.out.println(get(i));// add to array
        }
        return array;                           // return completed array
    }

    /**
     * Mutates the list into a list only matching the contents of the array
     *
     * @param array the data objects to form the list from
     */
    public final void fromArray(int[] array) {
        if (array == null) {
            return;                  // error check
        }
        finalize();
        for (int item : array) {
            add(item);                        // add array item
        }

    }

    // to fix (see below)
    /**
     * Wrapper method (add to back)
     *
     * @param data to add
     */
    public void add(int data) {
        addBack(data);

    } //good

    /**
     * Inserts data into the back (tail) of the list
     *
     * @param data the data type to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean addBack(int data) {

        Node node = new Node(data);
        if (length == 0) {
            head = tail = node;
        } else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        length++;
        return true;
    } //good

    /**
     * Deletes the node at the specified index and mutates the list
     *
     * @param index the index location to remove
     * @return the data at the specified index (or null)
     */
    public int remove(int index) {
        if (!inRange(index)) {
            return 0; //not in range
        }
        if (index == 0) {
            return removeFront();    // remove first
        }
        if (index == length - 1) {
            return removeBack();     // remove last
        }
        Node current = getNode(index);                  // get to index
        current.next.previous = current.previous;       // change references
        current.previous.next = current.next;
        current.next = current.previous = null;
        length--;                                       // reduce list length
        return current.data;                         // return index data
    } //good

    /**
     * Removes (deletes) the first (head) node of the list
     *
     * @return the data in the first node (or null)
     */
    public int removeFront() {
        if (length == 0) {
            return 0;             // no front to remove
        }
        int data = head.data;                  // store head data
        if (length == 1) {
            finalize();            // 1 node list, wipe list
        } else {
            head = head.next;                   // advanced head reference
            head.previous.next = null;          // cut old head reference
            head.previous = null;               // cut reference to old head
            length--;                           // reduce list length
            System.gc();                        // call system garbage collector
        }
        return data;                            // return stored data
    } //good

    /**
     * Removes (deletes) the last (tail) node of the list
     *
     * @return the data in the last node (or null)
     */
    public int removeBack() {
        int data = tail.data; // store tail data
        finalize();
        if (length == 0) {
            return 0;             // no back to remove
        } else {
            tail = tail.previous;               // advanced tail reference
            tail.next.previous = null;          // cut old tail reference
            tail.next = null;                   // cut reference to old tail
            length--;                           // reduce list length
            System.gc();                        // call system garbage collector
        }
        return data;                            // return stored data
    } //good

    /**
     * if the list contains data that ends in even numbers, remove that node at
     * that index
     *
     * @return
     */
    public boolean removeEvenIndices() {
        Node current = head; // start at front of list
        while (current != null) {
            for (int index = 0; index < length; index++) {
                if (index == index % 2) {
                    remove(index);
                }
            }

            return false;

        }
        return false;
    }

    /**
     * Accessor for the data at the specified index
     *
     * @param index the index location to access
     * @return the data (or null) at the index
     */
    public int get(int index) {
        if (!inRange(index)) {
            return 0;   // invalid index, return flag        
        }
        return (int) getNode(index).data;      // get reference and retrieve data  
    }

    /**
     * Accesses the node reference for this index location
     *
     * @param index the index location
     * @return a reference to the node at this index or null
     */
    protected Node getNode(int index) {
        if (!inRange(index)) {
            return null;             // not valid index
        }
        if (index == 0) {
            return head;   // first node returned
        }
        if (index == length - 1) {
            return tail;    // last node returned
        }
        Node current = head;                            // start at first node
        for (int i = 0; i < index; i++) {               // move to index
            current = current.next;                     // advance reference
        }
        return current;                                 // return reference
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (length == 0) {
            return "Empty LinkedList";       // no nodes to display
        }
        String text = "Linked List [";                  // starting character
        Node current = head;                            // start at head node
        while (current.next != null) {                  // traverse list
            text += current.toString() + ",";           // append data
            current = current.next;                     // move to next node
        }
        return text + current.toString() + "]";         // append end character      
    }

    /**
     * Checks to see if the index is in range of the list
     *
     * @param index the location to check
     * @return it is in range (true) or not (false)
     */
    private boolean inRange(int index) {
        if (length == 0) {
            return false;  // empty list no valid index
        }
        if (index < 0) {
            return false;  // index before first valid number
        }
        if (index >= length) {
            return false;  // index after last valid number
        }
        return true;                        // index is valid
    }

    /**
     * Frees up all memory used by this object
     */
    @Override
    public void finalize() {
        length = 0;                 // length set to zero
        head = tail = null;         // references set to nulls
        System.gc();                // runs the garbage collector in Java
    } //good
}
