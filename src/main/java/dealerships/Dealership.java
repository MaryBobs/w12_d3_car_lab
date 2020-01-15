package dealerships;

import cars.Car;
import cars.PetrolCar;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<Car>();
        this.till = till;
    }

    public double getTill() {
        return this.till;
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addCar(Car car) {
        this.stock.add(car);
    }
}
