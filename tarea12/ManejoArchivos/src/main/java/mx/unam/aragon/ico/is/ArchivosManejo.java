package mx.unam.aragon.ico.is;

import mx.unam.aragon.ico.is.demoarchivos.Alumno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivosManejo {
    private String ruta;

    public ArchivosManejo() {
    }

    public ArchivosManejo(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void escribir(String texto){

        try (FileOutputStream salida = new FileOutputStream(this.ruta)) {
            salida.write(texto.getBytes());
            System.out.println("Fin de escritura");

        } catch ( FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException ioe ){
            System.out.println("Error al escribir");
        }
    }

    public void leer(){

        try (FileInputStream entrada = new FileInputStream(this.ruta)) {
            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                System.out.print((char) byteLeido);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }



}