package mx.unam.fesa.ico.composicion.ejercicio1;

public class Volumen {
    private int nivel;


    public Volumen() {
    }

    public Volumen(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if(nivel>=0 && nivel <= 100)
            this.nivel = nivel;
        else
            System.out.println("Ese valor excede los líites");
    }

    @Override
    public String toString() {
        return "Volumen{" +
                "nivel=" + nivel +
                '}';
    }

    public void subir(int nivelesSubir){
        this.setNivel(this.getNivel() + nivelesSubir);
    }



}
