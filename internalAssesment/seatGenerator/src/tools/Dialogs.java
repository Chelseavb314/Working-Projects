/** required package class namespace */
package tools;

import javax.swing.JOptionPane;

/**
 * Dialogs.java - class that holds methods for JOptionPanes
 *
 * @author Chelsea Bahsler
 * @since Mar. 8, 2020
 */
public class Dialogs {

    /**
     * A program error has occurred and a message appears to the user to let
     * them know how to proceed.
     *
     * @param message description of what went wrong and what to do now
     */
    public static void error(String message) {
        JOptionPane.showMessageDialog(null, message, "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Confirm dialog appears asking the user to review their inputs.
     *
     * @param message asks the user if they're happy with their input
     * @param title of the JOptionPane dialog
     * @return the message dialog
     */
    public static int confirm(String message, String title) {
        return JOptionPane.showConfirmDialog(null, message, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION);
    }

}
