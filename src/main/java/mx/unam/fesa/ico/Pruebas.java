package mx.unam.fesa.ico;

import mx.unam.fesa.ico.composicion.Procesador;
import mx.unam.fesa.ico.composicion.Teclado;

public class Pruebas {
    public static void main(String[] args) {
        Computadora c1 = new Computadora();
        System.out.println(c1);

        Procesador cpu = new Procesador("Intel",2.4f,"i5",4);
        c1.setProcessor(cpu);

        System.out.println(c1);


        c1.setMarca("HP");
        System.out.println(c1);


        c1.setModelo("Pavillion 1000");
        System.out.println(c1);



        Teclado t1 = new Teclado(101,"Kingston","K1000");
        c1.setKeyBoard(t1);
        System.out.println(c1);

        c1.setKeyBoard(new Teclado(101, "GENIUS", "G300"));


        c1.getProcessor().setModelo("i9");
        System.out.println(c1);

        c1.getKeyBoard().setNumeroTeclas(110);
        System.out.println(c1);    }
}
