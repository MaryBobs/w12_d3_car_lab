package cars;

import components.Engine;

public class ElectricCar extends Car {

    private int voltage;

    public ElectricCar(double price, String colour, String model, int voltage, Engine engine) {
        super(price, colour, model, engine);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return this.voltage;
    }
}
