package mx.unam.aragon.ico.is;

import mx.unam.aragon.ico.is.demoarchivos.Alumno;
import mx.unam.aragon.ico.is.demoarchivos.AlumnosArchivo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("" + System.getProperty("user.name"));
        System.out.println("" + System.getProperty("java.version"));
        System.out.println("" + System.getProperty("os.version"));
        System.out.println("" + System.getProperty("os.arch"));
        System.out.println("" + System.getProperty("os.name"));
        System.out.println("" + System.getProperty("user.home"));


        ArchivosManejo archivo = new ArchivosManejo("ejemplo.txt");
        String mensaje = """
                Este es el 
                mensaje a escribir 
                en el archivo.
                """;

        archivo.escribir(mensaje);
        System.out.println("---------");
        archivo.leer();
        System.out.println("----------------");
        Alumno al1= new Alumno("303030303","Jose","garcia",8.9);
        System.out.println(al1);

        AlumnosArchivo archivos = new AlumnosArchivo("alumnos.dat");
        //archivos.escribir(al1);
        Alumno leido = archivos.leer();
        System.out.println("Alumno leido desde el archivo" + leido);


    }
}
