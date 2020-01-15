package cars;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;
    private Engine engine1;

    @Before
    public void before() {
        engine1 = new Engine(2000);
        electricCar = new ElectricCar(10000.00, "blue", "Fiesta", 150, engine1);
    }

    @Test
    public void canGetPrice() {
        assertEquals(10000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("Fiesta", electricCar.getModel());
    }

    @Test
    public void canVoltage() {
        assertEquals(150, electricCar.getVoltage());
    }

    @Test
    public void hasEngine() {
        assertEquals(2000, electricCar.getEngine().getSize());
    }
}
