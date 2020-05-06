/** required package class namespace */
package showdowngame.objects;

/**
 * required imports
 */

import showdowngame.Globals;
import showdowngame.tools.GameObject;

import javax.swing.JLabel;

/**
 * Description.java - Label that adds some storytelling elements to the game
 *
 * @author Chelsea Bahsler
 * @since 6-June-2019
 */
public class Description extends GameObject {

    /**
     * Class Constructor, sets class property data
     *
     * @param label the JLabel that the text and color are being set to
     */
    public Description(JLabel label) {
        super(label);
        sprite.debug(descriptionText(), Globals.DESCRIPTION_COLOR);
    }

    /**
     * The multi-line text that appears in the JLabel Description
     *
     * @param text text seen in dialog
     * @return The written text
     */
    private String descriptionText() {
        String text = Globals.DESCRIPTION_TEXT;
        return text;
    }
    
}
