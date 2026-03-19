package mx.unam.fesa.ico.herencia.casio;

public class RadioReloj {
    protected String marca;
    protected float frecuencia;
    protected int volumen;
    protected boolean amFm; // true = AM
    protected Reloj wacho;

    public RadioReloj() {
        wacho = new Reloj();
    }

    public RadioReloj(String marca, float frecuencia, int volumen, boolean amFm, Reloj wacho) {

        this.marca = marca;
        this.frecuencia = frecuencia;
        this.volumen = volumen;
        this.amFm = amFm;
        this.wacho = wacho;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isAmFm() {
        return amFm;
    }

    public void setAmFm(boolean amFm) {
        this.amFm = amFm;
    }

    public Reloj getWacho() {
        return wacho;
    }

    public void setWacho(Reloj wacho) {
        this.wacho = wacho;
    }

    @Override
    public String toString() {
        return "RadioReloj{" +
                "marca='" + marca + '\'' +
                ", frecuencia=" + frecuencia +
                ", volumen=" + volumen +
                ", amFm=" + amFm +
                ", wacho=" + wacho +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo el radio reloj");
    }

    public void apagar(){
        System.out.println("Apagando el radio reloj");
    }

    public void cambiarEstacion(float f){
        this.frecuencia = f;
    }

    public static void main(String[] args) {
        RadioReloj rr = new RadioReloj();
        System.out.println(rr);
    }

}
