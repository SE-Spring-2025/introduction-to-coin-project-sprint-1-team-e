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
        super("Nickel", NICKEL_VALUE, new CuproNickel(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Nickel with specific year.
     * @param year the year of manufacture
     */
    public Nickel(int year) {
        super("Nickel", NICKEL_VALUE, new CuproNickel(), year);
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
        return c;
    }

    protected Coin imprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("FIVE CENTS");
        return c;
    }
}
