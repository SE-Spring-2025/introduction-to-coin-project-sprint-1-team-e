/**
 * Penny coin class.
 * @author Team E
 * @version 1.0
 */
public class Penny extends Coin {
    /**
     * Default constructor for Penny.
     */
    public Penny() {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, new Copper(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Penny with specific year.
     * @param year the year of manufacture
     */
    public Penny(int year) {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, new Copper(), year);
    }
    
    /**
     * Constructor for Penny with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Penny(int year, Metallurgy smelter) {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, smelter, year);
    }
}
