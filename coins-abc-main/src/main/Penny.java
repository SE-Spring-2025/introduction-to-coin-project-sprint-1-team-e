/**
 * Penny coin class.
 * @author Team E
 * @version 1.0
 */
public class Penny extends Coin {
    /**
     * The maximum year allowed for this coin.
     */
    private static final int MAX_ALLOWED_YEAR = 2025;

    /**
     * Default constructor for Penny.
     */
    public Penny() {
        super("Penny", PENNY_VALUE, null, null,
            null, null, null, null,
            null, false, null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Penny with specific year.
     * @param year the year of manufacture
     */
    public Penny(int year) {
        super("Penny", PENNY_VALUE, null, null,
        null, null, null,
        null, null, false, null, year);
    }

    @Override
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new Copper());
        c.smelt();
        return c;
    }

    /**
     * Method to imprint the ridged edge on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(false);
        return c;
    }

    /**
     * Method to imprint the front image on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
        protected Coin imprintFrontImage(Coin c) {
        
        c.setFrontImage("A_Lincoln");
        return c;
    }

    /**
     * Method to imprint the back image on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Lincoln_Memorial");
        return c;
    }

    /**
     * Method to imprint the front motto on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
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

    /**
     * Method to imprint the back motto on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("ONE CENT");
        return c;
    }
}
