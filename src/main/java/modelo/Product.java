package modelo;


public class Product {
    private String codigo;
    private String tipo;
    private String costo;
    private Double impuesto;

    // Métodos de acceso (getters)
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    // Métodos establecedores (setters)
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    // Método para mostrar el producto
    public void muestraProducto() {
        System.out.println("Code: " + codigo);
        System.out.println("Type: " + tipo);
        System.out.println("Cost: " + costo);
        System.out.println("Tax: " + impuesto);
    }

    // Método para calcular el precio de venta
    public double calcularPrecio(double utilidad) {
        double costoDouble = Double.parseDouble(costo);
        // Calcular el precio antes de impuestos
        double precioAntesImpuesto = costoDouble + (costoDouble * (utilidad / 100));
        // Calcular el precio total incluyendo el impuesto
        double precioConImpuesto = precioAntesImpuesto + (precioAntesImpuesto * (impuesto / 100));
        return precioConImpuesto;
    }

    // Método para mostrar el precio del producto
    public void muestraPrecio(double utilidad) {
        double costoDouble = Double.parseDouble(costo);
        double precioAntesImpuesto = costoDouble + (costoDouble * (utilidad / 100));
        double precioConImpuesto = calcularPrecio(utilidad);

        System.out.println("Code: " + codigo);
        System.out.println("Type: " + tipo);
        System.out.printf("Price without taxes: %.2f\n", precioAntesImpuesto);
        System.out.printf("Price with taxes: %.2f\n", precioConImpuesto);
    }
}