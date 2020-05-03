package collectionsassignment;

/**
 *
 * CollectionsAssignment.java - simple test program
 *
 * @author Chelsea Bahsler
 * @since Jan. 9, 2020, 9:45:49 a.m.
 */
public class CollectionsAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {101, 102, 103, 104, 105};
        LinkedList list = new LinkedList(array);
        list.add(106);
        System.out.println(list.toString());
        System.out.println(array);
        //   list.removeEvenIndices();
        //  System.out.println(list.toString());

    }

}
