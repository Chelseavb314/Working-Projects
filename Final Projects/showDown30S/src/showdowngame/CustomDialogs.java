/** required namespace */
package showdowngame;

/** required import*/
import showdowngame.tools.Dialogs;

/**
 * CustomDialogs.java - custom made dialog options for the game
 *
 * @author Chelsea Bahsler
 * @since 15-May-2019
 */
public class CustomDialogs extends Dialogs {

    /**
     * Class Constructor
     *
     * @param dialogTitle text seen in dialog
     */
    public CustomDialogs(String dialogTitle) {
        super(dialogTitle);
    }

    /**
     * Introduces the player to the game in a dialog box
     */
    public void introduction() {
        String text = "Welcome to " + Globals.UI_TITLE + " \n"
                + dialogFriendlyDescription();
        show(text);
    }

    /**
     * Instructs the player on how to play the game
     */
    public void instructions() {
        show("INSTRUCTIONS: \n\n"
                + "To first start the game,"
                + " move your character left or right using the arrow keys. \n"
                + "Shoot using the SPACEBAR"
                + " when the the Bad Guy is not behind"
                + " his wall. \n\n"
                + "Good Luck Hero!");
    }

    /**
     * Message displayed when player loses the game
     */
    public void gameOverMessage() {
        show("GAME OVER \n"
                + "Don't give up!");
    }

    /**
     * Message displayed when player win the game
     */
    public void WinnerMessage() {
        show("CONGRATULATIONS! \n"
                + "YOU WON!");
    }

    /**
     * Global variable DESCRIPTION_TEXT line indents are replaced with "/n"
     * indents to fit JOptionPane dialog standards.
     *
     * Reference for replace method:
     * https://www.javatpoint.com/java-string-replace
     *
     * @return indent friendly description text
     */
    public String dialogFriendlyDescription() {
        // Replace '<html>' with 'blank'  
        String text = Globals.DESCRIPTION_TEXT.replace("<html>", "");
        text = text.replace("<br>", "\n"); // Replace '<br>' with '\n'  
        text = text.replace("</html>", "");
        return text;
    }
    
}
