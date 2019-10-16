import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrapYardTest {

    ScrapYard scrapyard;
    Car car;

    @Before
    public void before() {
        scrapyard = new ScrapYard("The Scrap Yard");
        car = new Car(100, "VW Golf");
    }

    @Test
    public void hasName() {
        assertEquals("The Scrap Yard", scrapyard.getName());
    }

    @Test
    public void scrapMetalStartsAt0() {
        assertEquals(0, scrapyard.getMetalCount());
    }

    @Test
    public void canCountCrushables() {
        assertEquals(0, scrapyard.countCrushables());
    }

    @Test
    public void canAddCarToCrushables() {
        scrapyard.addCrushable(car);
        assertEquals(1, scrapyard.countCrushables());
    }
}
