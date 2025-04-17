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
    /**
     * Manufacture method for Quarter.
     * @param c the coin to be manufactured
     * @return the manufactured coin
     */
    @Override
    public Coin manufacture(Coin c) {
        c = smeltStep(c);
        c = edge(c);
        c = imprintFrontImage(c);
        c = imprintFrontMotto(c);
        c = flip(c);
        c = imprintBackImage(c);
        c = imprintBackMotto(c);
        c = buff(c);
        return c;
    }
    /**
     * Smelt step for Quarter.
     * @param c the coin to be smelted
     */
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new CuproNickel()); 
        c.smelt();
        return c;
    }
    /**
     * Edge step for Quarter.
     * @param c the coin to be edged
     */
    protected Coin edge(Coin c) {
        c.setRidgedEdge(true);
        return c;
    }
    /**
     * Imprint front image for Quarter.
     * @param c the coin to be imprinted
     */
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("G_Washington");
        return c;
    }
    /**
     * Imprint back image for Quarter.
     * @param c the coin to be imprinted
     */
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Eagle");
        return c;
    }
    /**
     * Imprint front motto for Quarter.
     * @param c the coin to be imprinted
     */
    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        c.setYear(DEFAULT_YEAR);
        return c;
    }
    /**
     * Imprint back motto for Quarter.
     * @param c the coin to be imprinted
     */
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("QUARTER DOLLAR");
        return c;
    }
}
