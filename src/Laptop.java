package src;

/**
 * Clase Laptop, es donde se estructura la Laptop. Extiende Device
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class Laptop extends Device {
    private int ram; // in GB
    private String processor;
    private int hardDisk; // in GB

    /**
     * Constructor de Laptop
     * 
     * @param brand      marca
     * @param model      modelo
     * @param price      precio
     * @param screenSize tamaño de la pantalla
     * @param ram        ram
     * @param processor  procesador
     * @param hardDisk   disco duro
     */
    public Laptop(String brand, String model, double price, double screenSize, int ram, String processor,
            int hardDisk) {
        super(brand, model, price, screenSize);
        this.ram = ram;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    /**
     * Método getter
     * 
     * @return ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * Método getter
     * 
     * @return procesador
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Método getter
     * 
     * @return disco duro
     */
    public int getHardDisk() {
        return hardDisk;
    }
}
