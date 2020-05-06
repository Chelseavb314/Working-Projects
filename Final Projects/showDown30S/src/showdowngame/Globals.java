/** required package class namespace */
package showdowngame;

/**
 * required imports
 */
import showdowngame.tools.Directions;
import java.awt.Color;

/**
 * Globals.java - The Global variables for the project
 *
 * @author Mr. Wachs // Modified by Chelsea Bahsler
 *
 * @since 15-May-2019
 */
public class Globals {

    // UserInterface 
    public static String UI_TITLE = "Showdown Demo";
    public static int UI_WIDTH = 1007;
    public static int UI_HEIGHT = 546;

    
    // Hero
    public static String HERO_TEXT = "Hero";
    public static Color HERO_COLOR = new Color(0, 153, 153); // teal-blue
    public static int HERO_AMOUNT = 1;
    public static int HERO_DIRECTION = Directions.STOP;
    public static int HERO_DELAY = 5;
    public static int HERO_DIRECTIONS = Directions.TWO_DIRECTIONS;

    
    //Villain
    public static String VILLAIN_TEXT = "Bad Guy";
    public static Color VILLAIN_COLOR = Color.RED;
    public static int VILLAIN_AMOUNT = 2;
    public static int VILLAIN_DIRECTION = Directions.STOP;
    public static int VILLAIN_DELAY = 5;
    public static int VILLAIN_DIRECTIONS = Directions.TWO_DIRECTIONS;

    
    //Game Walls
    public static String WALL_TEXT = "";
    public static Color WALL_COLOR = Color.BLACK;

    
    //Background
    public static String BACKGROUND_TEXT = "";
    public static Color BACKGROUND_COLOR = new Color(80, 56, 120);
    // dark-purple

    
    //Description
    public static Color DESCRIPTION_COLOR = new Color(226, 201, 237);
    //pink-ish hue
    public static String DESCRIPTION_TEXT = "<html><br>"
            + "YOU are the HERO trying to take down the BAD GUY!<br><br>"
            + "\t He took the last cookie.<br>"
            + "\t YOUR LAST COOKIE!<br><br>"
            + "\t THIS. MEANS. WAR!!!!<br><br>"
            + "But who knows! Maybe when this is all over<br>"
            + "you can take them out for coffee..." // this line is cont. 
            + " or something...</html>";
    
}
