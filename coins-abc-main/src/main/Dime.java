/**
 * Dime coin class.
 * @author Team E
 * @version 1.0
 */
public class Dime extends Coin {
    /**
     * Default constructor for Dime.
     */
    public Dime() {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
            "Torch_Branches", "ONE DIME", true, "Cupro-Nickel", DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dime with specific year.
     * @param year the year of manufacture
     */
    public Dime(int year) {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
            "Torch_Branches", "ONE DIME", true, "Cupro-Nickel", year);
    }
}
