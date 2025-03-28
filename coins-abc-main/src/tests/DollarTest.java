import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DollarTest {
    private Coin testCoin = new mockDollar();

    @Test
    public void testConstructor() {
        assertEquals(1.00, testCoin.getValue());
        assertEquals("Dollar", testCoin.getFamiliarName());
        assertEquals("S_Anthony", testCoin.getFrontImage());
        assertEquals("Moon_Eagle", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("ONE DOLLAR", testCoin.getValueDescription());
        assertEquals(true, testCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
    }
}

class mockDollar extends Coin {
    public mockDollar() {
        super("Dollar", 1.00, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "S_Anthony", "Moon_Eagle", 
              "ONE DOLLAR", true, "Cupro-Nickel", 2025);
    }
}
