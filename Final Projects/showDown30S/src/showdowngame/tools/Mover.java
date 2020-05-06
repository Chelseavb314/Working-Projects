/** required package class namespace */
package showdowngame.tools;

/**
 * Mover.java - methods to move a game object in various ways
 *
 * @author Mr. Wachs //modified by Chelsea Bahsler
 * @since 14-May-2019
 */
public class Mover {

    private Coordinates source;
    private int numberOfDirections;

    /**
     * Constructor for the class, sets class properties
     *
     * @param coordinates the coordinate data to assign to this class
     * @param numberOfDirections the number of movements in this game
     */
    public Mover(Coordinates coordinates, int numberOfDirections) {
        this.source = coordinates;
        this.numberOfDirections = numberOfDirections;
    }

    /**
     * Moves the game object based on the remembered direction
     */
    public void move() {
        if (source.direction == Directions.STOP) {
            return;
        }
        if (numberOfDirections == Directions.TWO_DIRECTIONS) {
            if (source.direction == Directions.LEFT) {
                moveLeft();
            } else if (source.direction == Directions.RIGHT) {
                moveRight();
            }
        }
    }

    /**
     * Stops all movement
     */
    public void stop() {
        source.direction = Directions.STOP;
    }

    /**
     * moves the game object left
     */
    public void moveLeft() {
        source.x = source.x - source.amount;
        source.recalculate();
        source.direction = Directions.LEFT;
    }

    /**
     * moves the game object right
     */
    public void moveRight() {
        source.x = source.x + source.amount;
        source.recalculate();
        source.direction = Directions.RIGHT;
    }
    
}
