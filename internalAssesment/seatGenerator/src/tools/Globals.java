/** required package class namespace */
package tools;

/**
 * Interface holding various data types.
 *
 * @author Chelsea Bahsler
 */
public interface Globals {

    // for JFrame UI 1 
    final static public int W1 = 500;
    final static public int H1 = 800;

    // for JFrame UI 2
    final static public int W2 = 650;
    final static public int H2 = 885;
    
    //Random Constants
    final static public int LOW = 0;

    // Error Testing
    final static public int NO_NAMES = 0; //no names in list
    final static public int NO_MC = -1; //no multiple choice options

    // Error Messages
    final static public String ERROR_MESSAGE
            = "You can't have that many people in this classroom."
            + "\nReview the list of names, and either delete a name/names"
            + " or start over.";

    final static public String ERROR_MESSAGE1
            = "You must enter a name / a list of names before we continue.";

    final static public String ERROR_MESSAGE2
            = "<html> Only blank spaces were inputted."
            + "<br> Please input a student's name. </html>";

    final static public String CONFIRM_MESSAGE
            = "<html> The list of names were already randomly sorted."
            + " <br> Would you like to randomize again?";

    // Other
    final static public String TITLE
            = "Seat Generator";

    final static public String SELECT_SEMESTER_MESSAGE
            = "What semester are you making this seating plan for?";

    final static public String[] SEMESTER
            = {"Semester 1", "Semester 2"};

    final static public String[] MONTHS
            = {"September", "October", "November", "December", "January",
                "February", "March", "April", "May", "June"};
}
