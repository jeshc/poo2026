package mx.unam.fesa.ico.composicion.ejercicio2;

public class Pruebas {
    public static void main(String[] args) {
        Candado can = new Candado();

        System.out.println(can);
        can.girarEngrane(0,2);
        System.out.println(can);
        can.setCombinacion("123");
        System.out.println(can);
        can.abrir();
        can.girarEngrane(0,9);
        can.girarEngrane(1,2);
        can.girarEngrane(2,3);
        can.abrir();
    }
}
