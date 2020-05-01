package funpetshop;

/**
 *
 * FunPetShop.java - This is a developed pet simulator that simulates the type
 * of pet to buy and it will count as a sale order at the store.
 *
 * @author Chelsea Bahsler
 * @since Nov. 13, 2019, 9:49:09 a.m.
 */
public class FunPetShop {

    private static String a;

    /**
     * @param args the command line arguments
     *
     * .replaceAll(string,string) → Replaces all of the instances of one section
     * of text with a new section.
     */
    public static void main(String[] args) {

        message(true);
        Poodle fluffy = new Poodle("Fluffy Pants", 101);
        Poodle scooby = new Poodle("Scooby Doo", 102);
        message(false);

    }

    /**
     * Output Welcome/Closing Message
     *
     * @param string
     */
    private static void message(Boolean bool) {
        if (bool == true) {
            a = ". . . WELCOME TO THE DOG-GONE-FUN-PET-SHOP . . .";
            System.out.println(a);

        }
        if (bool == false) {
            String b = a.replace("WELCOME TO ", "THANKS FOR COMING TO ");

        }

    }

}
