/** required package class namespace */
package funpetshop;

/**
 * Dog.java - Pet Dog being sold
 *
 * @author Chelsea Bahsler
 * @since Nov. 13, 2019, 9:51:06 a.m.
 */
class Dog implements Pet {

    private String name;
    private Sale sale;

    /**
     * Set Dog name
     *
     * @param name of Dog
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor Method: get name of dog
     *
     * @return retrieved name of Dog
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sell Dog Object
     *
     * @param price of dog being sold
     * @param orderNumber of dog that is being sold
     */
    public void sell(double price, int orderNumber) {
        sale = new Sale(this, orderNumber);
        sale.setPrice(price);
    }

    /**
     * outputs to System.out.println(): the order number, the pet’s name, and
     * the price of the pet
     *
     * @return
     */
    @Override
    public String sold() {
        System.out.print("Order " + sale.getOrderNumber() + " "
                + getName() + " is worth " + sale.getPrice());
        return "";
    }

}
