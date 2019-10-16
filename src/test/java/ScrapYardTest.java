import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrapYardTest {

    ScrapYard scrapyard;

    @Before
    public void before() {
        scrapyard = new ScrapYard("The Scrap Yard");
    }

    @Test
    public void hasName() {
        assertEquals("The Scrap Yard", scrapyard.getName());
    }

    @Test
    public void scrapMetalStartsAt0() {
        assertEquals(0, scrapyard.getMetalCount());
    }
}
