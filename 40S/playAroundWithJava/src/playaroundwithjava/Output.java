/*
 */
package playaroundwithjava;

import javax.swing.JOptionPane;

/**
 * Output.java - description
 *
 * @author Chelsea Bahsler
 * @since Nov. 19, 2019, 12:57:54 p.m.
 */
public class Output {

    /**
     * Simple JOptionPane message dialog
     *
     * @param output the string text being outputted
     */
    protected void outputDialog(String output) {
        JOptionPane.showMessageDialog(null, output);
    }

    /**
     * User input JOptionPane message
     *
     * @param output the string text being outputted
     * @return
     */
    protected String outputInputDialog(String output) {
        return JOptionPane.showInputDialog(null, output);
    }

}
