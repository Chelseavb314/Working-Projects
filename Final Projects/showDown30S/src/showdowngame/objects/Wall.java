/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */
import java.awt.Color;
import javax.swing.JLabel;
import showdowngame.tools.GameObject;

/**
 * Wall.java - representation of a wall
 *
 * @author Mr. Wachs // modified by Chelsea Bahsler
 * @since 15-May-2019
 */
public class Wall extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the color is being set to
     */
    public Wall(JLabel label) {
        super(label);
        sprite.setColor(Color.black);
    }
    
}
