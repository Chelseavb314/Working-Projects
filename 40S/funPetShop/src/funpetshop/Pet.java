package funpetshop;

/**
 * Pet - interface that contains: mutator and accessor methods
 *
 * @author Chelsea
 * @since Nov. 13, 2019
 */
public interface Pet {

    /**
     * mutator method
     *
     * @param name of dog has been set
     */
    public void setName(String name);

    /**
     * accessor method
     *
     * @return name assigned to dog
     */
    public String getName();

    /**
     * Dog that have been sold to owners
     *
     * @return Thank you
     */
    public String sold();
}
