# **Store Administrator**  

## **Description**  
This program implements a **menu system** for the **Banana Store**, a shop specializing in electronic products. The goal is to manage these products and their various specifications in a **structured and flexible** way. This program simulates a **product storage software** within the terminal.  

- **Design Patterns:** The pattern used in this project is **Factory**:  
- **Factory:** We used this pattern because it allows the creation of objects based on a **base structure**, making it easier to generate products in the store. Unlike the **Abstract Factory** pattern, this implementation avoids the use of additional abstract classes or the need to create multiple factories.  

---

## **Project Structure**  
The code is structured as follows:  

- `DeviceFactory.java`: Handles the **Factory pattern** implementation.  
- `Principal.java`: Contains the **main** method to run the program.  
- `DeviceMenu.java`: Manages the **menu system** used in the application.  

---

## **Exercise Considerations**  

For the implementation of this project, the following aspects were considered:  

- As required in the assignment, **products are registered and organized** by category, allowing for flexible attribute configuration.  
- The **Factory pattern** was carefully implemented, with a focus on `DeviceFactory` to handle object creation efficiently.  

---

## **How to Run**  

1. **Compile the code:**  
   ```bash
   javac Principal.java

   ```
2. **Run the project:**  
   ```bash
   java Principal
   ```
This project was done in Java 23

