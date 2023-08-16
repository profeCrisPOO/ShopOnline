package shoponline;

public class Pantalon extends Producto {

    public int talle;

    public Pantalon(String desc, double precio) {
        super(desc, precio);
    }

    public double getPrecio() {
        if ("talle".equalsIgnoreCase("oxford")) {
            double oxford = precio * 15 / 100;
            precio = precio + oxford;
        }

        if ("talle".equalsIgnoreCase("skinny")) {
            double skinny = precio * 25 / 100;
            precio = precio + skinny;
        }

        if ("talle".equalsIgnoreCase("recto")) {
            double recto = precio * 15 / 100;
            precio = precio - recto;
        }
        return precio;
    }

    public String toString() {
        return "Talle: " + talle;
    }
}
