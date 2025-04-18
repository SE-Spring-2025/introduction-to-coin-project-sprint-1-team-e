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
        super("HalfDollar", HALFDOLLAR_VALUE, null, null, null, null, null, null, null, false, null, DEFAULT_YEAR);
  
    }
    
    /**
     * Constructor for Nickel with specific year.
     * @param year the year of manufacture
     */
    public Nickel(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE, null, null, null, null, null, null, null, false, null, year);
    }

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return this;
    }

    protected Coin ImprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(false); // Nickels have smooth edges
        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        
        c.setFrontImage("T_Jefferson");
        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        c.setBackImage("Jefferson_Memorial");
        return c;
    }

    protected Coin ImprintFrontMotto(Coin c) {
        
        c.setFrontMotto("IN GOD WE TRUST");
        return c;
    }

    protected Coin ImprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        return c;
    }
}
