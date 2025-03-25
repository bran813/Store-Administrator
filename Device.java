/**
 * Clase Device. Estructura el dispositivo.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public abstract class Device {
    protected String brand;
    protected String model;
    protected double price;
    protected double screenSize;

    /**
     * Constructor de Device
     * 
     * @param brand      la marca
     * @param model      el modelo
     * @param price      el precio
     * @param screenSize el tamano de la pantalla
     */
    public Device(String brand, String model, double price, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    /**
     * Método getter
     * 
     * @return marca
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método getter
     * 
     * @return modelo
     */
    public String getModel() {
        return model;
    }

    /**
     * Método getter
     * 
     * @return precio
     */
    public double getPrice() {
        return price;
    }

    /**
     * Método getter
     * 
     * @return el tamaño de la pantalla
     */
    public double getScreenSize() {
        return screenSize;
    }
}
