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
            new CuproNickle(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for HalfDollar with specific year.
     * @param year the year of manufacture
     */
    public HalfDollar(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", 
            "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, 
            new CuproNickle(), year);
    }
    
    /**
     * Constructor for HalfDollar with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public HalfDollar(int year, Metallurgy smelter) {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", 
            "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", 
            "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, 
            smelter, year);
    }
}
