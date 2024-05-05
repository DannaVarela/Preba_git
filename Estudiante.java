public class Estudiante extends Persona implements Trabajador{

    public String realizarTarea() {

        return "Realizando tarea escolar";
    }

    private String Grado;
    public Estudiante(String Nombre,String FechaNacimiento, Integer Edad, String Grado) {
        super(Nombre,FechaNacimiento, Edad);
        this.Grado = Grado;
    }
    public String toString() {
        return "Estudiante: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Grado: " + this.Grado;
    }
}
