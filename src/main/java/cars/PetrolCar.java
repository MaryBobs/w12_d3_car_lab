package cars;

public class PetrolCar extends Car {

    private int fuelTankSize;

    public PetrolCar(double price, String colour, String model, int fuelTankSize) {
        super(price, colour, model);
        this.fuelTankSize = fuelTankSize;
    }

    public int getFuelTankSize() {
        return this.fuelTankSize;
    }

}
