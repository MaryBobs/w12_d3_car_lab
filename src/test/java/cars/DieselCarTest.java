package cars;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    private DieselCar dieselCar;
    private Engine engine1;

    @Before
    public void before() {
        engine1 = new Engine(2000);
        dieselCar = new DieselCar(10000.00, "blue", "Fiesta", 50, engine1);
    }

    @Test
    public void canGetPrice() {
        assertEquals(10000.00, dieselCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", dieselCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("Fiesta", dieselCar.getModel());
    }

    @Test
    public void canGetFuelTankSize() {
        assertEquals(50, dieselCar.getFuelTankSize());
    }

    @Test
    public void hasEngine() {
        assertEquals(2000, dieselCar.getEngine().getSize());
    }
}
