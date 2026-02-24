package mx.unam.fesa.ico.composicion.ejercicio1;

public class Tv {
    private String marca;
    private float precio;
    private int pulgadas;
    private Pantalla pantalla;
    private Volumen vol;
    private Canal channel;

    public Tv() {
    }

    public Tv(String marca, float precio, int pulgadas, Pantalla pantalla, Volumen vol, Canal channel) {
        this.marca = marca;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.pantalla = pantalla;
        this.vol = vol;
        this.channel = channel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Volumen getVol() {
        return vol;
    }

    public void setVol(Volumen vol) {
        this.vol = vol;
    }

    public Canal getChannel() {
        return channel;
    }

    public void setChannel(Canal channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pulgadas=" + pulgadas +
                ", pantalla=" + pantalla +
                ", vol=" + vol +
                ", channel=" + channel +
                '}';
    }

    public void estado(){
        System.out.println("Encedido:" + pantalla.isEncendida());
        System.out.println("Canal actual:" + channel.getCanal());
        System.out.println("Volumen actual:" + vol.getNivel());
    }

    public void subirVolumen(int vs){
        if (this.pantalla.isEncendida()){
            this.vol.subir(vs);
        }else{
            System.out.println("la Tv está apagada!!");
        }
    }
}
