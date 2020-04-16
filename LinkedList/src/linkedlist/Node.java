/** required package class namespace */
package linkedlist;

/**
 * Node.java - description
 *
 * @author Chelsea Bahsler
 * @param <int>
 * @since Jan. 9, 2020, 9:52:44 a.m.
 */
public class Node {

    public int data;
    public Node next;
    public Node previous;

    /**
     * Default constructor, set class properties
     *
     * @param data
     * @param next
     * @param previous
     */
    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Node(int data) {
        this(data, null, null);

    }

}
