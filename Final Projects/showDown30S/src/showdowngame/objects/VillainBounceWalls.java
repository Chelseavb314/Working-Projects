/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */
import javax.swing.JLabel;
import showdowngame.Globals;
import showdowngame.tools.GameObject;

/**
 * VillainBounceWalls.java - The walls that blend in with the background color
 *
 * @author Chelsea Bahser
 * @since 6-June-2019
 */
public class VillainBounceWalls extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the color is being set to
     */
    public VillainBounceWalls(JLabel label) {
        super(label);
        sprite.setColor(Globals.BACKGROUND_COLOR);
    }
    
}
