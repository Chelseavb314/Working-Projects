package metricconversion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static metricconversion.MetricConversion.TITLE;

/**
 * Convert.java - description
 *
 * @author Chelsea Bahsler
 * @since Sep. 19, 2019, 11:22:03 a.m.
 */
public class Convert {

    final static double IN_CM_CONVERT = 2.54;
    final static double FT_CM_CONVERT = 30.48;
    final static double MILES_KM_CONVERT = 1.61;
    final static double M_YDS_CONVERT = 1.094;
    
    //truncuate stuff!!!

    static MetricConversion convert;

    public Convert() {

    }

    /**
     * Convert inches to centimeters
     */
    public static void inConvert() {

        // in to cm
        double in = inputNumber("Enter inch(es): ");

        if (in <= 0) {
            wordCorrect();
        } else {
            double cm = in * IN_CM_CONVERT;
            output(in + " Inch(es) is equal to " + cm + " centimeter(s)");
        }

    }

    /**
     * Convert cm to inches or feet
     */
    public static void cmConvert() {

        //cm to in
        double cm = inputNumber("Enter centimeter(s): ");

        if (cm <= 0) {
            wordCorrect();
        } else {

            if (convert.choice.equals(convert.CONVERSIONS[4])) {
                double in = cm / IN_CM_CONVERT;
                output(cm + " centimeter(s) is equal to " + in + " inch(es).");

            } else if (convert.choice.equals(convert.CONVERSIONS[5])) {
                double ft = cm / FT_CM_CONVERT;
                output(cm + " centimeter(s) is equal to " + ft + " feet.");

            }
        }
    }

     /**
     * Convert meters to yards
     */
    public static void mConvert() {
        double m = inputNumber("Enter meter(s): ");
        if (m <= 0) {
            wordCorrect();
        } else {
            double yds = m * M_YDS_CONVERT;
            output(m + " Meters(s) is equal to " + yds + " yard(s).");
        }
    }

     /**
     * Convert km to miles
     */
    public static void kmConvert() {
        double km = inputNumber("Enter kilometer(s): ");
        if (km <= 0) {
            wordCorrect();
        } else {
            double mi = km / MILES_KM_CONVERT;
            output(mi + " kilometer(s) is equal to " + mi + " mile(s).");
        }
    }

    /**
     * Convert miles to either km
     */
    public static void miConvert() {
        double mi = inputNumber("Enter mile(s):");

        if (mi <= 0) {
            wordCorrect();
        } else {
            double km = mi * MILES_KM_CONVERT;
            output(mi + " Mile(s) is equal to " + km + " kilometer(s).");
        }

    }

    /**
     * Convert yards to meters
     */
    public static void ydsConvert() {
        double yds = inputNumber("Enter yard(s): ");

        if (yds <= 0) {
            wordCorrect();
        } else {
            double m = yds / M_YDS_CONVERT;
            output(yds + " yard(s) is equal to " + m + " meter(s).");
        }

    }

    /**
     * Convert ft to Cm
     */
    public static void ftConvert() {
        double ft = inputNumber("Enter feet:");

        if (ft <= 0) {
            wordCorrect();
        } else {
            double cm = ft * FT_CM_CONVERT;
            output(ft + " Feet is equal to: " + cm + " centimeter(s).");

        }

    }

    /**
     * user inputs number to convert
     *
     * @param text text as seen in dialog
     * @return number input JOption
     */
    public static double inputNumber(String text) {
        String input = JOptionPane.showInputDialog(null,
                text,
                MetricConversion.TITLE,
                JOptionPane.INFORMATION_MESSAGE);

        double value = Integer.parseInt(input);
        return value;

    }

    /**
     * Output that displays message dialog box
     *
     * @param text text seen in dialog
     */
    public static void output(String text) {
        Icon image = new ImageIcon();

        JOptionPane.showMessageDialog(null,
                text,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                image);

    }

    /**
     * What appears if the user enters zero or lower
     */
    public static void wordCorrect() {
        String text = "ERROR! \n\n"
                + "The " + TITLE + " can not convert a number less than \n"
                + "or equal to ZERO. \n\n"
                + "Next time, try entering a different value.";

        JOptionPane.showMessageDialog(null, text, TITLE, 0);

    }
}