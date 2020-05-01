/** required package class namespace */
package tools;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static tools.Globals.SELECT_SEMESTER_MESSAGE;
import static tools.Globals.SEMESTER;
import static tools.Globals.TITLE;

/**
 * UsefulMethods.java - methods that aren't directly applied to a JButton.
 *
 * @author Chelsea Bahsler
 * @since Mar. 6, 2020, 12:21:15 p.m.
 */
public class UsefulMethods implements Globals {

    public UsefulMethods() {
        
    }
    
    /**
     * Properties to set for the JFrame.
     *
     * @param width the int size(width) the JFrame is beings set to
     * @param height the int size (height) the JFrame is beings set to
     * @param frame the frame properties that are being set.
     */
    public static void setUI(int width, int height, JFrame frame) {
        frame.setTitle(TITLE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * Choose an option from the combo box.
     *
     * @return 0 (if String "Semester 1" is selected), 1 (if String "Semester 2"
     * is selected), or -1 (if this method fails).
     */
    public int whatSemester() {
        String select = chooseMonths(SEMESTER);

        if (select.equals(SEMESTER[0])) {
            return 0;
        }
        if (select.equals(SEMESTER[1])) {
            return 1;
        }
        return -1;
    }
    
    /**
     * Create a graphics object (comboBox) to display all the graphical options
     *
     * @param options int array
     * @return converted to String array
     */
    private String chooseMonths(String[] options) {

        String months = JOptionPane.showInputDialog(
                null,
                SELECT_SEMESTER_MESSAGE,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options).toString();
        return months;
    }

    /**
     * Checks what semester it is.
     *
     * @param semesters the JLabels that the the assigned semester/month are
     * applied to
     * @param check the int returned from a previous user selection
     * @param month1 the assigned month if semester 1
     * @param month2 the assigned month if semester 2
     * @return true (a semester was set), false (no semester was set)
     */
    public static boolean semesterChoice(JLabel[] semesters, int check,
            String month1, String month2) {

        if (check == 0) {
            semesters[0].setText(SEMESTER[0]);
            semesters[1].setText(month1);
            return true;
        }
        if (check == 1) {
            semesters[0].setText(SEMESTER[1]);
            semesters[1].setText(month2);
            return true;
        }
        return false;
    }

}
