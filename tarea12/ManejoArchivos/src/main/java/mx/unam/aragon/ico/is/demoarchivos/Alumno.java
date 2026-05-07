package mx.unam.aragon.ico.is.demoarchivos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Alumno implements Serializable {
    private String numeroCuenta;
    private String nombre;
    private String apellidos;
    private Double promedio;


}
