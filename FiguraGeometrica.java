public class FiguraGeometrica {
    private String Nombre;
    private String Color;

    public FiguraGeometrica(String nombre, String color) {
        Nombre = nombre;
        Color = color;
    }

    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public  String getColor(){
        return this.Color;
    }
    public  void setColor(){
        this.Color = Color;
    }

}
