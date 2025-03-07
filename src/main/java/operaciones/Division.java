package operaciones;

public class Division extends Resta {
    @Override
    public double operar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}