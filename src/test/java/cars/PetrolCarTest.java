package cars;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    private PetrolCar petrolCar;
    private Engine engine1;

    @Before
    public void before() {
        engine1 = new Engine(2000);
        petrolCar = new PetrolCar(10000.00, "blue", "Fiesta", 50, engine1);
    }

    @Test
    public void canGetPrice() {
        assertEquals(10000.00, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", petrolCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("Fiesta", petrolCar.getModel());
    }

    @Test
    public void canGetFuelTankSize() {
        assertEquals(50, petrolCar.getFuelTankSize());
    }

    @Test
    public void hasEngine() {
        assertEquals(2000, petrolCar.getEngine().getSize());
    }
}
