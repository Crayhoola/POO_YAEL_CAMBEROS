package operaciones;

public class Potencia extends Suma {
    @Override
    public double operar(double a, double b) {
        return Math.pow(a, b);
    }
}