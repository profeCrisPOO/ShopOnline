
package shoponline;

public class Remera extends Producto {

    public char talle;

    public Remera(char talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

    public String toString() {
        return "Talle: " + talle;
    }

    public double getPrecio() {
        if ("talle".equalsIgnoreCase("s")) {
            double s = precio;
            precio = s;
        }

        if ("talle".equalsIgnoreCase("m")) {
            double m = precio * 5 / 100;
            precio = precio + m;
        }

        if ("talle".equalsIgnoreCase("l")) {
            double l = precio * 10 / 100;
            precio = precio + l;
        }

        if ("talle".equalsIgnoreCase("xl")) {
            double xl = precio * 15 / 100;
            precio = precio + xl;
        }

        return precio;
    }

}
