public class Empleado extends Persona implements Trabajador{
    public String realizarTarea (){
        return "Realizando tarea laboral";
    }
    public  Empleado(String Nombre,String FechaNacimiento, Integer Edad){
        super(Nombre,FechaNacimiento, Edad);
    }
}
