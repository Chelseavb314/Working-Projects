
/** required package class namespace */
package funpetshop;

 
/**
 * T.java - description
 *
 * @author Chelsea Bahsler
 * @since Nov. 13, 2019, 10:49:05 a.m.
 */
class T 
{

    /**
     * Default constructor, set class properties
     */
    public T() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public T clone() {
        return this;
    }

}
