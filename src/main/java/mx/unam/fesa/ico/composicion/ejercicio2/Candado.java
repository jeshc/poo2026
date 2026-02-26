package mx.unam.fesa.ico.composicion.ejercicio2;

import java.util.Arrays;

public class Candado {
    public static final int NUMERO_ENGRANES = 3;
    private int ancho;
    private int alto;
    private int grosor;
    private String material;
    private boolean abierto;
    private String combinacion;
    private Engrane [] engranes; // Engrame engranes[]

    public Candado() {
        engranes = new Engrane[NUMERO_ENGRANES];
        engranes[0] = new Engrane();
        engranes[1] = new Engrane();
        engranes[2] = new Engrane();
    }

    public Candado(int ancho, int alto, int grosor, String material, boolean abierto, String combinacion, Engrane[] engranes) {
        this.ancho = ancho;
        this.alto = alto;
        this.grosor = grosor;
        this.material = material;
        this.abierto = abierto;
        this.combinacion = combinacion;
        this.engranes = engranes;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public Engrane[] getEngranes() {
        return engranes;
    }

    public void setEngranes(Engrane[] engranes) {
        this.engranes = engranes;
    }

    @Override
    public String toString() {
        return "Candado{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", grosor=" + grosor +
                ", material='" + material + '\'' +
                ", abierto=" + abierto +
                ", combinacion='" + combinacion + '\'' +
                ", engranes=" + Arrays.toString(engranes) +
                '}';
    }

    public void cerrar(){
        this.abierto = false;
    }

    public boolean abrir(){

        // aqui va la lógica de apertura
        String actual="";
        actual=actual+engranes[0].getPosicion();
        actual=actual+engranes[1].getPosicion();
        actual=actual+engranes[2].getPosicion();
        System.out.println(actual);
        if(this.combinacion.equals(actual)){
            System.out.println("el candado se abrio");

        }
        else {
            System.out.println("combinacion incorrecta");
        }
        return this.abierto;
    }

    public void girarEngrane(int eng, int pos){
        // aqui va la lógica
        switch (eng){
            case 0:
                engranes[0].girar(pos);
                break;
            case 1:
                engranes[1].girar(pos);
                break;
            case 2:
                engranes[2].girar(pos);
                break;
            default:
                System.out.println("Ese engrane no existe");
        }


    }
}
