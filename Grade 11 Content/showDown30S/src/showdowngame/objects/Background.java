/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */

import showdowngame.Globals;
import showdowngame.tools.GameObject;

import javax.swing.JLabel;

/**
 * Background.java - Background label of program
 *
 * @author Mr. Wachs //modified by Chelsea Bahsler
 * @since 15-May-2019
 */
public class Background extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the color is being set to
     */
    public Background(JLabel label) {
        super(label);
        
        // sets background color
        sprite.setColor(Globals.BACKGROUND_COLOR);
    }
    
}
