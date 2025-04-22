/**
 * Dime coin class.
 * @author Team E
 * @version 1.0
 */
public class Dime extends Coin {
    /**
     * The maximum year allowed for this coin.
     */
    private static final int MAX_ALLOWED_YEAR = 2025;

    /**
     * Default constructor for Dime.
     */
    public Dime() {
        super("Dime", DIME_VALUE, null, null, 
            null, null, null, 
            null, null, false, 
            null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dime with specific year.
     * @param year the year of manufacture
     */
    public Dime(int year) {
        super("Dime", DIME_VALUE, null, null, 
            null, null, null, 
            null, null, false, 
            null, year);
    }

    /**
     * Method to smelt the coin.
     * @param c the coin to smelt
     * @return the smelted coin
     */
    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return c;
    }

    /**
     * Method to imprint the ridged edge on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintRidgedEdge(Coin c) {
        c.setRidgedEdge(true);

        return c;
    }

    /**
     * Method to imprint the front image on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("F_Roosevelt");

        return c;
    }

    /**
     * Method to imprint the back image on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Torch_Branches");

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
        c.setValueDescription("ONE DIME");
        return c;
    }
}
