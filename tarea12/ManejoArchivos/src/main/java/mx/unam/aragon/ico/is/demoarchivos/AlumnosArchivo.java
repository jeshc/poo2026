package mx.unam.aragon.ico.is.demoarchivos;

import java.io.*;
import java.util.ArrayList;

public class AlumnosArchivo {
    private String ruta;

    public AlumnosArchivo(String ruta){
        this.ruta = ruta;
    }

    public void escribir(Alumno alumno){
        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
                ){

            salida.writeObject(alumno);
            System.out.println("Alumno guardado correctamente.");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }


    public Alumno leer(){
        try(
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ){

            Alumno leido = (Alumno) entrada.readObject();
            return leido;

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public void escribirAlumnos(ArrayList<Alumno> alumnos){

    }

    public ArrayList<Alumno> leerAlumnos(){

        return null;
    }
}
