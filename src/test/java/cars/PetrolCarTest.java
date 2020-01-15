package cars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    private PetrolCar petrolCar;

    @Before
    public void before() {
        petrolCar = new PetrolCar(10000.00, "blue", "Fiesta", 50);
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
}
