package mx.unam.fesa.ico.composicion.ejercicio1;

public class MainEjemplo1 {
    public static void main(String[] args) {
        Pantalla p1 = new Pantalla();
        System.out.println(p1);
        p1.encender();
        System.out.println(p1);
        //---------

        Volumen vol = new Volumen(80);
        System.out.println(vol);
        vol.subir(15);
        System.out.println(vol);

        //-----
        Canal chanel = new Canal(97);
        System.out.println(chanel);
        chanel.canalSiguiente();
        System.out.println(chanel);
        chanel.canalSiguiente();
        System.out.println(chanel);
        chanel.canalSiguiente();
        System.out.println(chanel);

        System.out.println("Probando la composición de TV");
        Tv tele = new Tv("Samsung",6500.5f, 52,
                new Pantalla("52 pulgadas", false),
                new Volumen(10),
                new Canal(2)
                );

        System.out.println(tele);
        System.out.println("Cambiando al sig canal");
        tele.getChannel().canalSiguiente();
        System.out.println(tele);
        tele.getVol().subir(87);
        System.out.println(tele);
        tele.getChannel().canalSiguiente();
        System.out.println(tele);
        tele.getChannel().canalSiguiente();
        System.out.println(tele);
        tele.getChannel().canalSiguiente();
        System.out.println(tele);
        tele.estado();
        System.out.println(tele);
        tele.subirVolumen(10);
        System.out.println("encendiendo tele");

        tele.getPantalla().encender();
        tele.subirVolumen(2);
        tele.estado();

    }
}
