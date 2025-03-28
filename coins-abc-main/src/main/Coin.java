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
    
    /**
     * Constructor for Coin class.
     * @param familiarName the common name for the coin
     * @param value the monetary value of the coin
     * @param frontMotto the motto on the front of the coin
     * @param backMotto the motto on the back of the coin
     * @param frontLabel the label on the front of the coin
     * @param backLabel the label on the back of the coin
     * @param frontImage the image on the front of the coin
     * @param backImage the image on the back of the coin
     * @param valueDescription the description of the coin's value
     * @param ridgedEdge whether the coin has a ridged edge
     * @param metallurgy the metal composition of the coin
     * @param manufactureYear the year the coin was manufactured
     */
    public Coin(String familiarName, double value, String frontMotto, 
                String backMotto, String frontLabel, String backLabel, 
                String frontImage, String backImage, String valueDescription, 
                boolean ridgedEdge, String metallurgy, int manufactureYear) {
        this.familiarName = familiarName;
        this.value = value;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.metallurgy = metallurgy;
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
