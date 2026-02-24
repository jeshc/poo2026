package mx.unam.fesa.ico.composicion;

public class Procesador {
    private String marca;
    private float velocidad;
    private String modelo;
    private int nucleos;

    public Procesador(String marca, float velocidad, String modelo, int nucleos) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.nucleos = nucleos;
    }

    public Procesador() {
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", modelo='" + modelo + '\'' +
                ", nucleos=" + nucleos +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}
