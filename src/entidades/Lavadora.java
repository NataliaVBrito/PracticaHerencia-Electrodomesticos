package entidades;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    } 

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return  "Electrodomestico: Lavadora\nColor\tCarga(kg)\tPeso(kg)\tConsumo\tPrecio\n" 
                + color + "\t " + carga + "\t" + peso + "\t" + consumo + "\t$" + precio;
    }    
}
