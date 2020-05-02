/** required package class namespace */
package showdowngame.tools;

/**
 * required imports
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Picturebox.java - represents a box to display an image in a container for a
 * user interface and useful methods
 *
 * @author Mr. Wachs  //modified by Chelsea Bahsler
 * @since 14-May-2019
 */
public class Picturebox {

    private JLabel label;
    private String imageFile;
    private ImageIcon icon;

    /**
     * Constructor for the class, sets class properties
     *
     * @param label the label used to display the image
     */
    public Picturebox(JLabel label) {
        this(label, "", Color.white);               // set debug mode
    }

    /**
     * Constructor for the class, sets class properties
     *
     * @param label the label used to display the image
     * @param imageFile the relative image filename to display
     */
    public Picturebox(JLabel label, String imageFile) {
        this.label = label;                         // set parameter to property
//        setImage(imageFile);                        // set image
//        resizeToContainer();                        // resize
    }

    /**
     * Constructor for the class, sets class properties
     *
     * @param label the label used to display the image
     * @param text the text inside the label
     * @param background the background color of the label
     */
    public Picturebox(JLabel label, String text, Color background) {
        this.label = label;                         // set parameter to property
        setDebug(text, background);                  // set debug mode
    }

    /**
     * Shows (makes visible) the picturebox in the container
     */
    public void show() {
        if (imageFile != null) {
            label.setIcon(icon); // checks for an image
        }
        label.setVisible(true);                     // make label visible
    }

    /**
     * Hides (makes invisible) the picturebox in the container
     */
    public void hide() {
        label.setIcon(null);                        // removes any image
        label.setVisible(false);                    // make label invisible
    }

    /**
     * Update the coordinates of the picturebox current location data
     *
     * @param coordinates the coordinates object to update
     */
    public void update(Coordinates coordinates) {
        if (coordinates == null) {
            coordinates = new Coordinates();
        }
        coordinates.x = label.getX();
        coordinates.y = label.getY();
        coordinates.width = label.getWidth();
        coordinates.height = label.getHeight();
        coordinates.recalculate();
    }

    /**
     * Re-positions picturebox in it's container based on coordinate data
     *
     * @param coordinates the coordinates object to re-position to
     */
    public void redraw(Coordinates coordinates) {
        if (coordinates == null) {
            return;            // error trap
        }
        int x = coordinates.x;
        int y = coordinates.y;
        int w = coordinates.width;
        int h = coordinates.height;
        label.setBounds(x, y, w, h);
    }

    /**
     * Sets the image to debug mode, meaning it removes any graphics and changes
     * to a colored rectangle with text
     *
     * @param text the text to display in the image
     * @param background the background color of the image
     */
    public void setDebug(String text, Color background) {
        setColor(background);                                   // set color
        label.setBorder(BorderFactory.createEtchedBorder());    // set border
        label.setHorizontalAlignment(SwingConstants.CENTER);    // set align
        label.setFont(new Font("Arial Narrow", Font.BOLD, 8));    // set font
        label.setText(text);                                    // set text
    }

    /**
     * Sets the background color of the picturebox to the passed color and the
     * foreground color of the picturebox to the opposite color
     *
     * @param color the background color to set to
     */
    public void setColor(Color color) {
        label.setBorder(null);                  // remove any border
        label.setIcon(null);                    // remove any icon
        label.setOpaque(true);                  // allow background color
        label.setBackground(color);             // set background color
        label.setForeground(invert(color));     // set foreground to opposite
        label.setText("");                      // remove any text
    }

    /**
     * Inverts (creates an opposite color) directly opposite the passed color on
     * the color wheel
     *
     * @param color the color to invert
     * @return an opposite (inverted) color
     */
    private Color invert(Color color) {
        int r = color.getRed();         // get red value of original color
        int g = color.getGreen();       // get green value of original color
        int b = color.getBlue();        // get blue value of original color
        r = 255 - r;                    // calculate opposite red value
        g = 255 - g;                    // calculate opposite green value
        b = 255 - b;                    // calculate opposite blue value
        return new Color(r, g, b);        // return new color
    }

}
