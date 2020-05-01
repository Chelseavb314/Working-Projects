/*
 */
package playaroundwithjava;

/**
 * Test.java - the testing class for unfamiliar code
 *
 * @author Chelsea Bahsler
 * @since Nov. 19, 2019, 12:57:14 p.m.
 */
public class Test extends Output {

    Output output;

    final private static String CLASSIC = "OBJECTION", HOLD_IT_A = "Hold It!",
            SADMAHDI = "Satorha", SIMON = "SILENCE";

    private static String ACE_ATTORNEY;

    /**
     * Default Constructor: where testing takes place.
     */
    public Test() {

        //instantiate Objects (for JOptionPane Messages)
        output = new Output();
        StringBuilder str1 = new StringBuilder("Hello World");

        // STRING BUILDER STUFF - (StringBuilder is a maunal set-up thing ...
        output.outputDialog(str1.toString()); // instantiated StringBuilder
        output.outputDialog(reverse(str1).toString()); //reversed StringBuilder

        // OUTPUT STRING STUFF
        String a = "Banana is my favourite cat";

        output.outputDialog(a); //normal message box w/ unaltered message
        output.outputDialog(replace(a)); //string with replaced characters
        output.outputDialog(replaceAll(a)); // replace parts of the text

        // (.equals) comparing strings
    }

    /**
     * Replace old character and replace with new one
     *
     * @param String being searched for the old character
     * @return replaced character
     */
    private String replace(String a) {

        String replace = a.replace('a', '4');
        return replace;

    }

    /**
     * Replaces all of the instances of one section of text with a new section.
     *
     * @param a String undergoing replacement
     * @return replaced String
     */
    private String replaceAll(String a) {
        String mollie = "Mollie";
        String replaceAll = a.replaceAll("Banana", mollie);

        return replaceAll;
    }

    /**
     * Reverses the string
     *
     * @param build StringBuilder
     * @return reversed StringBuilder
     */
    private StringBuilder reverse(StringBuilder build) {
        StringBuilder x = build.reverse();
        return x;

    }

    /**
     * Returns true/false depending on whether the two strings are equal. (Case
     * Sensitive!)
     *
     * @param a String being tested
     * @return true/false
     */
    private void equalsString(String a) {

        ACE_ATTORNEY = output.outputInputDialog("What's a phrase that is yelled "
                + " by either\n the prosecuters or the defense attorneys"
                + " in Ace Attorney?\nPlease don't use quotation marks"
                + " \"\"or exclamation points (!)");

        //COMPARISONS
        do {
            if (ACE_ATTORNEY.equals(CLASSIC)) {
                String wright = "\"Words can not describe how screwed I am.\"\n"
                        + "-Phoenix Wright\n"
                        + " (Farewell, My Turnabout - Justice for All)";

                output.outputDialog(wright);

            } else if (ACE_ATTORNEY.equals(HOLD_IT_A)) {
                String edgeworth = "\"Our job is to find the truth, \n"
                        + " no matter how painful it may be.\"";

                output.outputDialog(edgeworth);

            } else if (ACE_ATTORNEY.equals(SADMAHDI)) {

                String sadMonk
                        = "In all this time, not once did I reflect"
                        + " on my own conduct... \n"
                        + " for I had believed all was fate."
                        + " Lost in my own sense of resignation,"
                        + " I was unable to wake up from my despair.\n"
                        + " But you, Apollo. You have awakened me with your"
                        + " demonstration of our father's creed.\n"
                        + " A dragon never yields.";

                output.outputDialog(sadMonk);

            } else if (ACE_ATTORNEY.equals(SIMON)) {
                String blackquill = "Athena:\n"
                        + " A threat like that won't work"
                        + " on Prosecutor Blackquill!\n"
                        + " After all, he's already used to looking like a panda"
                        + " in THIS life!\n\n"
                        + "Blackquill:\n" + "Who are you calling a panda?!";

                output.outputDialog(blackquill);

            } else {

                String vonKarma = "A fool who doesn't think\n"
                        + " is more foolish than a fool who foolishly thinks.";

                output.outputDialog(vonKarma);
            }
        } while (ACE_ATTORNEY.equals(output.outputInputDialog(a)));

    }
}
