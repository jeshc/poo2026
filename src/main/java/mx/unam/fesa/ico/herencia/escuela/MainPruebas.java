package mx.unam.fesa.ico.herencia.escuela;

public class MainPruebas {
    public static void main(String[] args) {
        Persona per1 = new Persona("Jose", 19, "Masculino");
        System.out.println(per1);
        per1.hablar();
        per1.comer();
        System.out.println("------");
        Alumno al = new Alumno("Diego",20,"MAsculino","333232323","ICO");
        System.out.println(al);
        al.dormir();
        al.comer();
        al.estudiar();

    }
}
