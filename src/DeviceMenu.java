package src;

import java.util.*;

/**
 * Clase DeviceMenu. Es el menú que se utiliza en la práctica.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class DeviceMenu {
    private final Scanner scanner;
    private final List<Device> deviceList;

    /**
     * Método que usa el Scanner y el ArrayList
     */
    public DeviceMenu() {
        this.scanner = new Scanner(System.in);
        this.deviceList = new ArrayList<>();
    }

    /**
     * Método void en donde se muestra el menú
     */
    public void showMenu() {
        while (true) {
            System.out.println("\nSeleccione un producto por agregar:");
            List<String> deviceTypes = Arrays.asList("Laptop", "Smartphone", "Tablet", "Salir");

            for (int i = 0; i < deviceTypes.size(); i++) {
                System.out.println((i + 1) + ". " + deviceTypes.get(i));
            }

            int choice = getValidChoice(deviceTypes.size());

            if (choice == deviceTypes.size()) {
                System.out.println("Saliendo del menú...");
                break;
            }

            String selectedDevice = deviceTypes.get(choice - 1);
            Device device = DeviceFactory.createDevice(selectedDevice, scanner);
            if (device != null) {
                deviceList.add(device);
                System.out.println(selectedDevice + " agregado exitosamente!");
            }
        }
        displayDevices();
    }

    /**
     * Método interior en donde se escoge la opción válida
     * 
     * @param maxOptions las opciones máximas
     * @return la elección
     */
    private int getValidChoice(int maxOptions) {
        while (true) {
            System.out.print("Agregue opciones (1-" + maxOptions + "): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (choice >= 1 && choice <= maxOptions) {
                    return choice;
                }
            } else {
                scanner.next(); // Discard invalid input
            }
            System.out.println("Opción inválida, intente de nuevo");
        }
    }

    /**
     * Método void que muestra los dispositivos.
     */
    private void displayDevices() {
        System.out.println("\n--- Lista de productos agregados ---");
        if (deviceList.isEmpty()) {
            System.out.println("Sin productos agregados.");
        } else {
            for (Device device : deviceList) {
                System.out.println(device.getBrand() + " " + device.getModel());
            }
        }
    }
}
