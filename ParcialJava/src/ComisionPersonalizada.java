public class ComisionPersonalizada implements EstrategiaComision {
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.11;
    }
}