public class Laptop extends Device {
    private int ram;  // in GB
    private String processor;
    private int hardDisk;  // in GB

    public Laptop(String brand, String model, double price, double screenSize, int ram, String processor, int hardDisk) {
        super(brand, model, price, screenSize);
        this.ram = ram;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getHardDisk() {
        return hardDisk;
    }
}
