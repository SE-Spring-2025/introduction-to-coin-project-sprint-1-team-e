import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CuproNickelTest {
    @Test
    public void testSmelt() {
        CuproNickel cuproNickel = new CuproNickel();
        assertEquals("Cupro-Nickel", cuproNickel.smelt());
    }
}
