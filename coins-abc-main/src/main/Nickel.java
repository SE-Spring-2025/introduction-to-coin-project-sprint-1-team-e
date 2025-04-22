/**
 * Nickel coin class.
 * @author Team E
 * @version 1.0
 */
public class Nickel extends Coin {
    /**
     * The maximum year allowed for this coin.
     */
    private static final int MAX_ALLOWED_YEAR = 2025;

    /**
     * Default constructor for Nickel.
     */
    
    public Nickel() {
        super("Nickel", NICKEL_VALUE, null, 
            null, null, null, 
            null, null, null, false, null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Nickel with specific year.
     * @param year the year of manufacture
     */
    public Nickel(int year) {
        super("Nickel", NICKEL_VALUE, null, 
            null, null, null, 
            null, null, null, false, null, year);
    }

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return this;
    }

    protected Coin imprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(false); 
        return c;
    }

    protected Coin imprintFrontImage(Coin c) {
        
        c.setFrontImage("T_Jefferson");
        return c;
    }

    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Jefferson_Memorial");
        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        if (c.getYear() != MAX_ALLOWED_YEAR) {
            c.setYear(c.getYear());
        }
        else {
            c.setYear(DEFAULT_YEAR);
        }
        return c;
    }

    protected Coin imprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("FIVE CENTS");
        return c;
    }
}
