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
            null, null, true, new CuproNickel(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Quarter with specific year.
     * @param year the year of manufacture
     */
    public Quarter(int year) {
        super("Quarter", QUARTER_VALUE, null, null, 
            null, null, null, 
            null, null, true, new CuproNickel(), year);
    }
    
    /**
     * Constructor for Quarter with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Quarter(int year, Metallurgy smelter) {
        super("Quarter", QUARTER_VALUE, null, null, 
            null, null, null, 
            null, null, true, smelter, year);
    }
    
    @Override
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new CuproNickel()); 
        c.smelt();
        return c;
    }
    @Override
    protected Coin edge(Coin c) {
        c.setRidgedEdge(true);
        return c;
    }
    @Override
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("G_Washington");
        return c;
    }
    @Override
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Eagle");
        return c;
    }
    @Override
    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        c.setYear(c.getYear()); // Use the year already set in constructor
        return c;
    }
    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("QUARTER DOLLAR");
        return c;
    }
}
