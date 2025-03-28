import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class QuarterTest {
    private Coin testQuarterCoin = new Quarter();

    @Test
    public void testConstructor() {
        // Updated expected values for a Penny
        assertEquals(0.25, testQuarterCoin.getValue());
        assertEquals("Quarter", testQuarterCoin.getFamiliarName());
        assertEquals("G_Washington", testQuarterCoin.getFrontImage());
        assertEquals("Eagle", testQuarterCoin.getBackImage());
        assertEquals("LIBERTY", testQuarterCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testQuarterCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testQuarterCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testQuarterCoin.getBackMotto());
        assertEquals("QUARTER DOLLAR", testQuarterCoin.getValueDescription());
        assertEquals(true, testQuarterCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testQuarterCoin.getMetallurgy());
    }
}

class mockQuarter extends Coin {
    public mockQuarter() {
        super("Quarter", 0.25, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "G_Washington", "Eagle", 
              "QUARTER DOLLAR", true, "Cupro-Nickel", 2025);
    }
}
