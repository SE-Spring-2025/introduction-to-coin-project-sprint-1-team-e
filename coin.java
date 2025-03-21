public class coin {
    private double value;
    private String commonName;
    private String frontMotto;
    private int manufactureYear;
    private String frontImage;
    private String backImage;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;

    //This method prints the information of the coin.
    public String toString() {
        return "[" + commonName + "," + value + "," + manufactureYear + ",'" + frontMotto + "','" + backMotto + "','"
                + frontImage + "','" + backImage + "','" + frontLabel + "','" + backLabel + "','" + valueDescription + "',"
                + (ridgedEdge ? "ridges" : "no-ridges") + ",'" + metallurgy + "']";
    }
}