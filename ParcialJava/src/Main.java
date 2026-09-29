public class Main {
    public static void main(String[] args) {
        Empleado v = new Vendedor("Ashley Escobar", 6000.0, new ComisionEstandar());
        v.mostrarDetalle();
    }
}