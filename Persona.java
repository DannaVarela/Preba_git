public class Persona {
    private String Nombre;
    private String FechaNacimiento;
    private  Integer Edad;

    public Persona(String Nombre, String FechaNacimiento, Integer Edad){
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Edad = Edad;
    }

    public String getNombre() { return this.Nombre;}

    public void setNombre(String nombre) { this.Nombre = nombre;}

    public String getFechaNacimiento() { return this.FechaNacimiento;}

    public void setFechaNacimiento(String fechaNacimiento) { this.FechaNacimiento = fechaNacimiento;}

    public Integer getEdad() { return this.Edad;}

    public void setEdad(Integer edad) { this.Edad = edad;}
}
