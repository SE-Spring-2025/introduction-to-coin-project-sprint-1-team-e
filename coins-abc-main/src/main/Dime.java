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
            "Torch_Branches", "ONE DIME", true, 
            new CuproNickle(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dime with specific year.
     * @param year the year of manufacture
     */
    public Dime(int year) {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
            "Torch_Branches", "ONE DIME", true, 
            new CuproNickle(), year);
    }
    
    /**
     * Constructor for Dime with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Dime(int year, Metallurgy smelter) {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
            "Torch_Branches", "ONE DIME", true, 
            smelter, year);
    }
}
