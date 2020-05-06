/** required package class namespace */
package showdowngame;

/**
 * required imports
 */
import showdowngame.objects.HeroLives;
import showdowngame.objects.HitZones;
import showdowngame.objects.VillainLives;
import showdowngame.objects.Wall;

import showdowngame.tools.Directions;
import showdowngame.tools.GameCharacter;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 * Hero.java - representation of user controlled hero
 *
 * @author Mr. Wachs // modified by Chelsea Bahsler
 * @since 15-May-2019
 */
public class Hero extends GameCharacter {

    private Villain villain;

    private VillainLives[] villainLives;
    private HeroLives[] heroLives;
    private HitZones[] hitZones;
    private Wall[] walls;

    private int heroCount = 0;
    private int villianCount = 0;

    //call class
    CustomDialogs dialogs = new CustomDialogs(Globals.UI_TITLE);

    /**
     * Constructor for the class, sets class property data
     *
     * @param heroLabel the label associated with the hero color for the game
     * character
     * @param heroLives the array of hero life objects
     * @param villainLives the array of villain life objects
     * @param walls the array of wall objects
     * @param hitZones the array of hit-zones
     */
    public Hero(JLabel heroLabel,
            HeroLives[] heroLives,
            VillainLives[] villainLives,
            Wall[] walls,
            HitZones[] hitZones) {

        super(heroLabel, 1, Directions.STOP, 1,
                Directions.TWO_DIRECTIONS);

        // associate parameters with objects
        this.heroLives = heroLives;
        this.villainLives = villainLives;

        this.walls = walls;
        this.hitZones = hitZones;

        // hero text & color properties
        sprite.debug("HERO", Globals.HERO_COLOR);

        spawn();
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     *
     * @param event the keyboard event registered
     */
    @Override
    public void keypress(KeyEvent event) {
        super.keypress(event);                  // send event to super class
        checkSpace(event);
    }

    /**
     * The action this hero does in it's timer
     */
    @Override
    public void action() {

        mover.move();                                   // move coordinates
        for (int i = 0; i < walls.length; i++) {        // traverse walls
            if (detector.isOverLapping(walls[i])) {     // colliding with wall
                reactor.stickTo(walls[i]);              // stick to wall
                i = walls.length;                       // exit loop early
                mover.stop();                           // stop movement                                     
            }
        }
        redraw();
    }

    /**
     * What happens when the SpaceBar key is pressed
     *
     * @param event the key event
     */
    private void checkSpace(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_SPACE) {
            for (int i = 0; i < hitZones.length; i++) {

                if (detector.isOverLapping(hitZones[i])) {
                    if (villain.detector.isOverLapping(hitZones[i])) {

                        // one villain life label is hidden
                        villainLives[villianCount].hide();
                        villianCount++;

                        // both villain life labels are hidden
                        if (villianCount >= villainLives.length) {
                            winGame();
                        }
                    } else {
                        // one hero life label is hidden
                        heroLives[heroCount].hide();
                        heroCount++;

                        // all three hero lives are hidden
                        if (heroCount >= heroLives.length) {
                            loseGame();
                        }
                    }
                }
            }
        }
    }

    /**
     * Villain object associated with Hero class
     *
     * @param villain class
     */
    void associateWith(Villain villain) {
        this.villain = villain;
    }

    /**
     * Hero has won the game (Villain lost all their lives)
     */
    private void winGame() {
        stopMoving();                         // all gameCharacters stop
        dialogs.WinnerMessage();              // "You Won" message is displayed
        System.exit(0);                       // terminate application
    }

    /**
     * Player has lost all their lives
     */
    private void loseGame() {
        stopMoving();                         // all gameCharacters stop
        dialogs.gameOverMessage();            // "Game Over" message is displayed
        System.exit(0);                       // terminate application  
    }

    /**
     * Stops all gameCharacters from moving
     */
    private void stopMoving() {
        villain.mover.stop();
        this.mover.stop();
    }
    
}
