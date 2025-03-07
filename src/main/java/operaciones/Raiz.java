package operaciones;

public class Raiz extends Resta {
    @Override
    public double operar(double a, double b) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz de un número negativo");
        }
        return Math.pow(a, 1.0 / b);
    }
}