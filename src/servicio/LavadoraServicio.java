package servicio;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

public class LavadoraServicio extends ElectrodomesticoServicio {

    Lavadora lav;

    @Override
    public char comprobarConsumoEnergetico(char consumo) {
        return super.comprobarConsumoEnergetico(consumo);
    }

    @Override
    public String comprobarColor(String color) {
        return super.comprobarColor(color);
    }

    @Override
    public void crearElectrodomestico(Electrodomestico e) {
        super.crearElectrodomestico(e);
    }

    public Lavadora crearLavadora() {
        Scanner scanner = new Scanner(System.in);

        lav = new Lavadora();
        super.crearElectrodomestico(lav);

        System.out.println("¿De cuanto es la carga de la lavadora?");
        lav.setCarga(scanner.nextDouble());

        return lav;
    }

    @Override
    public void precioFinal(Electrodomestico e) {
        super.precioFinal(e);

        if (lav.getCarga() > 30) {
            lav.setPrecio(lav.getPrecio() + 500);
        }
    }
}
