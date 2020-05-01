package classesBalloon;

import static classesBalloon.classesBalloon.COLORS;
import static classesBalloon.classesBalloon.DIRECTIONS;
import static classesBalloon.classesBalloon.TITLE;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Chelsea Bahsler <your.name at your.org> ;
 * @since 15-Sep-2019
 */
public class Balloons {

    /**
     * Properties
     */
    public String name;
    public Color color;
    private static String colorSelect;
    private static String direction;

    ///////////////////////////////////////////////////////////////////////////
    /**
     * CONSTRUCTORS
     */
    
    /**
     * Default Constructor
     */
    public Balloons() {
        name = "Floaty";
        color = Color.red;
        direction = "Up";
    }

    /**
     * Constructor for Class
     *
     * @param name name assigned to balloon
     * @param color Color assigned to balloon
     */
    public Balloons(String name, Color color) {
        this.name = name;
        this.color = color;
        direction = "Up";
    }
    
    /**
     * INPUTS & OUTPUTS
     */
     /**
     * Simple message displays information in pop-up box
     *
     * @param text text seen in dialog
     */
    public static void output(String text) {
        JOptionPane.showMessageDialog(null,
                text,
                TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * JText area is displayed in JOptionPane Dialog with balloon name, and
     * floating direction.
     *
     * Text is set to the user's color choice for the balloon
     *
     * @param name the name given to the balloon by the user
     */
    private void fancyOutput() {

        JTextArea area = new JTextArea();
        area.setText("Balloon: " + name + "\n"
                + "Floating: " + direction); //havent set direction yet

        dropDownColors(area);
        JOptionPane.showMessageDialog(null,
                area,
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Create a graphics object (comboBox) to display all the graphical options
     *
     * @param text text seen in dialog
     * @param options int array
     * @return converted to String array
     */
    public String dropDownbx(String text, String[] options) {
        Icon picture = new ImageIcon();
        JTextArea area = new JTextArea();
        area.setText(text);
        String value = JOptionPane.showInputDialog(
                null,
                area,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                picture,
                options,
                options).toString();
        return value;
    }

    /**
     * Three color choices are outputted in combo box. This sets the color of a
     * JText area
     *
     * @param area the color being set to the area text
     * @return the chosen color
     */
    private static String dropDownColors(JTextArea area) {

        if (colorSelect.equals(COLORS[0])) {
            area.setForeground(Color.red);
        }
        if (colorSelect.equals(COLORS[1])) {
            area.setForeground(Color.yellow);
        }
        if (colorSelect.equals(COLORS[2])) {
            area.setForeground(Color.blue);
        }
        return colorSelect;

    }

    /**
     * user inputs name
     *
     * @param text text instructing user
     */
    private String input(String text) {
        name = JOptionPane.showInputDialog(null,
                text,
                TITLE,
                JOptionPane.DEFAULT_OPTION);
        return name;

    }

    /**
     * ACTIONS FOR THE USER TO CHOOSE FROM 
     * These are found in the app() method
     */
    /**
     * Name and Balloon Color is selected by the user to create a balloon
     */
    public void displayBalloon() {

        name = input("Enter balloon name");
        if(name.equals("")){
            name = "Floaty";
        }
        
        colorSelect = dropDownbx("Select a Balloon Color", COLORS);

        fancyOutput();

    }

    /**
     *User decides what direction to move their balloon
     */
    public void moveDirections() {
        
        direction = dropDownbx(
                "What direction would you like to move your balloon?",
                DIRECTIONS);

        if (direction.equals(DIRECTIONS[0])) {
            direction = DIRECTIONS[0];
        }
        if (direction.equals(DIRECTIONS[1])) {
            direction = DIRECTIONS[1];
        }
        if (direction.equals(DIRECTIONS[2])) {
            direction = DIRECTIONS[2];
        }
        if (direction.equals(DIRECTIONS[3])) {
            direction = DIRECTIONS[3];
        }
        fancyOutput();
    }

    /**
     * User pops their balloon with fury
     */
    public void popBalloon() {
        JTextArea area = new JTextArea();
        area.setText("Balloon " + name + " goes POP!");
        JOptionPane.showMessageDialog(null,
                area,
                TITLE,
                JOptionPane.PLAIN_MESSAGE);

    }

}
