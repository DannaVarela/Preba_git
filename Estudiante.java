public class Estudiante extends Persona{
    private String Grado;
    public Estudiante(String Nombre, String FechaNacimiento, Integer Edad, String Grado){
        super(Nombre,FechaNacimiento, Edad);
    }
    public String toString() {
        return "Estudiante: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Grado: " + this.Grado;
    }
}
