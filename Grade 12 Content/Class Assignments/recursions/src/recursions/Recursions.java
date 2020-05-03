package recursions;

/**
 *
 * Recursions.java - The mcCarthy91 function is applied to a number sequence
 * that starts at zero, increases by 20, and ends at 300.
 *
 * @author Chelsea Bahsler
 * @since Sep. 23, 2019, 10:08:28 a.m.
 */
public class Recursions {
    final static String TITLE
            = ". . . . . Recursion Assignment \n";
    final static String END
            = "\n" + TITLE + " is finished . . . . .";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(TITLE);
        for (int n = 0; n <= 300; n += 20) {
            int mvalue = mcCarthy91(n);
            System.out.println("\n number =  " + n
                    + "  McCarthy value = " + mvalue);
        }
        System.out.println(END);
    }

    /**
     * Recursive method
     *
     * @param n the number value
     * @return the number that undergoes the mcCarthy91 Function
     */
    public static int mcCarthy91(int n) {
        if (n > 100)  return n - 10; //base case
        if (n <= 100) return mcCarthy91(mcCarthy91(n + 11)); //recursive
        // recursive case (method calls itself)
        return n * mcCarthy91(n - 1);
    }

}
