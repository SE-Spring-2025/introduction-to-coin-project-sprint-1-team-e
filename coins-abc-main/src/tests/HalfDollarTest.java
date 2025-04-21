import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    @Test
    public void testConstructor() {
        HalfDollar h = new HalfDollar(2025);
        h =(HalfDollar)h.manufacture(h);
        assertEquals(0.50, h.getValue());
        assertEquals("HalfDollar", h.getFamiliarName());
        assertEquals("IN GOD WE TRUST", h.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", h.getBackMotto());
        assertEquals("LIBERTY", h.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", h.getBackLabel());
        assertEquals("J_Kennedy", h.getFrontImage());
        assertEquals("Presidential_Seal", h.getBackImage());
        assertEquals("HALF DOLLAR", h.getValueDescription());
        assertEquals(true, h.getRidgedEdge());
        assertEquals("Cupro-Nickel", h.getMetallurgy());
        assertEquals(2025, h.getYear());
    }
}
