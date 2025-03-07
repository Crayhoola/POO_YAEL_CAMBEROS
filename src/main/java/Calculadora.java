import operaciones.*;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Multiplicación");
        System.out.println("3. Potencia");
        System.out.println("4. Resta");
        System.out.println("5. División");
        System.out.println("6. Raíz");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        // Pedir los números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        double num2 = 0; // Se inicializa en 0 para evitar errores con la raíz
        if (opcion != 6) { // La raíz solo necesita un número
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();
        }

        // Crear objetos de las clases de operaciones
        double resultado = 0;

        switch (opcion) {
            case 1 -> resultado = new Suma().operar(num1, num2);
            case 2 -> resultado = new Multiplicacion().operar(num1, num2);
            case 3 -> resultado = new Potencia().operar(num1, num2);
            case 4 -> resultado = new Resta().operar(num1, num2);
            case 5 -> resultado = new Division().operar(num1, num2);
            case 6 -> resultado = new Raiz().operar(num1, 2); // Raíz cuadrada por defecto
            default -> System.out.println("Opción inválida");
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}