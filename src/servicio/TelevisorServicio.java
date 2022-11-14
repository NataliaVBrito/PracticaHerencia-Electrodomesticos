package servicio;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;

public class TelevisorServicio extends ElectrodomesticoServicio {

    Televisor tv;

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

    public Televisor crearTele() {
        Scanner scanner = new Scanner(System.in);

        tv = new Televisor();
        super.crearElectrodomestico(tv);

        System.out.println("¿Cuanta resolución tiene? Ingresala en pulgadas");
        int pulgadas = scanner.nextInt();
        tv.setResolucion(pulgadas);

        System.out.println("¿Tiene sintonizador? S o N");
        char s = scanner.next().charAt(0);
        if (String.valueOf(s).equalsIgnoreCase("s")) {
            tv.setSintonizador(true);
        } else {
            tv.setSintonizador(false);
        }

        return tv;
    }

    @Override
    public void precioFinal(Electrodomestico e) {
        super.precioFinal(e);

        if (tv.getResolucion() > 40) {
            double aumento = tv.getPrecio() * 0.3;
            tv.setPrecio(tv.getPrecio() + aumento);
        }

        if (tv.isSintonizador()) {
            tv.setPrecio(tv.getPrecio() + 500);
        }
    }
}
