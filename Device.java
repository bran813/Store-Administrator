public abstract class Device {
    protected String brand;
    protected String model;
    protected double price;
    protected double screenSize;

    public Device(String brand, String model, double price, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
