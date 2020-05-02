/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */
import javax.swing.JLabel;
import showdowngame.Globals;
import showdowngame.tools.GameObject;

/**
 * VillainLives.java - The life label for the villain
 *
 * @author Chelsea Bahsler Date: 2019-06-04
 */
public class VillainLives extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the text and color is being set to
     */
    public VillainLives(JLabel label) {
        super(label);
        sprite.debug("Life", Globals.VILLAIN_COLOR);
    }

    /**
     * Villain Life object is hidden
     */
    public void hide() {
        sprite.hide();
    }

    /**
     * Villain Life object is visible
     */
    public void show() {
        sprite.show();
    }
    
}
