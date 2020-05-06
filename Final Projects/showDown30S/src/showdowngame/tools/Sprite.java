/** required package class namespace */
package showdowngame.tools;

/**
 * required imports
 */
import java.awt.Color;
import javax.swing.JLabel;

/**
 * GameSprite.java - represents an image, or multiple animations of images, in a
 * game including the ability to animate
 *
 * @author Mr. Wachs //modified by Chelsea Bahsler
 * @since 14-May-2019
 */
public class Sprite {

    private GameImage gameImage;
    private String text;
    private int currentIndex;

    /**
     * Constructor for the class, sets class properties
     *
     * @param label the label hitbox used to display the image
     */
    public Sprite(JLabel label) {
        gameImage = new GameImage(label);                  // set picturebox
    }


    /**
     * Constructor for the class, sets class properties
     *
     * @param label the label hitbox use to display the image
     * @param text the text inside the hitbox
     * @param background the background color of the hitbox
     */
    public Sprite(JLabel label, String text, Color background) {
        gameImage = new GameImage(label, text, background);
    }

    /**
     * Update the coordinates of the game images current location data
     *
     * @param coordinates the coordinates object to update
     */
    public void update(Coordinates coordinates) {
        if (coordinates == null) {
            coordinates = new Coordinates();
        }
        gameImage.update(coordinates);
    }

    /**
     * Re-positions game image in it's container based on coordinate data
     *
     * @param coordinates the coordinates object to re-position to
     */
    public void redraw(Coordinates coordinates) {
        gameImage.redraw(coordinates);
    }

    /**
     * Hides (makes invisible) the game image in the container
     */
    public void hide() {
        gameImage.hide();
    }

    /**
     * Shows (makes visible) the game image in the container
     */
    public void show() {
        gameImage.show();
    }

    /**
     * Debug mode for the game image only displaying text and a background color
     *
     * @param text the text inside the hitbox
     * @param background the background color of the hitbox
     */
    public void debug(String text, Color background) {
        gameImage.setDebug(text, background);
    }

    /**
     * Sets the background color of the label (no animations)
     *
     * @param color the color to set to
     */
    public void setColor(Color color) {
        gameImage.setColor(color);
    }

}
