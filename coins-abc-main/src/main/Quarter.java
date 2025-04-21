/**
 * Quarter coin class.
 * @author Team E
 * @version 1.0
 */
public class Quarter extends Coin {
    /**
     * Default constructor for Quarter.
     */
    public Quarter() {
        super("Quarter", QUARTER_VALUE, null, null, 
            null, null, null, 
            null, null, true, null, DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Quarter with specific year.
     * @param year the year of manufacture
     */
    public Quarter(int year) {
        super("Quarter", QUARTER_VALUE, null, null, 
            null, null, null, 
            null, null, true, null, year);
    }
    @Override
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new CuproNickel()); 
        c.smelt();
        return c;
    }
    protected Coin ImprintRidgedEdge(Coin c) {
        
        c.setRidgedEdge(true);
        return c;
    }

    protected Coin ImprintFrontImage(Coin c) {
        
        c.setFrontImage("G_Washington");
        return c;
    }

    protected Coin ImprintBackImage(Coin c) {
        c.setBackImage("Eagle");
        return c;
    }

    protected Coin ImprintFrontMotto(Coin c) {
        
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        if(c.getYear() != 2025){
            c.setYear(c.getYear());
        }
        else{
            c.setYear(DEFAULT_YEAR);
        }
        return c;
    }

    protected Coin ImprintBackMotto(Coin c) {
        
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("QUARTER DOLLAR");
        return c;
    }
}
