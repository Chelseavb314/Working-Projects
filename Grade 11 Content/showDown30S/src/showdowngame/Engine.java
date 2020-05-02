/** required package class namespace */
package showdowngame;

/**
 * required imports
 */
import showdowngame.objects.HitZones;
import showdowngame.objects.VillainBounceWalls;
import showdowngame.objects.HeroLives;
import showdowngame.objects.VillainLives;
import showdowngame.objects.Wall;
import showdowngame.objects.Description;
import showdowngame.objects.Background;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 * GameEngine.java - the logic connected to the user interface that runs the
 * game
 *
 * @author Mr. Wachs //modified by Chelsea Bahsler
 * @since 15-May-2019
 */
public class Engine {

    // single objects
    private Hero hero;
    private Villain villain;
    private Description description;
    private Background background;

    // multiple objects
    private HeroLives[] heroLives;
    private VillainLives[] villainLives;

    private VillainBounceWalls[] villainBounce; //Same color as background label
    private HitZones[] hitZones; //same color as background label
    private Wall[] walls;
  

    /**
     * Constructor for the class, sets class property data
     *
     * @param heroLabel colored label for the hero object
     * @param villainLabel colored label for the villain object
     * @param descriptionLabel label text for the game description object
     * @param backgroundLabel colored for the background object
     *
     * @param heroLifeLabels colored label array for 3 hero life objects
     * @param villainLifeLabels colored image array for 2 villain life objects
     * @param villainBounceLabels colored label array for 2 villain wall objects
     * @param wallLabels colored label array for 4 wall objects
     * @param hitZoneLabels colored label array for 2 hit zone objects
     *
     * @param ui the user interface container for the game
     */
    public Engine(
            JLabel heroLabel,
            JLabel villainLabel,
            JLabel descriptionLabel,
            JLabel backgroundLabel,

            JLabel[] heroLifeLabels,
            JLabel[] villainLifeLabels,
            JLabel[] wallLabels,
            JLabel[] villainBounceLabels,
            JLabel[] hitZoneLabels,
            UserInterface ui) {

        // JOptionPane Dialogs
        CustomDialogs dialog = new CustomDialogs(Globals.UI_TITLE);
        dialog.introduction();
        dialog.instructions();
        
        // create object
        background = new Background(backgroundLabel);
        description = new Description(descriptionLabel);

        // build the arrays
        heroLives = new HeroLives[heroLifeLabels.length]; // the lives of the hero
        villainLives = new VillainLives[villainLifeLabels.length]; // the lives of the villain

        villainBounce = new VillainBounceWalls[villainBounceLabels.length];
        walls = new Wall[wallLabels.length];
        hitZones = new HitZones[hitZoneLabels.length];

        // Filled Hero life array
        for (int i = 0; i < heroLives.length; i++) {
            heroLives[i] = new HeroLives(heroLifeLabels[i]);
        }
        // Filled Villain life array
        for (int i = 0; i < villainLives.length; i++) {
            villainLives[i] = new VillainLives(villainLifeLabels[i]);
        }
        // Filled background colored walls array
        for (int i = 0; i < villainBounce.length; i++) {
            villainBounce[i] = new VillainBounceWalls(villainBounceLabels[i]);
        }
        // Filled Wall array
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall(wallLabels[i]);
        }
        // Filled Hitzones array
        for (int i = 0; i < hitZones.length; i++) {
            hitZones[i] = new HitZones(hitZoneLabels[i]);
        }

        // Make the characters
        hero = new Hero(heroLabel, heroLives, villainLives,
                walls, hitZones);

        villain = new Villain(villainLabel, hero, villainLives,
                walls, villainBounce);

        hero.associateWith(villain);

        // set UI properties
        ui.setSize(Globals.UI_WIDTH, Globals.UI_HEIGHT);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }

    /**
     * The user's keyboard event of pressing a key to respond to
     *
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent event) {
        hero.keypress(event);
    }
    
}
