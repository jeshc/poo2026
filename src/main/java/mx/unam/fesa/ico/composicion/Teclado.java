package mx.unam.fesa.ico.composicion;

public class Teclado {
    private int numeroTeclas;
    private String marca;
    private String modelo;

    @Override
    public String toString() {
        return "Teclado{" +
                "numeroTeclas=" + numeroTeclas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado(int numeroTeclas, String marca, String modelo) {
        this.numeroTeclas = numeroTeclas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Teclado() {
    }
}
