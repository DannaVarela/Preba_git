public class Empleados {
    private String Nombre;
    private float Salario;

    public Empleados(String Nombre, float Salario) {
        Nombre = Nombre;
        Salario = Salario;
    }
    public  String getNombre(){
        return this.Nombre;
    }
    public  void setNombre(){
        this.Nombre = Nombre;
    }
    public float getSalario(){
        return this.Salario;
    }
    public void setSalario(){
        this.Salario = Salario;
    }
}
