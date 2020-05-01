/** required package class namespace */
package collectionsassignment;

/**
 * LinkedList.java - description
 *
 * @author Chelsea Bahsler
 * @since Jan. 9, 2020, 9:46:50 a.m.
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    /**
     * Constructor instantiates list from the passed data
     *
     * @param array the data objects to create the list from
     */
    public LinkedList(int[] array) {
        fromArray(array);
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
        for (int i = 0; i < array.length; i++) {
            add(i);                              // add array item
        }

    }

    /**
     * Wrapper method (add to back)
     *
     * @param data to add
     */
    public void add(int data) {
        addBack(data);

    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {

        if (length == 0) {
            return "Empty Linked List";
        }
        String text = "Linked List [";
        Node current = head;
        while (current.next != null) {
            text += current.toString() + ", ";
            current = current.next;
        }

        return text + current.toString() + "]";
    }

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
    }

    /**
     * if the list contains data that ends in even numbers, remove that node at
     * that index
     */
    boolean removeEvenIndices() {

        if (length == 0) {
            // there are no nodes to remove
            return false;
        } else {

        }

        return false;
    }

}
