public class Vendedor extends Empleados{
    private float Comision;
    public Vendedor(String Nombre, float Salario, float Comision) {
        super(Nombre, Salario);
        this.Comision = Comision;
    }
    public double calcularSalario(float Ventas) {
        if (Ventas > 50000) {
            return this.getSalario() + (Comision * Ventas) + 50000;
        } else {
            return this.getSalario() + (Comision * Ventas);
        }
    }
}
