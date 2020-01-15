package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(2000);
    }

    @Test
    public void canGetSize() {
        assertEquals(2000, engine.getSize());
    }
}
