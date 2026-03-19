package genericos;

import mx.unam.fesa.ico.composicion.Mouse;
import mx.unam.fesa.ico.composicion.Procesador;
import mx.unam.fesa.ico.herencia.casio.RadioReloj;
import mx.unam.fesa.ico.herencia.casio.RadioRelojDespertador;
import mx.unam.fesa.ico.herencia.casio.Reloj;
import mx.unam.fesa.ico.herencia.escuela.Persona;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class PruebaElementos {
    public static void main(String[] args) {
        Procesador[] procesadores= new Procesador[CajaCarton.CAPACIDAD];
        CajaCarton<Procesador> cajaTiliches = new CajaCarton<>(procesadores);
        cajaTiliches.add( new Procesador("Intel",1.4f,"i5",4) , 0);
        cajaTiliches.add( new Procesador("Intel",1.6f,"i7",8) , 1);
        cajaTiliches.add( new Procesador("Intel",2.0f,"i9",16) , 2);
        System.out.println(cajaTiliches.get(9));
        System.out.println( cajaTiliches.get(0) );

        System.out.println("----------------");
        for (int i = 0; i < CajaCarton.CAPACIDAD; i++) {
            System.out.println(cajaTiliches.get(i));
            //System.out.println("Marca:" + cajaTiliches.get(i).getMarca());
        }

        System.out.println("--- otro ejemplo ----");

        CajaCarton<RadioReloj> tileches = new CajaCarton<>(new RadioReloj[CajaCarton.CAPACIDAD]);
        tileches.add(new RadioReloj("Casio",101.7f,10,true,new Reloj(0,0,0)),0);
        tileches.add(new RadioReloj("Rolex",101.7f,10,true,new Reloj()),1);
        tileches.add(new RadioReloj("Samsung",101.7f,10,true,new Reloj()),2);
        tileches.add(new RadioReloj("Motorola",101.7f,10,true,new Reloj()),3);
        System.out.println(tileches.get(0));
        tileches.add(new RadioRelojDespertador("Casio",1.0f,11,true,new Reloj(),11,11,11,false),4);


        CajaCarton<String> ejemplo2 = new CajaCarton<>(new String[CajaCarton.CAPACIDAD]);
        ejemplo2.add("Hola",0);
        ejemplo2.add("adios",1);
        ejemplo2.add("ke",2);
        ejemplo2.add("aze",3);
        System.out.println(ejemplo2.get(1));
        System.out.println("-.-.-.-");

        CajaCarton<Persona> ejemplo3 = new CajaCarton<>(new Persona[10]);

        ejemplo3.add(new Persona("jesus",23,"MASCULINO"),0);
        System.out.println(ejemplo3.get(0));
        System.out.println(ejemplo3.get(0).getGenero());
        // ejemplo3.add(new RadioReloj(),9);

        System.out.println("------ api collections ---");
        //listas dinamicas con genericos
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("José",22,"MAsculino"));
        listaPersonas.add(new Persona("Diego",18,"MAsculino"));
        listaPersonas.add(new Persona("Diana",21,"Femenino"));
        listaPersonas.add(new Persona("Andrea",20,"Femenino"));
        listaPersonas.add(new Persona("David",22,"MAsculino"));
        listaPersonas.add(new Persona("Pancho",23,"MAsculino"));

        for(Persona p: listaPersonas ){
            System.out.println(p);
        }

        // ejemplo de HashMap
        HashMap<String,String> datos = new HashMap<>();
        datos.put("0","Papas");
        datos.put("1","Pepsi");
        datos.put("2","Hamburgues");
        datos.put("algo","Tacos");
        System.out.println(  datos.get("algo") );

// hashmap de relojes
        System.out.println("hash de relojes");
        HashMap<String, Reloj> cosas2 = new HashMap<>();
        cosas2.put("smartIOS" , new Reloj(0,0,0));
        cosas2.put("depared" , new Reloj(11,11,11));
        cosas2.put("smartIOS" , new Reloj(23,59,40));
        System.out.println(cosas2.get("depared"));
        cosas2.get("depared").incrementaSegundo();
        System.out.println(cosas2.get("depared"));

        System.out.println(cosas2);


    }
}
