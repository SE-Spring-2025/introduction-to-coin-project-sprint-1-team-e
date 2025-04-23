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
        super("HalfDollar", HALFDOLLAR_VALUE, new CuproNickel(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for HalfDollar with specific year.
     * @param year the year of manufacture
     */
    public HalfDollar(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE, new CuproNickel(), year);
    }
    
    /**
     * Method to smelt the coin.
     * @param c the coin to smelt
     * @return the smelted coin
     */
    @Override
    protected Coin smeltStep(Coin c) {
        c.smelt();
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
        
        c.setFrontImage("J_Kennedy");
        return c;
    }

    /**
     * Method to imprint the back image on the coin.
     * @param c the coin to imprint
     * @return the imprinted coin
     */
    protected Coin imprintBackImage(Coin c) {
        
        c.setBackImage("Presidential_Seal");
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
        return c;
    }

    protected Coin imprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("HALF DOLLAR");
        return c;
    }
}
