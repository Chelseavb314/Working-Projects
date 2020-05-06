/** required package class namespace */
package showdowngame;

/**
 * required imports
 */
import showdowngame.objects.VillainBounceWalls;
import showdowngame.objects.VillainLives;
import showdowngame.objects.Wall;

import showdowngame.tools.GameCharacter;

import javax.swing.JLabel;

/**
 * Villain.java - game enemy to hero
 *
 * @author Mr. Wachs // Modified by Chelsea Bahsler
 * @since 15-May-2019
 */
public class Villain extends GameCharacter {

    private Hero hero;
    private VillainLives[] villainLives;
    private VillainBounceWalls[] villainBounceWalls;
    private Wall[] walls;

    /**
     * Constructor for the class, sets class property data
     *
     * @param villainLabel the label associated with the enemy
     * @param hero the user controlled character label
     * @param villainLives the array of villain life labels
     * @param walls the array of wall labels
     * @param villainBounceWalls the array of background colored wall labels
     */
    public Villain(JLabel villainLabel,
            Hero hero,
            VillainLives[] villainLives,
            Wall[] walls,
            VillainBounceWalls[] villainBounceWalls) {

        super(villainLabel,
                Globals.VILLAIN_AMOUNT,
                Globals.VILLAIN_DIRECTION,
                Globals.VILLAIN_DELAY,
                Globals.VILLAIN_DIRECTIONS);

        // associate parameters with objects
        this.hero = hero;
        this.walls = walls;
        this.villainBounceWalls = villainBounceWalls;
        this.villainLives = villainLives;

        // Sets Villain Label text and background label color
        this.sprite.debug("VILLAIN", Globals.VILLAIN_COLOR);

        spawn();

        // villain character starts moving right
        mover.moveRight();
    }

    /**
     * The action this villain does in it's timer
     */
    @Override
    public void action() {
        mover.move();

        for (int i = 0; i < villainBounceWalls.length; i++) {
            if (detector.isOverLapping(villainBounceWalls[i])) {
                reactor.bounceOff(villainBounceWalls[i]);
            }
        }
        redraw();
    }
    
}
