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
        super("Penny", PENNY_VALUE, null, null, null, null, null, null, null, false, new Copper(), DEFAULT_YEAR);
    }
    
    /**
     * Constructor for Penny with specific year.
     * @param year the year of manufacture
     */
    public Penny(int year) {
        super("Penny", PENNY_VALUE, null, null, null, null, null, null, null, false, new Copper(), year);
    }
    
    /**
     * Constructor for Penny with specific year and metallurgy.
     * @param year the year of manufacture
     * @param smelter the metallurgy strategy
     */
    public Penny(int year, Metallurgy smelter) {
        super("Penny", PENNY_VALUE, null, null, null, null, null, null, null, false, smelter, year);
    }

    @Override
    protected Coin smeltStep(Coin c) {
        c.setSmelter(new Copper());
        c.smelt();
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.setRidgedEdge(false); // Pennies have smooth edges
        return c;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("A_Lincoln");
        return c;
    }

    @Override
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Lincoln_Memorial");
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
        c.setValueDescription("ONE CENT");
        return c;
    }
}
