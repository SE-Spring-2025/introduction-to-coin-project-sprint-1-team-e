import java.util.Calendar;

public class Coin {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double HALFDOLLAR_VALUE = 0.50;
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

    public Coin() {
        this(Coin.PENNY_VALUE, Calendar.getInstance().get(Calendar.YEAR));
    }

    public Coin(double value) {
        this(value, Calendar.getInstance().get(Calendar.YEAR));
    }

    public Coin(double value, int year) {
        this.value = value;
        this.year = year;

        this.frontMotto = "IN GOD WE TRUST";
        this.backMotto = "E PLURIBUS UNUM";
        this.frontLabel = "LIBERTY";
        this.backLabel = "UNITED STATES OF AMERICA";

        if (value == 0.01) {
            this.familiarName = "Penny";
            this.frontImage = "A_Lincoln";
            this.backImage = "Lincoln_Memorial";
            this.valueDescription = "ONE CENT";
            this.ridgedEdge = false;
            this.metallurgy = "Copper";
        } else if (value == 0.05) {
            this.familiarName = "Nickel";
            this.frontImage = "T_Jefferson";
            this.backImage = "Jefferson_Memorial";
            this.valueDescription = "FIVE CENTS";
            this.ridgedEdge = false;
            this.metallurgy = "Cupro-Nickel";
        } else if (value == 0.10) {
            this.familiarName = "Dime";
            this.frontImage = "F_Roosevelt";
            this.backImage = "Torch_Branches";
            this.valueDescription = "ONE DIME";
            this.ridgedEdge = true;
            this.metallurgy = "Cupro-Nickel";
        } else if (value == 0.25) {
            this.familiarName = "Quarter";
            this.frontImage = "G_Washington";
            this.backImage = "Eagle";
            this.valueDescription = "QUARTER DOLLAR";
            this.ridgedEdge = true;
            this.metallurgy = "Cupro-Nickel";
        } else if (value == 0.50) {
            this.familiarName = "HalfDollar";
            this.frontImage = "J_Kennedy";
            this.backImage = "Presidential_Seal";
            this.valueDescription = "HALF DOLLAR";
            this.ridgedEdge = true;
            this.metallurgy = "Cupro-Nickel";
        } else if (value == 1.00) {
            this.familiarName = "Dollar";
            this.frontImage = "S_Anthony";
            this.backImage = "Moon_Eagle";
            this.valueDescription = "ONE DOLLAR";
            this.ridgedEdge = true;
            this.metallurgy = "Cupro-Nickel";
        }
    }

    @Override
    public String toString() {
        return "[" + familiarName + "," + String.format("%.2f", value) + "," + year + ",'" + frontMotto + "','" + backMotto + "','"
                + frontImage + "','" + backImage + "','" + frontLabel + "','" + backLabel + "','" + valueDescription
                + "',"
                + (ridgedEdge ? "ridges" : "no-ridges") + ",'" + metallurgy + "']";
    }

    public String getFamiliarName() {
        return this.familiarName;
    }

    public Double getValue() {
        return this.value;
    }

    public String getFrontMotto() {
        return this.frontMotto;
    }

    public String getBackMotto() {
        return this.backMotto;
    }

    public String getFrontLabel() {
        return this.frontLabel;
    }

    public String getBackLabel() {
        return this.backLabel;
    }

    public String getFrontImage() {
        return this.frontImage;
    }

    public String getBackImage() {
        return this.backImage;
    }

    public String getValueDescription() {
        return this.valueDescription;
    }

    public Boolean getRidgedEdge() {
        return this.ridgedEdge;
    }

    public String getMetallurgy() {
        return this.metallurgy;
    }

    public int getYear() {
        return this.year;
    }
}
