import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrapYardTest {

    ScrapYard scrapyard;
    Car car;
    Fridge fridge;
    CrushingMachine crushingMachine;

    @Before
    public void before() {
        crushingMachine = new CrushingMachine();
        scrapyard = new ScrapYard("The Scrap Yard", crushingMachine);
        car = new Car(100, "VW Golf");
        fridge = new Fridge(30);
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

    @Test
    public void canAddFridgeToCrushables() {
        scrapyard.addCrushable(fridge);
        assertEquals(1, scrapyard.countCrushables());
    }

    @Test
    public void crushingCrushableAddsToScrapMetalKG() {
        scrapyard.salvageMetal(car);
        assertEquals(100, scrapyard.getMetalCount());
    }
}
