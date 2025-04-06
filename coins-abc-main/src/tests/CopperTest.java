import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CopperTest {
    @Test
    public void testSmelt() {
        Copper copper = new Copper();
        assertEquals("Copper", copper.smelt());
    }
}