public class Penny extends Coin{
    public Penny(){
        super("Penny", 0.01, "IN GOD WE TRUST", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", "Lincoln_Memorial", "ONE CENT", false, "Copper", 2025);
    }
    public Penny(int year){
        super("Penny", 0.01, "IN GOD WE TRUST", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", "Lincoln_Memorial", "ONE CENT", false, "Copper", year);
    }
}
