public class Gerente extends Empleados{
    private float Bono;
    public Gerente(String nombre, float salario, float Bono) {
        super(nombre, salario);
        this.Bono = Bono;
    }
    public float getBono() {
        return Bono;
    }
    public void setBono(float bono) {
        Bono = bono;
    }

    public double calcularSalario() {
        return this.getSalario() + Bono;
    }
}
