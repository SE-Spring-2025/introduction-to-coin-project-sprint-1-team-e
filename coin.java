public class Coin {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = .10;
    public static final double HALFDOLLAR_VALUE = .50;
    public static final double DOLLAR_VALUE = 1.00;

    private double value;
    private int year;
    private String familiarName;
    private String frontMotto;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String frontImage;
    private String backImage;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;

    public Coin(){
        //Should initialize a new coin(penny) with the current year.
    }

    public Coin(double value, int year){
        this.value = value;
        this.year = year;
        
        // Set properties common to all Coins according to the test file
        this.frontMotto = "IN GOD WE TRUST";
        this.backMotto = "E PLURIBUS UNUM";
        this.frontLabel = "LIBERTY";
        this.backLabel = "UNITED STATES OF AMERICA";

        if(value == 0.01){
                this.familiarName = "Penny";
                this.frontImage = "A_Lincoln";
                this.backImage = "Lincoln_Memorial";
                this.valueDescription = "ONE CENT";
                this.ridgedEdge = false;
                this.metallurgy = "Copper";
        }else if(value == 0.05){
            //continue pattern.
        }
    }
        public String toString() {
            return "[" + familiarName + "," + value + "," + year + ",'" + frontMotto + "','" + backMotto + "','"
                    + frontImage + "','" + backImage + "','" + frontLabel + "','" + backLabel + "','" + valueDescription + "',"
                    + (ridgedEdge ? "ridges" : "no-ridges") + ",'" + metallurgy + "']"; 
        
        }
    }
}