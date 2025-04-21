import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class QuarterTest {
    @Test
    public void testConstructor() {
        Quarter q = new Quarter(2000);
        q = (Quarter) q.manufacture(q);
        assertEquals(0.25, q.getValue());
        assertEquals("Quarter", q.getFamiliarName());
        assertEquals("IN GOD WE TRUST", q.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", q.getBackMotto());
        assertEquals("LIBERTY", q.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", q.getBackLabel());
        assertEquals("G_Washington", q.getFrontImage());
        assertEquals("Eagle", q.getBackImage());
        assertEquals("QUARTER DOLLAR", q.getValueDescription());
        assertEquals(true, q.getRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
        assertEquals(2000, q.getYear());
    }

    @Test
    public void testManufacture() {
        Quarter q = new Quarter(2025);
        q = (Quarter) q.manufacture(q);
        assertEquals(0.25, q.getValue());
        assertEquals("Quarter", q.getFamiliarName());
        assertEquals("IN GOD WE TRUST", q.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", q.getBackMotto());
        assertEquals("LIBERTY", q.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", q.getBackLabel());
        assertEquals("G_Washington", q.getFrontImage());
        assertEquals("Eagle", q.getBackImage());
        assertEquals("QUARTER DOLLAR", q.getValueDescription());
        assertEquals(true, q.getRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
        assertEquals(2025, q.getYear());
    }
}
