package mx.unam.fesa.ico.herencia.escuela;

public class Alumno extends Persona{

    private String numeroCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String genero, String numeroCuenta, String carrera) {
        super(nombre, edad, genero); // new Persona(nombre, edad, genero);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void estudiar(){
        System.out.println(this.nombre + " Esta wstudiuando");
        System.out.println("De temas de la carrera " + this.carrera);
    }

    public void hacerTarea(){
        System.out.println(this.nombre + " Esta haciendo tarea");
        System.out.println("De temas de la carrera " + this.carrera);
    }

    public void comer(){
        System.out.println(this.nombre + " Esta comiendo como cerdo!!");
    }

}
