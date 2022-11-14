package ejercicio2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import servicio.ElectrodomesticoServicio;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("LAVADORA");
        LavadoraServicio lavSer = new LavadoraServicio();
        Lavadora lav = lavSer.crearLavadora();
        lavSer.precioFinal(lav);

        System.out.println(lav.toString());

        System.out.println("**********************************************");

        System.out.println("TELEVISOR");

        TelevisorServicio tvSer = new TelevisorServicio();
        Televisor tv = tvSer.crearTele();
        tvSer.precioFinal(tv);

        System.out.println(tv.toString());
    }
}
