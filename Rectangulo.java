public class Rectangulo extends FiguraGeometrica{
    private float Longitud;
    private float Ancho;

    public Rectangulo(String Nombre, String Color){
        super(Nombre, Color);
        this.Longitud = Longitud;
        this.Ancho = Ancho;
    }

    public float getLongitud() {
        return this.Longitud;
    }

    public void setLongitud(float longitud) {
        this.Longitud = Longitud;
    }

    public float getAncho() {
        return this.Ancho;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }
    public float calcularArea(){
        return this.Longitud * this.Ancho;
    }
    public float calcularPerimetro(){
        return 2 * (this.Longitud + this.Ancho);

    }

}
