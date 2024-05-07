public class Circulo extends FiguraGeometrica{
    private float Radio;

    public Circulo (String Nombre, String Color, float Radio){
        super(Nombre,Color);
        this.Radio = Radio;
    }
    public float getRadio() {
        return this.Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(Radio, 2);
    }
    public double calcularPerimetro() {
        return 2 * Math.PI * Radio;
    }

}
