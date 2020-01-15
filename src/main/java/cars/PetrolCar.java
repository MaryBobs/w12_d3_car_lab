package cars;

import components.Engine;

public class PetrolCar extends Car {

    private int fuelTankSize;

    public PetrolCar(double price, String colour, String model, int fuelTankSize, Engine engine) {
        super(price, colour, model, engine);
        this.fuelTankSize = fuelTankSize;
    }

    public int getFuelTankSize() {
        return this.fuelTankSize;
    }

}
