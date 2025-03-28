import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    private Coin testCoin = new mockHalfDollar();

    @Test
    public void testConstructor() {
        assertEquals(0.50, testCoin.getValue());
        assertEquals("HalfDollar", testCoin.getFamiliarName());
        assertEquals("J_Kennedy", testCoin.getFrontImage());
        assertEquals("Presidential_Seal", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("HALF DOLLAR", testCoin.getValueDescription());
        assertEquals(true, testCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
    }
}

class mockHalfDollar extends Coin {
    public mockHalfDollar() {
        super("HalfDollar", 0.50, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "J_Kennedy", "Presidential_Seal", 
              "HALF DOLLAR", true, "Cupro-Nickel", 2025);
    }
}
