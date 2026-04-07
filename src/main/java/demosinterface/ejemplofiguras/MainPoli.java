package demosinterface.ejemplofiguras;


import java.util.ArrayList;

public class MainPoli {
    public static void main(String[] args) {
        ArrayList<Circulo> listaCirculos = new ArrayList<>();
        // meter circulos en en listaCirculos
        ArrayList<Cuadrado> listaCuadrados = new ArrayList<>();
        // codigo para meter cuadrados en listaCuadrados


        // polimorfismo
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo());
        listaFiguras.add(new Circulo());
        listaFiguras.add(new Circulo());
        listaFiguras.add(new Cuadrado(2.0f,3.0f,0.0f,0.0f));
        listaFiguras.add(new Cuadrado());
        listaFiguras.add(new Cuadrado());
        listaFiguras.add(new Cuadrado());

        for (Figura fig : listaFiguras){
            System.out.println(fig.calcularArea());
        }


    }
}
