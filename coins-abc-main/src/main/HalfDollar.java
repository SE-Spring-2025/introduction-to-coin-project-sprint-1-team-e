import java.time.ZonedDateTime;

public class HalfDollar extends Coin{
    public HalfDollar(){
        super("HalfDollar", 0.50, "IN GOD WE TRUST", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, "Cupro-Nickel", 2025);
    }
    public HalfDollar(int year){
        super("HalfDollar", 0.50, "IN GOD WE TRUST", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "J_Kennedy", "Presidential_Seal", "HALF DOLLAR", true, "Cupro-Nickel", year);
    }
}