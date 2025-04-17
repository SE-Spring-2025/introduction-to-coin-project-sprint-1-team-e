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
            "Jefferson_Memorial", "FIVE CENTS", false, new CuproNickel(), 
            DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Nickel with specific year.
     * @param year the year of manufacture
     */
    public Nickel(int year) {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", 
            "Jefferson_Memorial", "FIVE CENTS", false, new CuproNickel(), year);
    }
    
    /**
     * Constructor for Nickel with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Nickel(int year, Metallurgy smelter) {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", 
            "Jefferson_Memorial", "FIVE CENTS", false, smelter, year);
    }

    protected Coin smeltStep(Coin c) {
        c.setSmelter(new DimeMetallurgy); //Definetely changing this
        c.smelt();

        return ;
    }

    protected Coin ImprintridgedEdge(Coin c) {
        

        return ;
    }

    protected Coin ImprintFrontImage(Coin c) {
        

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
