/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */
import javax.swing.JLabel;
import showdowngame.Globals;
import showdowngame.tools.GameObject;

/**
 * HitZones.java - Customized HitZone Class
 *
 * @author Chelsea Bahsler
 * @since 06-June-2019
 */
public class HitZones extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the color is being set to
     */
    public HitZones(JLabel label) {
        super(label);

        sprite.setColor(Globals.BACKGROUND_COLOR);
    }
    
}
