/** required package class namespace */
package funpetshop;

/**
 * Sale.java - description
 *
 * @author Chelsea Bahsler
 * @param <T> generic
 * @since Nov. 13, 2019, 9:59:27 a.m.
 */
public class Sale<T> extends Order {

    private T saleItem;
    private double price;

    /**
     * constructor, set class properties
     *
     * @param saleItem object(dog) being sold
     * @param orderNumber the order issued for the amount of dogs sold
     */
    public Sale(T saleItem, int orderNumber) {
        super.orderNumber = orderNumber;
    }

    /**
     * 
     * @param price 
     */
    @Override
    void setPrice(double price) {
        this.price = price;
    }

    @Override
    double getPrice() {
        return price;
    }

    protected int getOrderNumber() {
        return super.orderNumber;

    }

}
