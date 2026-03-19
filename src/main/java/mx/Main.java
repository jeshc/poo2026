package mx.unam;

import mx.unam.minecraft.mundo.Bloque;
import mx.unam.minecraft.mundo.BloqueTronco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Spawneando....");
        Bloque b1 = new Bloque("Bloque", 3,3,3,100.0f,"Rugoza","Pocc","Roca",true,64,false,0,0,0,0,10);
        Bloque b2 = new Bloque("Lisa","Crack","Metal",100);

        System.out.println(b1);
        System.out.println(b2);
        b1.golpear();
        b1.colocar(20,3,20);
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        b1.golpear();
        // bloque quitado del munto
        b1.golpear();
        // prueba tronco bloque

        BloqueTronco bc1 = new BloqueTronco("Poroso","Tlack","Madera",5);
        System.out.println(bc1);
        bc1.colocar(20,4,20);
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();

        bc1.tallar();
        bc1.colocar(203,43,22);
        bc1.tallar();
        System.out.println(bc1);
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        bc1.golpear();
        System.out.println(bc1);


    }
}
