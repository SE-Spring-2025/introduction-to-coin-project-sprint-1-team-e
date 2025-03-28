import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class QuaterTest {
    private Coin testCoin = new mockQuater();

    @Test
    public void testConstructor() {
        assertEquals(0.25, testCoin.getValue());
        assertEquals("Quarter", testCoin.getFamiliarName());
        assertEquals("G_Washington", testCoin.getFrontImage());
        assertEquals("Eagle", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("QUARTER DOLLAR", testCoin.getValueDescription());
        assertEquals(true, testCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
    }
}

class mockQuater extends Coin {
    public mockQuater() {
        super("Quarter", 0.25, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "G_Washington", "Eagle", 
              "QUARTER DOLLAR", true, "Cupro-Nickel", 2025);
    }
}