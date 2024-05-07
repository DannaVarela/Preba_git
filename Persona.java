import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Tiene que completar este campo");
        }
        this.Nombre = nombre;
    }

    public String getFechaNacimiento() { return this.FechaNacimiento;}

    public void setFechaNacimiento(String fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() { return this.Edad;}

    public void setEdad(Integer edad) {

        if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.Edad = edad;
    }

    public String calcularFechaNacimiento(){
        LocalDate fechaNacimiento = LocalDate.now().minusYears(getEdad());
        return fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
