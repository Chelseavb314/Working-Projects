/** required package class namespace */
package showdowngame;

/**
 * Main.java - A simple game where the user plays as the hero and is
 trying to take down the enemy.
 *
 * To start the game, use right and left arrow keys to move the hero located on
 * the bottom half of the project JFrame.
 *
 * Use the space bar to shoot when the "Bad Guy" is out in the open (not moving
 * behind the wall).
 *
 * Hero has three lives and the villain has two.
 *
 * If the user (hero) shoots when the villain is behind the wall, HERO LOSES 1
 * LIFE.
 *
 * If the user (hero) shoots when the villain is out in the open, VILLAIN LOSES
 * 1 LIFE.
 *
 *
 * @author Chelsea Bahsler
 * @since 30-May-2019
 *
 */
public class Main {

    /**
     * The main class for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Calls the UserInterface class
        UserInterface ui = new UserInterface();
    }
    
}
