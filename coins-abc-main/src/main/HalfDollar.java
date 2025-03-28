/**
 * HalfDollar coin class.
 * @author Team E
 * @version 1.0
 */
public class HalfDollar extends Coin {
    /**
     * Default constructor for HalfDollar.
     */
    public HalfDollar() {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", 
            "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, 
            "Cupro-Nickel", DEFAULT_YEAR);
    }
    
    /**
     * Constructor for HalfDollar with specific year.
     * @param year the year of manufacture
     */
    public HalfDollar(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", 
            "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, 
            "Cupro-Nickel", year);
    }
}