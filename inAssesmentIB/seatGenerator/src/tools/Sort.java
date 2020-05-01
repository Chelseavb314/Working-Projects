/** required package class namespace */
package tools;

import javax.swing.JLabel;
import userInterface.Generator;

/**
 * Sort.java - methods that sort through an array of strings.
 *
 * @author Chelsea Bahsler
 * @since Mar. 2, 2020, 9:58:24 a.m.
 */
public class Sort implements Globals {

    public String[] names;
    public boolean hasBeenShuffled = false;
    private Generator gen;
    private UsefulMethods use;

    /**
     * Class constructor. References the passed String[] array from the
     * generator class to this class.
     *
     * @param names the passed argument from the generator class
     */
    public Sort(String[] names) {
        this.names = names;
    }

    /**
     * Go through a String list of names and bubble sort it. (Alphabetize it).
     *
     * @param seats individual objects that a String name from the list is
     * applied to.
     */
    public void sortAlpha(JLabel[] seats) {
        bubble();
        for (int i = 0; i < seats.length; i++) {
            JLabel seatLabel = seats[i];
            if (i < names.length) {
                seatLabel.setText(names[i]);
            }
            else {
                seatLabel.setText("Empty Seat");
            }
        }
    }

    /**
     * Modified For-Loop, Type of array being shuffled, and included the rule
     * where a student couldn't be in the same index as the previous array.
     *
     * @param seats individual objects that a String name from the randomized
     * array applied to.
     */
    public void shuffleCheck(JLabel[] seats) {

        if (hasBeenShuffled == true) {
            int confirm = Dialogs.confirm(CONFIRM_MESSAGE, "Randomize Again?");
            if (confirm == 0) {
                String[] alphaNames = shuffle(names); //get copy of shuffled names
                for (int i = 0; i < names.length; i++) {
                    seats[i].setText(alphaNames[i]);
                }
            }
        } else {
            String[] alphaNames = shuffle(names);
            for (int i = 0; i < alphaNames.length; i++) {
                seats[i].setText(alphaNames[i]);
            }
        }
    }

    /**
     * A simple implementation of a bubble sort algorithm it will sort the array
     * into ascending order
     */
    private void bubble() {
        for (String name : names) {
            for (int j = 0; j < names.length - 1; j++) {
                String item1 = names[j];
                String item2 = names[j + 1];
                if (item1.compareTo(item2) > 0) {
                    names[j] = item2;
                    names[j + 1] = item1;
                }
            }
        }
    }

    /**
     * String array is randomly organized given a low int and a high int.
     * However, if the new index that the original array has been sorted into is
     * the same as a previous assortment, switch spots again.
     *
     * @param original String[] array - unmodified element
     * @return the randomized String[] array
     */
    private String[] shuffle(String[] original) {

        int length = original.length;
        String[] copy = new String[length];

        for (int i = 0; i < length; i++) {
            String name = original[i];
            int index = -1;
            boolean done = false;
            while (done == false) {
                index = random(LOW, length - 1);
                if (copy[index] == null) {
                    done = true;
                }
            }
            copy[index] = name;
        }
        hasBeenShuffled = true;
        return copy;
    }

    /**
     * a random number is generated giving a low and a high int.
     *
     * @param low the minimum valued int
     * @param high the maximum valued int
     * @return the random number that was generated
     */
    private int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1d) * seed + L;
        return (int) number;
    }
}
