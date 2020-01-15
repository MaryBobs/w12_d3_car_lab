package cars;

public abstract class Car {

    private double price;
    private String colour;
    private String model;

    public Car(double price, String colour, String model) {
        this.price = price;
        this.colour = colour;
        this.model = model;
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
}
