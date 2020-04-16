package metricconversion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * MetricConversion.java - User gets a choice to convert
 *
 * @author Chelsea Bahsler
 * @since Sep. 17, 2019, 11:35:34 a.m.
 *
 */
public class MetricConversion {

    static String TITLE = "Metric Conversion Program";

    static String choice;
    static String CONVERSIONS[] = {
        "Inches to Centimeters",
        "Feet to Centimeters",
        "Yards to Meters",
        "Miles to Kilometers",
        "Centimeters to Inches",
        "Centimeters to feet",
        "Meters to Yards",
        "Kilometers to Miles"
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        intro();
        app();

    }

    /**
     * Where main code logic happens
     */
    private static void app() {

        convertChoice();

        exitApp();

    }

    /**
     * Using a simple output, a lengthy dialog is used to introduce the user to
     * the program.
     */
    private static void intro() {
        Convert.output("Welcome to the " + TITLE + "\n\n"
                + "This program allows users to enter a number \n"
                + " and then convert from: \n\n"
                + ""
                + "Inches to Centimeters \n"
                + "Feet to Centimeters \n"
                + "Yards to Meters \n"
                + "Miles to Kilometers \n"
                + "Centimeters to Inches \n"
                + "Centimeters to feet \n"
                + "Meters to Yards \n"
                + "Kilometers to Miles"
        );
    }

    /**
     * Create a graphics object (comboBox) to display all the graphical options
     *
     * @param text
     */
    private static String comboBox(String text, String options[]) {

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

    private static void convertChoice() {

        Convert value = new Convert();
        choice = comboBox("Indicate the type of conversion you'd "
                + "like to make: ",
                CONVERSIONS);

        do {

            if (choice.equals(CONVERSIONS[0])) {
//                Inches to Centimeters
                value.inConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[1])) {
//                Feet to Centimeters
                value.ftConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[2])) {
//                Yards to Meters
                value.ydsConvert();
                keepUsing(value);

            } else if (choice.equals(CONVERSIONS[3])) {
//                Miles to Kilometers       
                value.miConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[4])) {
//                Centimeters to Inches
                value.cmConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[5])) {
//                Centimeters to feet
                value.cmConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[6])) {
//                Meters to Yards
                value.mConvert();
                keepUsing(value);
            } else if (choice.equals(CONVERSIONS[7])) {
//                Kilometers to Miles
                value.kmConvert();
                keepUsing(value);
            }

        } while (true);

    }

    /**
     * Ask the user if the want to continue using the program
     */
    private static void keepUsing(Convert value) {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Would you like to convert another measurement unit?",
                TITLE,
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            convertChoice();

        } else {
            exitApp();
        }
    }

    /**
     * Thank you message is displayed. Application ends.
     */
    private static void exitApp() {
        Convert.output("Thanks for using the " + TITLE + " program. \n"
                + "The application will now close.");
        System.exit(0);
    }
}
