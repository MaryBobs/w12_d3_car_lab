package cars;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public abstract class Car {

    private double price;
    private String colour;
    private String model;
    private Engine engine;
    private ArrayList<Tyre> tyres;

    public Car(double price, String colour, String model, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.model = model;
        this.engine = engine;
        this.tyres = new ArrayList<Tyre>();
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }
}
