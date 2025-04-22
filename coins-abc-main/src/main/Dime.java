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

    protected Coin imprintRidgedEdge(Coin c) {
        c.setRidgedEdge(true);

        return c;
    }

    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("F_Roosevelt");

        return c;
    }

    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Torch_Branches");

        return c;
    }

    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        if (c.getYear() != 2025) {
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
        c.setValueDescription("ONE DIME");
        return c;
    }
}
