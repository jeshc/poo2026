package mx.unam.fesa.ico;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
    public MiVentana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(800,600);
        this.setVisible(true);
    }
}
