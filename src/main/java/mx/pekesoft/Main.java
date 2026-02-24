package mx.pekesoft;

import mx.unam.fesa.ico.Bicicleta;
import mx.unam.fesa.ico.MiVentana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Bicicleta b1 = new Bicicleta();
        System.out.println(b1.toString());
        Bicicleta b2 = new Bicicleta("Roja",0.8f, 0.3f, 10, "Carbono");
        System.out.println(b2.toString());
        b2.setAltura(2.0f);
        System.out.println(b2);
        MiVentana m1 = new MiVentana("Hola mundo");

    }
}