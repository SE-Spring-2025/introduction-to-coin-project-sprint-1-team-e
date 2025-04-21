/**
 * Dime coin class.
 * @author Team E
 * @version 1.0
 */
public class Dime extends Coin {
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

    protected Coin smeltStep(Coin c) {
        setSmelter(new CuproNickel());
        smelt();

        return c;
    }

    protected Coin ImprintRidgedEdge(Coin c) {
        c.setRidgedEdge(false);

        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        c.setFrontImage("F_Roosevelt");

        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        c.setBackImage("Torch_Branches");

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