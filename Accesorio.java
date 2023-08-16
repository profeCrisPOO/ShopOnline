package shoponline;

public class Accesorio extends Producto {

    public double peso;
    public String metal;

    public Accesorio(double peso, String metal, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }

    public String toString() {
        return "peso:" + peso + ", metal:" + metal;
    }

    public double getPrecio() {

        if ("metal".equalsIgnoreCase("oro")) {
            this.precio = 33;
        }

        if ("metal".equalsIgnoreCase("plata")) {
            this.precio = 24;
        }

        if ("metal".equalsIgnoreCase("acero")) {
            this.precio = 1;
        }

        double precioF = precio * peso;

        return precioF;
    }
}
