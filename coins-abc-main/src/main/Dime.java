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
            new CuproNickel(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dime with specific year.
     * @param year the year of manufacture
     */
    public Dime(int year) {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", 
            "Torch_Branches", "ONE DIME", true, 
            new CuproNickel(), year);
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

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel()); //Definetely changing this
        smelt();

        return this;
    }

    protected Coin ImprintridgedEdge(Coin c) {
        

        return ;
    }

    protected Coin ImprintFrontImage(Coin c) {
        c.frontImage = "F_Roosevelt";

        return ;
    }

    protected Coin ImprintBackImage(Coin c) {
        

        return ;
    }

    protected Coin ImprintFrontMotto(Coin c) {
        

        return ;
    }

    protected Coin ImprintBackMotto(Coin c) {
        

        return ;
    }
}
