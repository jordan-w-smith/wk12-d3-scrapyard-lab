import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before() {
        car = new Car(200, "Ford Fiesta");
    }

    @Test
    public void canGetMetalContent() {
        assertEquals(200, car.getMetalContent());
    }

    @Test
    public void canGetModel() {
        assertEquals("Ford Fiesta", car.getModel());
    }
}
