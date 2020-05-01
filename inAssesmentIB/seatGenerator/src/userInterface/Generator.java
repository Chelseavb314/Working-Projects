/** required package class namespace */
package userInterface;

import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import tools.Dialogs;
import tools.Globals;
import tools.Sort;
import tools.UsefulMethods;

/**
 * Generator.java - class that contains methods that causes events to occur in
 * which an element on the GUI(SeatChart/Charts) is interacted with by the user.
 *
 * @author Chelsea Bahsler
 * @since Feb. 28, 2020, 9:44:10 a.m.
 */
public class Generator extends javax.swing.JFrame implements Globals {

    public String[] names;
    public int btnClick = 0;
    public int btnClick2 = 0;

    private JButton[] options;
    private JFrame a;
    private JLabel[] seats;
    private JLabel[] semesters;
    private JTextField insert;

    private List namesList;
    private Sort sort;
    final private UsefulMethods USE;

    /**
     * Class constructor for the first visible JFrame
     *
     * @param studentNames the awt Java list that the user can mutate
     * @param insert the JTextField that the user can use to input Strings
     * @param buttons the JButtons that cause events to occur
     * @param a the JFrame that contains user interactive elements
     */
    public Generator(List studentNames, JTextField insert,
            JButton[] buttons, JFrame a) {

        this.namesList = studentNames;
        this.insert = insert;
        this.a = a;

        buttons = new JButton[buttons.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
        }

        USE = new UsefulMethods();
        UsefulMethods.setUI(W1, H1, a);

    }

    /**
     * Class constructor for the second visible JFrame
     *
     * @param names array of String user returned student names
     * @param seats JLabel array of student desks that's being instantiated
     * @param semesters JLabel array of semester titles that are being
     * instantiated
     * @param b JFrame that contains user interactive elements
     */
    public Generator(String[] names, JLabel[] seats, JLabel[] semesters, JFrame b) {
        this.names = names;
        this.seats = seats;
        this.semesters = semesters;
        this.sort = new Sort(this.names);
        USE = new UsefulMethods();
        UsefulMethods.setUI(W2, H2, b);
    }

    /**
     * Enter the name of a student. User inputted name can't be blank - filled
     * with spaces.
     */
    protected void enterName() {

        if (insert != null && namesList.getItemCount() < 35) {
            String name = insert.getText();
            String trimmed = name.trim();
            if (trimmed.isBlank()) {
                Dialogs.error(ERROR_MESSAGE2);
            } else {
                namesList.add(trimmed);
                insert.setText("");
            }
        } else {
            Dialogs.error(ERROR_MESSAGE);
        }
    }

    /**
     * Remove a name/names from the list
     *
     * @return true(multiple names were removed)/false(one name was removed)
     */
    protected boolean removeName() {

        if (namesList.getSelectedItem() == null) {
            String[] studNames = namesList.getSelectedItems();
            for (String name : studNames) {
                namesList.remove(name);
            }
            return true;
        } else {
            String name = namesList.getSelectedItem();
            namesList.remove(name);
            return false;
        }
    }

    /**
     * Remove all names from the list (names don't need to be selected to occur)
     */
    protected void removeAllNames() {
        namesList.removeAll();
    }

    /**
     * Deselect all selected items from the list
     */
    protected void deselectAll() {

        if (namesList.getSelectedIndex() == 0) {
            int[] indices = namesList.getSelectedIndexes();
            for (int i = 0; i < indices.length; i++) {
                namesList.deselect(indices[i]);
            }
        } else {
            int index = namesList.getSelectedIndex();
            namesList.deselect(index);
        }
    }

    /**
     * Select all selected items from the list
     */
    protected void selectAll() {
        String[] allItems = namesList.getItems();
        for (int i = 0; i < allItems.length; i++) {
            namesList.select(i);
        }
    }

    /**
     * After all names are inputted, the names are all outputted and the user is
     * asked if this looks correct.if yes, continue program.if no, go back to
     * the current JFrame.
     *
     * @return true (operation successful) / false (operation failed)
     */
    protected boolean checkList() {

        if (namesList.getItemCount() == 0) {
            Dialogs.error(ERROR_MESSAGE1);
            return false;

        } else {
            int review = Dialogs.confirm("Is this correct?\n\n"
                    + Arrays.toString(namesList.getItems()),
                    "Name check");

            if (review == 0) {
                createCharts();
            }
            return true;
        }
    }

    /**
     * Action that enters in name from
     *
     * @param evt gets the key code
     */
    protected void keyPress(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enterName();
        }
    }

    /**
     * Dispose of the user input screen and creates the seating chart diagrams.
     */
    private void createCharts() {
        a.dispose();
        String[] studNames = namesList.getItems();
        Charts charts = new Charts(studNames, USE.whatSemester());
    }

    /**
     * when JButton is pressed, this chart is shown
     */
    protected void showAlphabetical() {
        sort.sortAlpha(seats);
    }

    /**
     * when JButton is pressed, this chart is shown
     */
    protected void showRandom1() {
        if (btnClick == 0) {
            sort.hasBeenShuffled = false;
        }
        sort.shuffleCheck(seats);
        btnClick++;
    }

    /**
     * when JButton is pressed, this chart is shown
     */
    protected void showRandom2() {
        if (btnClick2 == 0) {
            sort.hasBeenShuffled = false;
        }
        sort.shuffleCheck(seats);
        btnClick2++;
    }

    /**
     * Checks the int returned from the combo box whatSemester() method.
     *
     * @param check what int was returned
     * @param month1 if semester one, and this button is pressed, set to month1
     * @param month2 if semester two, and this button is pressed, set to month2
     */
    protected void checkSemester(int check, String month1, String month2) {
        UsefulMethods.semesterChoice(semesters, check, month1, month2);
    }

}
