/** required package class namespace */
package collectionsassignment;

/**
 * Node.java - description
 *
 * @author Chelsea Bahsler
 * @param <T>
 * @since Jan. 9, 2020, 9:52:44 a.m.
 */
public class Node<T> {

    public T data;
    public Node next;
    public Node previous;

    /**
     * Default constructor, set class properties
     *
     * @param data
     * @param next
     * @param previous
     */
    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Node(T data) {
        this(data, null, null);

    }

}
