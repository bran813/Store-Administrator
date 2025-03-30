package src;

import java.util.*;
import java.util.function.Function;

/**
 * Clase DeviceFactory. Es la aplicación del patrón factory.
 * 

 * 
 * @version 1.0
 */
public class DeviceFactory {
    private static final Map<String, Function<Scanner, Device>> deviceCreators = new HashMap<>();

    static {
        deviceCreators.put("Laptop", DeviceFactory::createLaptop);
        deviceCreators.put("Smartphone", DeviceFactory::createSmartphone);
        deviceCreators.put("Tablet", DeviceFactory::createTablet);
    }

    public static Device createDevice(String type, Scanner scanner) {
        return deviceCreators.getOrDefault(type, s -> {
            System.out.println("Tipo de producto inválido.");
            return null;
        }).apply(scanner);
    }

    /**
     * Método privado en donde está la fabrica de la laptop.
     * @param scanner el scanner
     * @return la laptop
     */
    private static Laptop createLaptop(Scanner scanner) {
        System.out.println("Agregar características de la laptop:");
        return new Laptop(
                captureString(scanner, "Marca"),
                captureString(scanner, "Modelo"),
                captureDouble(scanner, "Precio (pesos)"),
                captureDouble(scanner, "Tamaño de pantalla (pulgadas)"),
                captureInt(scanner, "RAM (GB)"),
                captureString(scanner, "Procesador"),
                captureInt(scanner, "Almacenamiento (GB)")
        );
    }

    /**
     * Método privado en donde está la fabrica del Smarthphone.
     * @param scanner el scanner
     * @return el teléfono
     */
    private static Smartphone createSmartphone(Scanner scanner) {
        System.out.println("Agregar características del celular:");
        return new Smartphone(
                captureString(scanner, "Marca"),
                captureString(scanner, "Modelo"),
                captureDouble(scanner, "Precio (pesos)"),
                captureDouble(scanner, "Tamaño de pantalla (pulgadas)"),
                captureInt(scanner, "Capacidad de batería (mAh)"),
                captureInt(scanner, "Número de cámaras")
        );
    }

    /**
     * Método privado en donde está la fabrica de la Tableta.
     * @param scanner el scanner
     * @return la tableta
     */
    private static Tablet createTablet(Scanner scanner) {
        System.out.println("Agregar características de la tableta:");
        return new Tablet(
                captureString(scanner, "Marca"),
                captureString(scanner, "Modelo"),
                captureDouble(scanner, "Precio (pesos)"),
                captureDouble(scanner, "Tamaño de pantalla (pulgadas)"),
                captureBoolean(scanner, "Compatibilidad con lápiz táctil(true/false)"),
                captureInt(scanner, "Número de cámaras")
        );
    }

    /**
     * Método privado en donde se captura el String
     * @param scanner el scanner
     * @param prompt el prompt
     * @return la siguiente linea
     */
    private static String captureString(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    /**
     * Método privado en donde se captura el int
     * @param scanner el scanner
     * @param prompt el prompt
     * @return el valor
     */
    private static int captureInt(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Input inválido. Capture un número para " + prompt + ": ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    /**
     * Método privado en donde se captura el double
     * @param scanner el scanner
     * @param prompt el prompt
     * @return el valor
     */
    private static double captureDouble(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Input inválido. Capture un número para " + prompt + ": ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    /**
     * Método privado en donde se captura el booleano
     * @param scanner el scanner
     * @param prompt el prompt
     * @return el valor
     */
    private static boolean captureBoolean(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        while (!scanner.hasNextBoolean()) {
            System.out.print("Input inválido. Capture un true o false para " + prompt + ": ");
            scanner.next();
        }
        boolean value = scanner.nextBoolean();
        scanner.nextLine();
        return value;
    }
}
