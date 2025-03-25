# Práctica 3 - Modelado y Programación

## Descripción
Este programa implementa un sistema de menú para la tienda Banana Store, especializada en productos electrónicos. El objetivo es gestionar estos productos y sus diversas especificaciones de manera estructurada y flexible.

- **Patrones de Diseño**: El patrón a utilizar en esta práctica es Factory:
- **Factory**: Lo utilizamos porque permite la creación de objetos a partir de una estructura base, facilitando la generación de productos en la tienda. A diferencia del patrón Abstract Factory, esta implementación evita el uso de clases abstractas adicionales o la necesidad de crear múltiples fábricas.


## Estructura del Proyecto
El código se estructura de la siguiente manera:
Tenemos un archivo java dedicado al patrón factory, el cual es DeviceFactory. El java Principal se encarga de correr el main. El DeviceMenu estructura el menú que se utiliza.


## Consideraciones del ejercicio

Para la implementación de este proyecto se tomaron en cuenta las siguientes consideraciones:

* Como se pidió en la práctica, los productos se registran y organizan según su categoría, permitiendo una configuración flexible de sus atributos.

* Nos basamos en la definición del factory para desarrollar las partes relacionadas al patrón, especialmente DeviceFactory.



## Cómo Ejecutar
1. Compila el código:
   ```bash
   javac principal.java
   ```
2. Ejecuta el programa:
   ```bash
   java Principal
   ```
Este proyecto fue hecho con Java 23.

### Integrantes del equipo "asdfg" 
| Nombre | Número de cuenta |
| --- | --- |
| Emilio Durán Tapia | 318075752 |
| Alan Blancas Ochoa | 316227364 |
| Brandon Zamorano Baños | 316250869|
