package src;

/**
 * Clase Tablet, es donde se estructura la tableta. Extiende Device
 * 

 * 
 * @version 1.0
 */
public class Tablet extends Device {
    private boolean tactilePenCompatibility;
    private int cameraNumber;

    /**
     * Constructor de Tableta
     * @param brand marca
     * @param model modelo
     * @param price precio
     * @param screenSize tamaño de la pantalla
     * @param tactilePenCompatibility compatibilidad
     * @param cameraNumber número de cámara
     */
    public Tablet(String brand, String model, double price, double screenSize, boolean tactilePenCompatibility, int cameraNumber) {
        super(brand, model, price, screenSize);
        this.tactilePenCompatibility = tactilePenCompatibility;
        this.cameraNumber = cameraNumber;
    }

    /**
     * Método para asegurar la compatibilidad de la pluma táctil
     * @return la compatabilidad de la pluma
     */
    public boolean isTactilePenCompatible() {
        return tactilePenCompatibility;
    }

    /**
     * Método para obtener el número de cámara
     * @return el numero de cámara
     */
    public int getCameraNumber() {
        return cameraNumber;
    }

    /**
     * Método void en donde se establece la conección de la pluma tactil.
     */
    public void connectTactilePen() {
        if (tactilePenCompatibility) {
            System.out.println(brand + " " + model + " supports a tactile pen.");
        } else {
            System.out.println(brand + " " + model + " does not support a tactile pen.");
        }
    }
}
