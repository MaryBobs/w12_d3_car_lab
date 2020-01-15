package cars;

import cars.Car;
import components.Engine;


public class DieselCar extends Car {

    private int fuelTankSize;

    public DieselCar(double price, String colour, String model, int fuelTankSize, Engine engine) {
        super(price, colour, model, engine);
        this.fuelTankSize = fuelTankSize;
    }

    public int getFuelTankSize() {
        return this.fuelTankSize;
    }

}
