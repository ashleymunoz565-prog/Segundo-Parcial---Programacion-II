public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Empleado v = new Vendedor("Ashley Escobar", 6000.0, new ComisionEstandar());
=======
        Empleado v = new Vendedor("Ashley Escobar", 5000.0, new ComisionPersonalizada());
>>>>>>> feature/comision-personalizada
        v.mostrarDetalle();
    }
}