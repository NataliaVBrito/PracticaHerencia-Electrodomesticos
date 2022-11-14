package entidades;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

     @Override
    public String toString() {
        return  "Electrodomestico: Televisor\nColor\tResolucion\tPeso(kg)\tConsumo\tSintonizador\tPrecio\n" 
                + color + "\t " + resolucion + "\t" + peso + "\t" + consumo + "\t" + sintonizador + "\t$" + precio;
    }    
}
