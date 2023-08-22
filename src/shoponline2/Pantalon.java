package shoponline2;

public class Pantalon extends Producto {
//thomas 
    public String talle;

    public Pantalon(String talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

    public double getPrecio() {
        if (talle.equalsIgnoreCase(Modelos.OXFORD.getModelo())) {
            double oxford = precio * 15 / 100;
            precio = precio + oxford;
        }

        if (talle.equalsIgnoreCase(Modelos.RECTO.getModelo())) {
            double skinny = precio * 25 / 100;
            precio = precio + skinny;
        }

        if (talle.equalsIgnoreCase(Modelos.SKINNY.getModelo())) {
            double recto = precio * 15 / 100;
            precio = precio - recto;
        }
        return precio;
    }

    public String toString() {
        return "Talle: " + talle;
    }
}
