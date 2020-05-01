package fractionreducer;

import javax.swing.JOptionPane;

/**
 *
 * FractionReducer.java -
 *
 * @author Chelsea Bahsler
 * @since 7-Sep-2019
 *
 *
 */
public class FractionReducer {

    final String TITLE = "Fraction Reducer";

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        reduce(0, 0);
        output();
    }

    /**
     * The reduced fraction into LCD
     *
     * @param numerator the fraction's numerator
     * @param denominator the fraction's denominator value
     */
    private static String reduce(int numerator, int denominator) {

        String fraction = JOptionPane.showInputDialog(null,
                "Enter the fraction: ");
        getNumerator("");
        getDenominator("");

        return fraction; // return a string with fraction in the form n/d
    }

    /**
     * Convert input box to Integer values
     *
     * @param input the String
     */
    private static void convertIntInput(String input) {
        input = JOptionPane.showInputDialog(null, input);
        int number = Integer.parseInt(input);
    }

    private static String getNumerator(String string) {

        return null;

    }

    private static String getDenominator(String string) {
        return null;

    }

    private static void output() {

        JOptionPane.showMessageDialog(null,
                "The numerator is:  \n"
                + "The denominator is:  \n"
                + "The reduced fraction is: ",
                TITLE);
    }
}
