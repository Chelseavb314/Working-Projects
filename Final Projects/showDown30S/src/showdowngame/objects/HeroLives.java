/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */
import javax.swing.JLabel;
import showdowngame.Globals;
import showdowngame.tools.GameObject;

/**
 * HeroLives.java - The life label for the hero
 *
 * @author Chelsea Bahsler Date: June 6, 2019.
 */
public class HeroLives extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel the text and color is being set to
     */
    public HeroLives(JLabel label) {
        super(label);
        sprite.debug("Life", Globals.HERO_COLOR);
    }

    /**
     * Object is not visible
     */
    public void hide() {
        sprite.hide();
    }

    /**
     * object is visible
     */
    public void show() {
        sprite.show();
    }
    
}
