import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinTest {
    private static int currYear;
    
    @BeforeAll
    public static void setup() {
        currYear = Calendar.getInstance().get(Calendar.YEAR);
    }
    
    @Test
    public void testPenny() {
        Penny p = new Penny();
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
        assertFalse(p.getRidgedEdge());
        assertEquals("Copper", p.getMetallurgy());
        assertEquals(currYear, p.getYear());
    }
    
    @Test
    public void testNickel() {
        Nickel n = new Nickel();
        n = (Nickel) n.manufacture(n);
        assertEquals(0.05, n.getValue());
        assertEquals("Nickel", n.getFamiliarName());
        assertEquals("IN GOD WE TRUST", n.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", n.getBackMotto());
        assertEquals("LIBERTY", n.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", n.getBackLabel());
        assertEquals("T_Jefferson", n.getFrontImage());
        assertEquals("Jefferson_Memorial", n.getBackImage());
        assertEquals("FIVE CENTS", n.getValueDescription());
        assertFalse(n.getRidgedEdge());
        assertEquals("Cupro-Nickel", n.getMetallurgy());
        assertEquals(currYear, n.getYear());
    }
    
    @Test
    public void testDime() {
        Dime d = new Dime();
        d = (Dime) d.manufacture(d);
        assertEquals(0.10, d.getValue());
        assertEquals("Dime", d.getFamiliarName());
        assertEquals("IN GOD WE TRUST", d.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", d.getBackMotto());
        assertEquals("LIBERTY", d.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", d.getBackLabel());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(currYear, d.getYear());
    }
    
    @Test
    public void testQuarter() {
        Quarter q = new Quarter(1999);
        q = (Quarter) q.manufacture(q);
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
        assertTrue(q.getRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
        assertEquals(1999, q.getYear());
    }
    
    @Test
    public void testHalfDollar() {
        HalfDollar h = new HalfDollar();
        h = (HalfDollar) h.manufacture(h);
        assertEquals(0.50, h.getValue());
        assertEquals("HalfDollar", h.getFamiliarName());
        assertEquals("IN GOD WE TRUST", h.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", h.getBackMotto());
        assertEquals("LIBERTY", h.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", h.getBackLabel());
        assertEquals("J_Kennedy", h.getFrontImage());
        assertEquals("Presidential_Seal", h.getBackImage());
        assertEquals("HALF DOLLAR", h.getValueDescription());
        assertTrue(h.getRidgedEdge());
        assertEquals("Cupro-Nickel", h.getMetallurgy());
        assertEquals(currYear, h.getYear());
    }
    
    @Test
    public void testDollar() {
        Dollar d = new Dollar();
        d = (Dollar) d.manufacture(d);
        assertEquals(1.00, d.getValue());
        assertEquals("Dollar", d.getFamiliarName());
        assertEquals("IN GOD WE TRUST", d.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", d.getBackMotto());
        assertEquals("LIBERTY", d.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", d.getBackLabel());
        assertEquals("S_Anthony", d.getFrontImage());
        assertEquals("Moon_Eagle", d.getBackImage());
        assertEquals("ONE DOLLAR", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(currYear, d.getYear());
    }
    
    @Test
    public void testToString() {
        HalfDollar h = new HalfDollar(1999);
        h = (HalfDollar) h.manufacture(h);
        String expected = "[HalfDollar,0.50,1999,'IN GOD WE TRUST','E PLURIBUS UNUM','J_Kennedy','Presidential_Seal','LIBERTY','UNITED STATES OF AMERICA','HALF DOLLAR',ridges,'Cupro-Nickel']";
        assertEquals(expected, h.toString());
    }
    
    @Test
    public void testMockCoinGetters() {
        Coin testCoin = new MockCoin();
        testCoin = (MockCoin) testCoin.manufacture(testCoin);
        assertEquals("MockCoin", testCoin.getFamiliarName());
        assertEquals(24, testCoin.getValue());
        assertEquals("IN GOD WE TRUST", testCoin.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", testCoin.getBackMotto());
        assertEquals("LIBERTY", testCoin.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", testCoin.getBackLabel());
        assertEquals("Mock_Front_Image", testCoin.getFrontImage());
        assertEquals("Mock_Back_Image", testCoin.getBackImage());
        assertEquals("Mock_Value_Description", testCoin.getValueDescription());
        assertTrue(testCoin.getRidgedEdge());
        assertEquals("Mock_Metallurgy", testCoin.getMetallurgy());
        assertEquals(2025, testCoin.getYear());
    }
    
    @Test
    public void testMetallurgyStrategy() {
        // Test changing metallurgy using the strategy pattern
        Penny penny = new Penny();
        penny = (Penny) penny.manufacture(penny);


        assertEquals("Copper", penny.getMetallurgy());
        
        Penny specialPenny = new Penny();
        specialPenny = (Penny) specialPenny.manufacture(specialPenny);
        specialPenny.setSmelter(new CuproNickel());

        assertEquals("Cupro-Nickel", specialPenny.getMetallurgy());
        
        // Test that mockCoin uses MockMetallurgy
        MockCoin mockCoin = new MockCoin();
        mockCoin = (MockCoin) mockCoin.manufacture(mockCoin);
        assertEquals("Mock_Metallurgy", mockCoin.getMetallurgy());
        
        // Change mockCoin's metallurgy
        mockCoin.setSmelter(new Copper());
        assertEquals("Copper", mockCoin.getMetallurgy());
    }
}

/**
 * Mock implementation of the Metallurgy interface for testing purposes.
 */
class MockMetallurgy implements Metallurgy {
    @Override
    public String smelt() {
        return "Mock_Metallurgy";
    }
}

class MockCoin extends Coin {
    public MockCoin() {
        super("MockCoin", 24.0, null, null, null, null, null, null, null, true, new MockMetallurgy(), 2025);
    }

    @Override
    protected Coin smeltStep(Coin c) {
        c.setMetallurgy("Mock_Metallurgy");
        return c;
    }

    @Override
    protected Coin imprintRidgedEdge(Coin c) {
        c.setRidgedEdge(true);
        return c;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        c.setFrontImage("Mock_Front_Image");
        return c;
    }

    @Override
    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        c.setYear(2025);
        return c;
    }

    @Override
    protected Coin imprintBackImage(Coin c) {
        c.setBackImage("Mock_Back_Image");
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("Mock_Value_Description");
        return c;
    }
}

