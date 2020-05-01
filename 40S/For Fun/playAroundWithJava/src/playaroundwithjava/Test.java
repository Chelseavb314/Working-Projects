/*
 */
package playaroundwithjava;

/**
 * Test.java - description
 *
 * @author Chelsea Bahsler
 * @since Nov. 19, 2019, 12:57:14 p.m.
 */
public class Test {

   
    public Test() {

        String a = "Banana is my favourite cat";

        output.OutputDialog(a);
        output.OutputDialog(replace(a));

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

}
