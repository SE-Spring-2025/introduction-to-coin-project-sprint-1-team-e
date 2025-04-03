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
            "Eagle", "QUARTER DOLLAR", true, new CuproNickle(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Quarter with specific year.
     * @param year the year of manufacture
     */
    public Quarter(int year) {
        super("Quarter", QUARTER_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "G_Washington", 
            "Eagle", "QUARTER DOLLAR", true, new CuproNickle(), year);
    }
    
    /**
     * Constructor for Quarter with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Quarter(int year, Metallurgy smelter) {
        super("Quarter", QUARTER_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "G_Washington", 
            "Eagle", "QUARTER DOLLAR", true, smelter, year);
    }
}
