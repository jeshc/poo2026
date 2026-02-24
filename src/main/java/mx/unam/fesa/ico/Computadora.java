package mx.unam.fesa.ico;

import mx.unam.fesa.ico.composicion.Procesador;
import mx.unam.fesa.ico.composicion.Teclado;

public class Computadora {
    private String marca;
    private String modelo;

    // composicion
    private Teclado keyBoard;
    private Procesador processor;

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", keyBoard=" + keyBoard +
                ", processor=" + processor +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(Teclado keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Procesador getProcessor() {
        return processor;
    }

    public void setProcessor(Procesador p) {
        //
        this.processor = p;
    }

    public Computadora(String marca, String modelo, Teclado keyBoard, Procesador processor) {
        this.marca = marca;
        this.modelo = modelo;
        this.keyBoard = keyBoard;
        this.processor = processor;
    }

    public Computadora() {
    }
}
