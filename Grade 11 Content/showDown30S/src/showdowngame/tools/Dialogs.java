/** required package class namespace */
package showdowngame.tools;

/** required imports */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/**
 * Dialogs.java - a collection of useful methods for working with dialogs
 *
 * @author Mr. Wachs
 * @since 14-May-2019  
 */
public class Dialogs
{

    public static final Font DEFAULT_FONT
            = new JOptionPane().getFont();
    public static final Color DEFAULT_BACKGROUND_COLOR
            = new JOptionPane().getBackground();
    public static final Color DEFAULT_FOREGROUND_COLOR
            = new JOptionPane().getForeground();
    private final String DEFAULT_TITLE = "";
    private final Component DEFAULT_COMPONENT = null;
    private final ImageIcon DEFAULT_ICON = null;
    private final int DEFAULT_TYPE
            = JOptionPane.PLAIN_MESSAGE;
    private final int DEFAULT_OPTION_TYPE
            = JOptionPane.YES_NO_OPTION;

    private JTextArea area;

    /** Font used for displaying in the dialogs */
    public Font font;
    /** Background color used for displaying in the dialogs */
    public Color backgroundColor;
    /** Foreground (text) color used for displaying in the dialogs */
    public Color foregroundColor;
    /** Top dialog title used */
    public String dialogTitle;
    /** Frame or other component the dialog parents (centers) with */
    public Component parent;
    /** Type of icon used in the dialogs */
    public int type;
    /** Type of button options used in the dialogs */
    public int optionType;
    /** Custom icon (image) used in the dialogs */
    public Icon icon;

    
    /**
     * Class constructor sets class properties
     *
     * @param dialogTitle The title used on any dialog in the class
     */
    public Dialogs(String dialogTitle) {
        defaults();
        this.dialogTitle = dialogTitle;
        this.parent = null;
        init();
    }

    /**
     * Class constructor sets passed properties
     *
     * @param parent frame the dialog parents (centers) with
     * @param type type of icon used in the dialogs
     * @param icon custom icon (image) used in the dialogs
     * @param font font used in dialogs
     * @param backgroundColor background color used in dialogs
     * @param foregroundColor foreground (text) color used in dialogs
     * @param dialogTitle top dialog title used
     */
    public Dialogs(Component parent,
                   int type,
                   Icon icon,
                   Font font,
                   Color backgroundColor,
                   Color foregroundColor,
                   String dialogTitle) {
        defaults();
        this.parent = parent;
        this.type = type;
        this.icon = icon;
        this.font = font;
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.dialogTitle = dialogTitle;
        init();
    }

    /**
     * Outputs the passed text in a dialog
     *
     * @param text the text to display
     */
    public void show(String text) {
        area.setText(text);
        JOptionPane.showMessageDialog(parent, area, dialogTitle, type, icon);
    }


    /** Sets class properties to default values */
    private void defaults() {
        this.font            = DEFAULT_FONT;
        this.backgroundColor = DEFAULT_BACKGROUND_COLOR;
        this.foregroundColor = DEFAULT_FOREGROUND_COLOR;
        this.dialogTitle     = DEFAULT_TITLE;
        this.parent          = DEFAULT_COMPONENT;
        this.type            = DEFAULT_TYPE;
        this.optionType      = DEFAULT_OPTION_TYPE;
        this.icon            = DEFAULT_ICON;
        this.area            = new JTextArea();
    }

    /** Initializes the text area for the dialogs */
    private void init() {
        area.setFont(font);
        area.setBackground(backgroundColor);
        area.setForeground(foregroundColor);
    }
    
}