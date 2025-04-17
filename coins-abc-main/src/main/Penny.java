/**
 * Penny coin class.
 * @author Team E
 * @version 1.0
 */
public class Penny extends Coin {
    /**
     * Default constructor for Penny.
     */
    public Penny() {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, new Copper(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Penny with specific year.
     * @param year the year of manufacture
     */
    public Penny(int year) {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, new Copper(), year);
    }
    
    /**
     * Constructor for Penny with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Penny(int year, Metallurgy smelter) {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", 
            "Lincoln_Memorial", "ONE CENT", false, smelter, year);
    }
    /**
     * Manufacture method for Penny.
     * @param c the coin to be manufactured
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
     * Smelt step for Penny.
     * @param c the coin to be smelted
     */
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new Copper()); 
        c.smelt();
        return c;
    }
    /**
     * Edge step for Penny.
     * @param c the coin to be edged
     */
    protected Coin edge(Coin c) {
        c.setRidgedEdge(true);
        return c;
    }
    /**
     * Imprint front image for Penny.
     * @param c the coin to be imprinted
     */
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("A_Lincoln");
        return c;
    }
    /**
     * Imprint back image for Penny.
     * @param c the coin to be imprinted
     */
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Lincoln_Memorial");
        return c;
    }
    /**
     * Imprint front motto for Penny.
     * @param c the coin to be imprinted
     */
    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        c.setYear(DEFAULT_YEAR);
        return c;
    }
    /**
     * Imprint back motto for Penny.
     * @param c the coin to be imprinted
     */
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("ONE CENT");
        return c;
    }
}
