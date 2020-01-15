package dealerships;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;

    @Before
    public void before() {
        dealership = new Dealership(50000.00);
    }

    @Test
    public void canGetTill() {
        assertEquals(50000.00, dealership.getTill(), 0.01);
    }
}
