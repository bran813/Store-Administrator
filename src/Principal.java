package src;

/**
 * Clase Principal, es donde se corre el código.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class Principal {
    /**
     * Método main
     * 
     * @param args los parametros
     */
    public static void main(String[] args) {
        DeviceMenu menu = new DeviceMenu();
        menu.showMenu();
    }
}

