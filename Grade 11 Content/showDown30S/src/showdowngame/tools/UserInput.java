/** required package class namespace */
package showdowngame.tools;

/**
 * required imports
 */
import java.awt.event.KeyEvent;

/**
 * UserInput.java - methods to detect user inputs in various ways
 *
 * @author Mr. Wachs
 * @since 14-May-2019
 */
public class UserInput {

    private Coordinates source;
    private int numberOfDirections;

    /**
     * Constructor for the class, sets class properties
     *
     * @param source the coordinate data to assign to this class
     * @param numberOfDirections the number of movements in this game
     */
    public UserInput(Coordinates source, int numberOfDirections) {
        this.source = source;
        this.numberOfDirections = numberOfDirections;
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     *
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent event) {
        int key = event.getKeyCode();
        if (numberOfDirections == Directions.TWO_DIRECTIONS) {
            if (key == KeyEvent.VK_LEFT) {
                source.direction = Directions.LEFT;
            } else if (key == KeyEvent.VK_RIGHT) {
                source.direction = Directions.RIGHT;
            }
        }
    }
    
}
