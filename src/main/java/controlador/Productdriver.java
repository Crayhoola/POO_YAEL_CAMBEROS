package controlador;
import modelo.Product;

import java.util.Scanner;
public class Productdriver {

    private Scanner scanner = new Scanner(System.in);

    public Product Productdriver() {
        Product producto = new Product();
        try {
            System.out.print("Enter the product code: ");
            producto.setCodigo(scanner.nextLine());

            System.out.print("Enter the type of the product: ");
            producto.setTipo(scanner.nextLine());

            System.out.print("Enter the cost of the product: ");
            producto.setCosto(scanner.nextLine());

            System.out.print("Enter the product tax: ");
            producto.setImpuesto(scanner.nextDouble());
            scanner.nextLine(); // Limpiar el buffer

        } catch (Exception e) {
            System.out.println("Data entry error: " + e.getMessage());
        }
        return producto;
    }

    public String compararProductos(Product p1, Product p2, double utilidad) {
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "The product with the highest selling price is: " + p1.getTipo();
        } else {
            return "The product with the highest selling price is: " + p2.getTipo();
        }
    }
}