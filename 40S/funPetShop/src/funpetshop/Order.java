/** required package class namespace */
package funpetshop;

/**
 * Order.java - abstract class dealing with order number
 * and set/get price accessor/mutator methods
 *
 * @author Chelsea Bahsler
 * @since Nov. 13, 2019, 9:54:31 a.m.
 */
public abstract class Order {

    /**
     * property: number representing the amount of orders taken
     */
    protected int orderNumber;

    /**
     * Mutator Method: setting the price of the selling object
     * @param price of selling object
     */
    abstract void setPrice(double price);

    /**
     * Accessor Method: get the price of the object
     * @return cash number value of object
     */
    abstract double getPrice();

}
