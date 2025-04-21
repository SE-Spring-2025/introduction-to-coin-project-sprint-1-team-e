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
        super("HalfDollar", HALFDOLLAR_VALUE, null, null, null, null, null, null, null, false, null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for HalfDollar with specific year.
     * @param year the year of manufacture
     */
    public HalfDollar(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE, null, null, null, null, null, null, null, false, null, year);
    }
    
    /**
     * Constructor for HalfDollar with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return this;
    }

    protected Coin ImprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(true); // HalfDollar has ridged edges
        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        
        c.setFrontMotto("J_Kennedy");
        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        
        c.setFrontMotto("Presidential_Seal");
        return c;
    }

    protected Coin ImprintFrontMotto(Coin c) {
        
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("Liberty");
        c.setYear(DEFAULT_YEAR);
        return c;
    }

    protected Coin ImprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        return c;
    }
}
