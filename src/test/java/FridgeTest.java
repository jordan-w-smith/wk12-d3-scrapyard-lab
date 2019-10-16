import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FridgeTest {

    Fridge fridge;

    @Before
    public void before() {
        fridge = new Fridge(30);
    }

    @Test
    public void canGetMetalContent() {
        assertEquals(30, fridge.getMetalContent());
    }
}
