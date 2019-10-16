import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrushingMachineTest {

    CrushingMachine crushingMachine;
    Car car;
    Fridge fridge;

    @Before
    public void before() {
        crushingMachine = new CrushingMachine();
        car = new Car(200, "Ford Fiesta");
        fridge = new Fridge(30);
    }

    @Test
    public void canCrushCar() {
        assertEquals(200, crushingMachine.crush(car));
        assertEquals(0, car.getMetalContent());
    }

    @Test
    public void canCrushFridge() {
        assertEquals(30, crushingMachine.crush(fridge));
        assertEquals(0, fridge.getMetalContent());
    }

}
