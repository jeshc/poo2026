package mx.unam.fesa.ico.composicion.ejercicio1;

public class Pantalla {
    private String tamanho;
    private boolean encendida;

    public Pantalla() {
    }

    public Pantalla(String tamanho, boolean encendida) {
        this.tamanho = tamanho;
        this.encendida = encendida;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "tamanho='" + tamanho + '\'' +
                ", encendida=" + encendida +
                '}';
    }

    public boolean encender(){
        this.encendida = true;
        return  this.encendida;
    }

    public boolean apagar(){
        this.encendida = false;
        return  this.encendida;
    }

}
