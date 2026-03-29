package demosinterface.ejemplofiguras;

public interface Figura {
    public static final int TIPO_CIRCULO = 1;
    public static final int TIPO_CUADRADO = 2;
    public static final int TIPO_TRIANGULO = 3;
    public static final int TIPO_HEXAGONO =4;

    public abstract float calcularArea();
}
