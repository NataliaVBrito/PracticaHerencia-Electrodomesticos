package servicio;

import entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio extends Electrodomestico {

    public char comprobarConsumoEnergetico(char consumo) {
        String letra = String.valueOf(consumo);
        letra = letra.toUpperCase();

        if (!letra.equals("A") || !letra.equals("B") || !letra.equals("C") || !letra.equals("D") || !letra.equals("E")) {
            return consumo = ('F');
        }
        
        return consumo;
    }

    public String comprobarColor(String color) {       
        color = color.toUpperCase();

        if (!color.equals("NEGRO") || !color.equals("ROJO") || !color.equals("AZUL") || !color.equals("GRIS")) {
            return color = "BLANCO";
        }
        return color;
    }

    public void crearElectrodomestico(Electrodomestico e) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿De qué color es el electrodomestico?");
        String colorcito = scanner.next();
        e.setColor(comprobarColor(colorcito));

        System.out.println("¿De cuál categoria es su consumo? A, B, C, D, E, o F");
        char tipoC = scanner.next().charAt(0);
        e.setConsumo(comprobarConsumoEnergetico(tipoC));
        

        System.out.println("¿Cuántos kilos pesa el artefacto?");
        e.setPeso(scanner.nextDouble());

        e.setPrecio(1000);
    }

    public void precioFinal(Electrodomestico e) {
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio() + 1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio() + 800);
                break;
            case 'C':
                e.setPrecio(e.getPrecio() + 600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio() + 500);
                break;
            case 'E':
                e.setPrecio(e.getPrecio() + 300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio() + 100);
                break;
        }

        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            e.setPrecio(e.getPrecio() + 100);

        } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            e.setPrecio(e.getPrecio() + 500);

        } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            e.setPrecio(e.getPrecio() + 800);

        } else if (e.getPeso() >= 80) {
            e.setPrecio(e.getPrecio() + 1000);
        }
    }
}
