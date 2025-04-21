/**
 * Dollar coin class.
 * @author Team E
 * @version 1.0
 */
public class Dollar extends Coin {
    /**
     * Default constructor for Dollar.
     */
    public Dollar() {
        super("Dollar", DOLLAR_VALUE, null, null, 
            null, null, null, 
            null, null, false, null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Dollar with specific year.
     * @param year the year of manufacture
     */
    public Dollar(int year) {
        super("Dollar", DOLLAR_VALUE, null, null, 
            null, null, null, 
            null, null, false, null, year);
    }

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return c;
    }

    protected Coin ImprintRidgedEdge(Coin c) {
        c.setRidgedEdge(true);

        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        c.setFrontImage("S_Anthony");

        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        c.setBackImage("Moon_Eagle");

        return c;
    }

    protected Coin ImprintFrontMotto(Coin c) {
        c.setFrontMotto("In GOD WE TRUST");
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