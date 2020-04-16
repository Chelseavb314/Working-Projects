package classesBalloon;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * ClassesBank.java - description
 *
 * @author Chelsea Bahsler
 * @since Sep. 9, 2019, 10:13:56 a.m.
 */
public class classesBalloon {
// GLOBAL ARRAYS //

    final static String[] OPTIONS = {
        "Make Balloon",
        "Move Your Balloon",
        "Pop your Balloon",
        "Exit"
    };

    final static String[] COLORS = {
        "Red",
        "Yellow",
        "Blue"
    };

    final static String[] DIRECTIONS = {
        "North",
        "South",
        "East",
        "West"
    };

    // GLOBAL VARIABLES //
    public final static String TITLE = "Carnival";

    /**
     * Properties
     */
    static String name;
    static Color color;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balloons balloon = new Balloons();
        do {

            
            String option = balloon.dropDownbx("Welcome to the Carnival!\n "
                    + "What would you like to do?\n",
                    OPTIONS);

            // Event that happens when user selects option 1
            if (option.equals(OPTIONS[0])) {
                balloon.displayBalloon();

            } 
            else if (option.equals(OPTIONS[1])) {
                balloon.moveDirections();
            } 
            else if (option.equals(OPTIONS[2])) {
                balloon.popBalloon();
            } 
            else if (option.equals(OPTIONS[3])) {
                exitApp();
            }
        } while (true);

    }

    /**
     * Exit application and thanks user for using it
     */
    private static void exitApp() {

        Balloons.output("Thank you for using \n"
                + TITLE
                + " The program will now end ...");
        System.exit(0);
    }

}
