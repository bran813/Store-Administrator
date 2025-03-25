public class Tablet extends Device {
    private boolean tactilePenCompatibility;
    private int cameraNumber;

    public Tablet(String brand, String model, double price, double screenSize, boolean tactilePenCompatibility, int cameraNumber) {
        super(brand, model, price, screenSize);
        this.tactilePenCompatibility = tactilePenCompatibility;
        this.cameraNumber = cameraNumber;
    }

    public boolean isTactilePenCompatible() {
        return tactilePenCompatibility;
    }

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void connectTactilePen() {
        if (tactilePenCompatibility) {
            System.out.println(brand + " " + model + " supports a tactile pen.");
        } else {
            System.out.println(brand + " " + model + " does not support a tactile pen.");
        }
    }
}
