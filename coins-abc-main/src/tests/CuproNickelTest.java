import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CuproNickelTest {
    @Test
    public void testSmelt() {
        CuproNickle cuproNickel = new CuproNickle();
        assertEquals("Cupro-Nickel", cuproNickel.smelt());
    }
}
