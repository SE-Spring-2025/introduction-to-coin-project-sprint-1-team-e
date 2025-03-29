/**
 * Nickel coin class.
 * @author Team E
 * @version 1.0
 */
public class Nickel extends Coin {
    /**
     * Default constructor for Nickel.
     */
    public Nickel() {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", 
            "Jefferson_Memorial", "FIVE CENTS", false, "Cupro-Nickel", 
            DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Nickel with specific year.
     * @param year the year of manufacture
     */
    public Nickel(int year) {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", 
            "Jefferson_Memorial", "FIVE CENTS", false, "Cupro-Nickel", year);
    }
}
