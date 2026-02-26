package mx.unam.fesa.ico.composicion.ejercicio2;

public class Engrane {
    private int posicion;

    public Engrane() {
    }

    public Engrane(int pisicion) {
        this.posicion = pisicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Engrane{" +
                "pisicion=" + posicion +
                '}';
    }

    public void girar(int pos){
        this.posicion = (this.posicion+pos) % 10;
    }
}
