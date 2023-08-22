
package shoponline2;
//Thomas y juli
public class Remera extends Producto {

    public String talle;

    public Remera(String talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

    public String toString() {
        return "Talle: " + talle;
    }

    public double getPrecio() {
        if (talle.equalsIgnoreCase(Talle.S.getTalle())) {
            double s = precio;
            precio = s;
        }

        if (talle.equalsIgnoreCase(Talle.M.getTalle())) {
            double m = precio * 5 / 100;
            precio = precio + m;
        }

        if (talle.equalsIgnoreCase(Talle.L.getTalle())) {
            double l = precio * 10 / 100;
            precio = precio + l;
        }

        if (talle.equalsIgnoreCase(Talle.XL.getTalle())) {
            double xl = precio * 15 / 100;
            precio = precio + xl;
        }

        return precio;
    }

}
