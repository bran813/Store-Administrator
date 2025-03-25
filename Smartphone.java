public class Smartphone extends Device {
    private int batteryCapacity; // in mAh
    private int cameraNumber;

    public Smartphone(String brand, String model, double price, double screenSize, int batteryCapacity, int cameraNumber) {
        super(brand, model, price, screenSize);
        this.batteryCapacity = batteryCapacity;
        this.cameraNumber = cameraNumber;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void fastCharge() {
        System.out.println(brand + " " + model + " is fast charging...");
    }
}
