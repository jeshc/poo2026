package mx.unam;

import java.util.ArrayList;

public class DemoArrayList {
    static void main() {
        System.out.println("Demo ArrayList");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("jesus");
        lista.add("maria");
        lista.add("josé");
        System.out.println(lista.size());
        System.out.println(lista);
        System.out.println(lista.get(1));
        System.out.println(lista);
        String quitado = lista.remove(1);
        System.out.println("Tamaño:" + lista.size() );
        System.out.println( lista);
        System.out.println(quitado);
        lista.add(0,"juan");
        System.out.println(lista);


    }
}
