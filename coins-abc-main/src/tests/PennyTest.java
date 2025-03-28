import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PennyTest {
    private Coin testCoin = new mockPenny();

    @Test
    public void testConstructor() {
        // Updated expected values for a Penny
        assertEquals(0.01, testCoin.getValue());
        assertEquals("Penny", testCoin.getFamiliarName());
        assertEquals("A_Lincoln", testCoin.getFrontImage());
        assertEquals("Lincoln_Memorial", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("ONE CENT", testCoin.getValueDescription());
        assertEquals(false, testCoin.getRidgedEdge());
        assertEquals("Copper", testCoin.getMetallurgy());
    }
}

class mockPenny extends Coin {
    public mockPenny() {
        super("Penny", 0.01, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "A_Lincoln", "Lincoln_Memorial", 
              "ONE CENT", false, "Copper", 2025);
    }
}
