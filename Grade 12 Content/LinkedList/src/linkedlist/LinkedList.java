package linkedlist;

/**
 *
 * LinkedList.java -
 *
 * @author Chelsea Bahsler
 * @since Jan. 6, 2020
 *
 *
 */
public class LinkedList {

    /**
     * Main Class constructor method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {101, 102, 103, 104, 105};
        List list = new List(array);
        list.add(106);
        System.out.println(list.toArray(array)); //get rid of later
        System.out.println(list.toString());

        //this part doesnt work . . .
        list.removeEvenIndices();

        System.out.println(list.toArray(array)); //get rid of later
        System.out.println(list.toString());

    }

}
