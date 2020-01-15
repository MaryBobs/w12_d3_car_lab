package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre(80);
    }

    @Test
    public void canGetCost() {
        assertEquals(80, tyre.getCost());
    }


}
