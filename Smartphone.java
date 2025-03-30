package src;

/**
 * Clase Smartphone. Estructura el teléfono. Extiende Device
 * 

 * 
 * @version 1.0
 */
public class Smartphone extends Device {
    private int batteryCapacity; // in mAh
    private int cameraNumber;

    /**
     * Constructor del teléfono
     * 
     * @param brand           marca
     * @param model           modelo
     * @param price           precio
     * @param screenSize      tamaño de la pantalla
     * @param batteryCapacity capacidad de la batería
     * @param cameraNumber    número de la camara
     */
    public Smartphone(String brand, String model, double price, double screenSize, int batteryCapacity,
            int cameraNumber) {
        super(brand, model, price, screenSize);
        this.batteryCapacity = batteryCapacity;
        this.cameraNumber = cameraNumber;
    }

    /**
     * Método para la capacidad de la batería
     * 
     * @return la capacidad de la batería
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Método para establecer el número de camara
     * 
     * @return número de cámara
     */
    public int getCameraNumber() {
        return cameraNumber;
    }

    /**
     * Método void de la carga rápida
     */
    public void fastCharge() {
        System.out.println(brand + " " + model + " is fast charging...");
    }
}
