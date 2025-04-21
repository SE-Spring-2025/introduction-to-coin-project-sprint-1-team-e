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
        super("Penny", PENNY_VALUE, null, null, null, null, null, null, null, false, new Copper(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Penny with specific year.
     * @param year the year of manufacture
     */
    public Penny(int year) {
        super("Penny", PENNY_VALUE, null, null, null, null, null, null, null, false, new Copper(), year);
    }

    @Override
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new Copper());
        c.smelt();
        return c;
    }

    protected Coin ImprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(false); // Nickels have smooth edges
        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        
        c.setFrontImage("A_Lincoln");
        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        c.setBackImage("Lincoln_Memorial");
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
