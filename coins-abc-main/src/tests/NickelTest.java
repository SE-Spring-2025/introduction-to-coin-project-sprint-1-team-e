import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NickelTest {
    @Test
    public void testConstructor() {
        Nickel n = new Nickel(2025);
        assertEquals(0.05, n.getValue());
        assertEquals("Nickel", n.getFamiliarName());
        assertEquals("IN GOD WE TRUST", n.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", n.getBackMotto());
        assertEquals("LIBERTY", n.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", n.getBackLabel());
        assertEquals("T_Jefferson", n.getFrontImage());
        assertEquals("Jefferson_Memorial", n.getBackImage());
        assertEquals("FIVE CENTS", n.getValueDescription());
        assertEquals(false, n.getRidgedEdge());
        assertEquals("Cupro-Nickel", n.getMetallurgy());
        assertEquals(2025, n.getYear());
    }
}
