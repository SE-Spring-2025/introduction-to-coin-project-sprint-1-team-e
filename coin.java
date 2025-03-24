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

    // No-argument constructor
    public coin() {
        this.value = 0.0;
        this.commonName = "Unknown";
        this.manufactureYear = 0;
        this.frontImage = "No front image";
        this.backImage = "No back image";
        this.frontMotto = "No front motto";
        this.backMotto = "No back motto";
        this.valueDescription = "No value description";
        this.ridgedEdge = false;
        this.metallurgy = "Unknown";
    }

    //This method prints the information of the coin.
    public String toString() {
        return "[" + commonName + "," + value + "," + manufactureYear + ",'" + frontMotto + "','" + backMotto + "','"
                + frontImage + "','" + backImage + "','" + frontLabel + "','" + backLabel + "','" + valueDescription + "',"
                + (ridgedEdge ? "ridges" : "no-ridges") + ",'" + metallurgy + "']"; 
    }
}