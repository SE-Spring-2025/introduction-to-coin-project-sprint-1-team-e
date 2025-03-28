import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NikelTest {
    private Coin testCoin = new mockNikel();

    @Test
    public void testConstructor() {
        assertEquals(0.05, testCoin.getValue());
        assertEquals("Nickel", testCoin.getFamiliarName());
        assertEquals("T_Jefferson", testCoin.getFrontImage());
        assertEquals("Jefferson_Memorial", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("FIVE CENTS", testCoin.getValueDescription());
        assertEquals(false, testCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
    }
}

class mockNikel extends Coin {
    public mockNikel() {
        super("Nickel", 0.05, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "T_Jefferson", "Jefferson_Memorial", 
              "FIVE CENTS", false, "Cupro-Nickel", 2025);
    }
}
