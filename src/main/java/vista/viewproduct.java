package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Product;
import controlador. Productdriver;




public class viewproduct {
    /**
     * Crea un menu en el que podemos estar agregando, mostrar y comprar productos, claramente podemos salir de el
     * @param mostrarMenu el menu ejecutable
     * @param insertarProductos agregar nuevos productos
     * @param mostrarProductos muestra todos los productos que tenggamos
     * @param comprarProductos puedes comprar el producto que desees
     */
    private Productdriver controlador;
    private List<Product> productos;
    private Scanner scanner;

    public viewproduct() {
        controlador = new Productdriver();
        productos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n::: Menu :::");
            System.out.println("1. Enter your product");
            System.out.println("2. Show your product");
            System.out.println("3. Buy products");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresarProductos();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    compararProductos();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (opcion != 4);
    }

    private void ingresarProductos() {
        System.out.print("¿How many products do you want to enter? ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\nEnter product details " + (i + 1) + ":");
            Product producto = controlador.Productdriver();
            productos.add(producto);
        }
    }

    private void mostrarProductos() {
        System.out.println("\nDetails of products entered:");
        double utilidad = 20.0; // Porcentaje de utilidad
        for (Product producto : productos) {
            producto.muestraPrecio(utilidad);
        }
    }

    private void compararProductos() {
        if (productos.size() >= 2) {
            double utilidad = 20.0; // Porcentaje de utilidad
            String resultado = controlador.compararProductos(productos.get(0), productos.get(1), utilidad);
            System.out.println("\n" + resultado);
        } else {
            System.out.println("At least two products are needed to compare.");
        }
    }
}