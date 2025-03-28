import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DimeTest {
    @Test
    public void testConstructor() {
        Dime d = new Dime(2025);
        assertEquals(0.10, d.getValue());
        assertEquals("Dime", d.getFamiliarName());
        assertEquals("IN GOD WE TRUST", d.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", d.getBackMotto());
        assertEquals("LIBERTY", d.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", d.getBackLabel());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertEquals(true, d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(2025, d.getYear());
    }
}
