package entidades;

public class Electrodomestico {
    protected double precio, peso;
    protected String color;
    protected char consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }    
}
