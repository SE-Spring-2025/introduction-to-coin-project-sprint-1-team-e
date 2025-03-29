/**
 * Quarter coin class.
 * @author Team E
 * @version 1.0
 */
public class Quarter extends Coin {
    /**
     * Default constructor for Quarter.
     */
    public Quarter() {
        super("Quarter", QUARTER_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "G_Washington", 
            "Eagle", "QUARTER DOLLAR", true, "Cupro-Nickel", DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Quarter with specific year.
     * @param year the year of manufacture
     */
    public Quarter(int year) {
        super("Quarter", QUARTER_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "G_Washington", 
            "Eagle", "QUARTER DOLLAR", true, "Cupro-Nickel", year);
    }
}
