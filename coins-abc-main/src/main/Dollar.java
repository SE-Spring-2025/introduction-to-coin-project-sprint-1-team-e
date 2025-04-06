/**
 * Dollar coin class.
 * @author Team E
 * @version 1.0
 */
public class Dollar extends Coin {
    /**
     * Default constructor for Dollar.
     */
    public Dollar() {
        super("Dollar", DOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "S_Anthony", 
            "Moon_Eagle", "ONE DOLLAR", true, new CuproNickel(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dollar with specific year.
     * @param year the year of manufacture
     */
    public Dollar(int year) {
        super("Dollar", DOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "S_Anthony", 
            "Moon_Eagle", "ONE DOLLAR", true, new CuproNickel(), year);
    }
    
    /**
     * Constructor for Dollar with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Dollar(int year, Metallurgy smelter) {
        super("Dollar", DOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "S_Anthony", 
            "Moon_Eagle", "ONE DOLLAR", true, smelter, year);
    }
}
