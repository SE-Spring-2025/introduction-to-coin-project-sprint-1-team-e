import java.text.DecimalFormat;

/**
 * Abstract class representing a US coin.
 * @author Team E
 * @version 1.0
 */
public abstract class Coin {
    /** Penny value constant. */
    public static final double PENNY_VALUE = 0.01;
    /** Nickel value constant. */
    public static final double NICKEL_VALUE = 0.05;
    /** Dime value constant. */
    public static final double DIME_VALUE = 0.10;
    /** Quarter value constant. */
    public static final double QUARTER_VALUE = 0.25;
    /** Half Dollar value constant. */
    public static final double HALFDOLLAR_VALUE = 0.50;
    /** Dollar value constant. */
    public static final double DOLLAR_VALUE = 1.00;
    /** Default year constant. */
    public static final int DEFAULT_YEAR = 2025;
    /** Coin counter for all coins. */
    private static final CoinCounts COIN_COUNTS = new CoinCounts();
    
    private String familiarName;
    private double value;
    private String frontMotto;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String frontImage;
    private String backImage;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    private int manufactureYear;
    private Metallurgy smelter;


    private boolean flipped = false;
    private boolean buffed = false;


    
    /**
     * Constructor for Coin class.
     * @param familiarName the common name for the coin
     * @param value the monetary value of the coin
     * @param smelter the metallurgy strategy for the coin
     * @param manufactureYear the year the coin was manufactured
     */
    public Coin(String familiarName, double value, 
        Metallurgy smelter, int manufactureYear) {
        this.familiarName = familiarName;
        this.value = value;
        this.smelter = smelter;
        this.manufactureYear = manufactureYear;
        
        // All other properties will be set by manufacture process steps
        this.frontMotto = null;
        this.backMotto = null;
        this.frontLabel = null;
        this.backLabel = null;
        this.frontImage = null;
        this.backImage = null;
        this.valueDescription = null;
        this.ridgedEdge = false;
        this.metallurgy = null;
    }

    /**
     * Template method for manufacturing a coin. 
     * This method defines the sequence of steps
     * and should not be overridden by subclasses.
     * @param c0 the initial coin (blob)
     * @return the fully manufactured coin
     */
    public final Coin manufacture(Coin c0) {
        Coin c1 = smeltStep(c0);
        Coin c2 = imprintRidgedEdge(c1);
        Coin c3 = imprintFrontImage(c2);
        Coin c4 = imprintFrontMotto(c3);
        Coin c5 = flip(c4);
        Coin c6 = imprintBackImage(c5);
        Coin c7 = imprintBackMotto(c6);
        Coin c8 = buff(c7);
        return c8;
    }

    // Abstract methods to implement in each subclass
    protected abstract Coin smeltStep(Coin c);
    protected abstract Coin imprintRidgedEdge(Coin c);
    protected abstract Coin imprintFrontImage(Coin c);
    protected abstract Coin imprintFrontMotto(Coin c);
    protected abstract Coin imprintBackImage(Coin c);
    protected abstract Coin imprintBackMotto(Coin c);

    /**
     * Default implementation for flipping a coin. Sets flipped to true.
     * @param c the coin to flip
     * @return the flipped coin
     */
    protected Coin flip(Coin c) {
        c.setFlipped(true);
        return c;
    }
    /**
     * Default implementation for buffing a coin. Sets buffed to true.
     * @param c the coin to buff
     * @return the buffed coin
     */
    protected Coin buff(Coin c) {
        c.setBuffed(true);
        return c;
    }

    /**
     * Uses the smelter to set the metallurgy.
     */
    public void smelt() {
        this.metallurgy = smelter.smelt();
    }

    /**
     * Gets the familiar name of the coin.
     * @return the familiar name
     */
    public String getFamiliarName() {
        return familiarName;
    }
    
    /**
     * Gets the monetary value of the coin.
     * @return the monetary value
     */
    public double getValue() {
        return value;
    }
    
    /**
     * Gets the front motto of the coin.
     * @return the front motto
     */
    public String getFrontMotto() {
        return frontMotto;
    }
    
    /**
     * Gets the back motto of the coin.
     * @return the back motto
     */
    public String getBackMotto() {
        return backMotto;
    }
    
    /**
     * Gets the front label of the coin.
     * @return the front label
     */
    public String getFrontLabel() {
        return frontLabel;
    }
    
    /**
     * Gets the back label of the coin.
     * @return the back label
     */
    public String getBackLabel() {
        return backLabel;
    }
    
    /**
     * Gets the front image of the coin.
     * @return the front image
     */
    public String getFrontImage() {
        return frontImage;
    }
    
    /**
     * Gets the back image of the coin.
     * @return the back image
     */
    public String getBackImage() {
        return backImage;
    }
    
    /**
     * Gets the value description of the coin.
     * @return the value description
     */
    public String getValueDescription() {
        return valueDescription;
    }
    
    /**
     * Gets whether the coin has a ridged edge.
     * @return true if the coin has a ridged edge, false otherwise
     */
    public boolean getRidgedEdge() {
        return ridgedEdge;
    }
    
    /**
     * Gets the metallurgy of the coin.
     * @return the metallurgy
     */
    public String getMetallurgy() {
        return metallurgy;
    }
    
    /**
     * Gets the manufacture year of the coin.
     * @return the manufacture year
     */
    public int getYear() {
        return manufactureYear;
    }

    /**
     * Gets the metallurgy delegate of the coin.
     * @return the metallurgy delegate
     */
    public Metallurgy getSmelter() {
        return smelter;
    }
        /**
     * Sets the familiar name of the coin.
     * @param familiarName the new familiar name
     */
    public void setFamiliarName(String familiarName) {
        this.familiarName = familiarName;
    }

    /**
     * Sets the monetary value of the coin.
     * @param value the new monetary value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Sets the front motto of the coin.
     * @param frontMotto the new front motto
     */
    public void setFrontMotto(String frontMotto) {
        this.frontMotto = frontMotto;
    }

    /**
     * Sets the back motto of the coin.
     * @param backMotto the new back motto
     */
    public void setBackMotto(String backMotto) {
        this.backMotto = backMotto;
    }

    /**
     * Sets the front label of the coin.
     * @param frontLabel the new front label
     */
    public void setFrontLabel(String frontLabel) {
        this.frontLabel = frontLabel;
    }

    /**
     * Sets the back label of the coin.
     * @param backLabel the new back label
     */
    public void setBackLabel(String backLabel) {
        this.backLabel = backLabel;
    }

    /**
     * Sets the front image of the coin.
     * @param frontImage the new front image
     */
    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    /**
     * Sets the back image of the coin.
     * @param backImage the new back image
     */
    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    /**
     * Sets the value description of the coin.
     * @param valueDescription the new value description
     */
    public void setValueDescription(String valueDescription) {
        this.valueDescription = valueDescription;
    }

    /**
     * Sets whether the coin has a ridged edge.
     * @param ridgedEdge true if the coin has a ridged edge, false otherwise
     */
    public void setRidgedEdge(boolean ridgedEdge) {
        this.ridgedEdge = ridgedEdge;
    }

    /**
     * Sets the metallurgy of the coin.
     * @param metallurgy the new metallurgy
     */
    public void setMetallurgy(String metallurgy) {
        this.metallurgy = metallurgy;
    }

    /**
     * Sets the manufacture year of the coin.
     * @param manufactureYear the new manufacture year
     */
    public void setYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    /**
     * Sets the metallurgy delegate of the coin.
     * @param smelter the new metallurgy delegate
     */
    public void setSmelter(Metallurgy smelter) {
        this.smelter = smelter;
        smelt();
    }

    /**
     * Sets the flipped state of the coin.
     * @param flipped true if the coin has been flipped
     */
    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }
    /**
     * Sets the buffed state of the coin.
     * @param buffed true if the coin has been buffed
     */
    public void setBuffed(boolean buffed) {
        this.buffed = buffed;
    }

    public static CoinCounts getCoinCounts() {
        return COIN_COUNTS;
    }

    /**
     * Checks if the coin is flipped.
     * @return true if the coin is flipped, false otherwise
     */
    public boolean isFlipped() {
        return flipped;
    }
    
    /**
     * Checks if the coin is buffed.
     * @return true if the coin is buffed, false otherwise
     */
    public boolean isBuffed() {
        return buffed;
    }
    /**
     * Returns a string representation of the coin.
     * @return a string representation of the coin
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);
        
        return "[" + familiarName
            + "," + formattedValue
            + "," + manufactureYear
            + ",'" + frontMotto
            + "','" + backMotto
            + "','" + frontImage
            + "','" + backImage
            + "','" + frontLabel
            + "','" + backLabel
            + "','" + valueDescription
            + "'," + (ridgedEdge ? "ridges" : "smooth")
            + ",'" + metallurgy
            + "']";
    }
}
