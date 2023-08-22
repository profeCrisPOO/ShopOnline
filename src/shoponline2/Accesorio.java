package shoponline2;

public class Accesorio extends Producto {

    public double peso;
    public String metal;
// modificar
    public Accesorio(double peso, String metal, String desc, [double precio]) {
        super(desc, precio);// super(desc, this.getPrecio());
        this.peso = peso;
        this.metal = metal;
    }
    
    public String toString() {
        return "peso:" + peso + ", metal:" + metal;
    }

    public double getPrecio() {
        if (metal.equalsIgnoreCase(Metales.ORO.getMetal())) {
            this.precio = 33;
        }

        if (metal.equalsIgnoreCase(Metales.PLATA.getMetal())) {
            this.precio = 24;
        }
        
        if (metal.equalsIgnoreCase(Metales.ACERO.getMetal())) {
            this.precio = 1;
        }

        double precioF = precio * peso;

        return precioF;
    }
}
