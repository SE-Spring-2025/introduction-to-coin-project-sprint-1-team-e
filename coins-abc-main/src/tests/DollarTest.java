import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testConstructor() {
        Dollar d = new Dollar(2025);
        assertEquals(1.00, d.getValue());
        assertEquals("Dollar", d.getFamiliarName());
        assertEquals("IN GOD WE TRUST", d.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", d.getBackMotto());
        assertEquals("LIBERTY", d.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", d.getBackLabel());
        assertEquals("S_Anthony", d.getFrontImage());
        assertEquals("Moon_Eagle", d.getBackImage());
        assertEquals("ONE DOLLAR", d.getValueDescription());
        assertEquals(true, d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(2025, d.getYear());
    }
}
