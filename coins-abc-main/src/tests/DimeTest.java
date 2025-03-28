import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DimeTest {

    private Coin testCoin = new mockDime();

    @Test
    public void testConstructor() {
        assertEquals(0.10, testCoin.getValue());
        assertEquals("Dime", testCoin.getFamiliarName());
        assertEquals("F_Roosevelt", testCoin.getFrontImage());
        assertEquals("Torch_Branches", testCoin.getBackImage());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("ONE DIME", testCoin.getValueDescription());
        assertEquals(true, testCoin.getRidgedEdge());
        assertEquals("Cupro-Nickel", testCoin.getMetallurgy());
    }
}

class mockDime extends Coin {
    public mockDime() {
        super("Dime", 0.10, 
              "IN GOD WE TRUST", "E PLURIBUS UNUM", 
              "LIBERTY", "UNITED STATES OF AMERICA", 
              "F_Roosevelt", "Torch_Branches", 
              "ONE DIME", true, "Cupro-Nickel", 2025);
    }
}
