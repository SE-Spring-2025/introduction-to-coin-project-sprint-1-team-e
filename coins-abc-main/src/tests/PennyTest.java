import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PennyTest {
    @Test
    public void testConstructor() {
        Penny p = new Penny(2025);
        assertEquals(0.01, p.getValue());
        assertEquals("Penny", p.getFamiliarName());
        assertEquals("IN GOD WE TRUST", p.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", p.getBackMotto());
        assertEquals("LIBERTY", p.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", p.getBackLabel());
        assertEquals("A_Lincoln", p.getFrontImage());
        assertEquals("Lincoln_Memorial", p.getBackImage());
        assertEquals("ONE CENT", p.getValueDescription());
        assertEquals(false, p.getRidgedEdge());
        assertEquals("Copper", p.getMetallurgy());
        assertEquals(2025, p.getYear());
    }

    @Test
    public void testManufacture() {
        Penny p = new Penny(2025);
        p = (Penny) p.manufacture(p);
        assertEquals(0.01, p.getValue());
        assertEquals("Penny", p.getFamiliarName());
        assertEquals("IN GOD WE TRUST", p.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", p.getBackMotto());
        assertEquals("LIBERTY", p.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", p.getBackLabel());
        assertEquals("A_Lincoln", p.getFrontImage());
        assertEquals("Lincoln_Memorial", p.getBackImage());
        assertEquals("ONE CENT", p.getValueDescription());
        assertEquals(false, p.getRidgedEdge());
        assertEquals("Copper", p.getMetallurgy());
        assertEquals(2025, p.getYear());
    }
}
