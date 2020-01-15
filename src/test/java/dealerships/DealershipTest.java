package dealerships;

import cars.PetrolCar;
import cars.Car;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private PetrolCar petrolCar;
    private Engine engine1;

    @Before
    public void before() {
        engine1 = new Engine(2000);
        petrolCar = new PetrolCar(10000.00, "blue", "Fiesta", 50, engine1);
        dealership = new Dealership(50000.00);
    }

    @Test
    public void canGetTill() {
        assertEquals(50000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canGetStock() {
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canAddCar() {
        dealership.addCar(petrolCar);
        assertEquals(1, dealership.getStock());
    }
}
