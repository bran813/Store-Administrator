import java.util.*;
import java.util.function.Function;

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

    private static String captureString(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

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
