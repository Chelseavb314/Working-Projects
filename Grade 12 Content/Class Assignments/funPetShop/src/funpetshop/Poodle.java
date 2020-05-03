/** required package class namespace */
package funpetshop;

/**
 * Poodle.java - sub-class of Dog
 *
 * @author Chelsea Bahsler
 * @since Nov. 13, 2019, 9:50:27 a.m.
 */
public class Poodle extends Dog {

    private static int poodlesSold;

    /**
     * constructor, set class properties
     *
     * @param name of poodle
     * @param orderNumber of dog that is being sold
     */
    public Poodle(String name, int orderNumber) {
        poodlesSold++;
        super.sell(99.99, orderNumber);
        setName(name);
        sold();
        

    }

    /**
     * Dog that has been sold to owners
     *
     * @return null
     */
    @Override
    public String sold() {

        if (poodlesSold == 1) {
            System.out.print(super.sold() + " and we have sold " + poodlesSold
                    + " poodle \n");
        } else {
            System.out.print(super.sold() + " and we have sold " + poodlesSold
                    + " poodles \n");
        }

        return null;

    }

}
