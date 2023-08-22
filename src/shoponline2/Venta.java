package shoponline2;
//Thomas y juli
import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> listaProd = new ArrayList();
    public Cliente cliente;
    public static int cantVentas;
    public static int nroFact = 1090;
    LocalDate fecha;

    public Venta(Cliente cliente) {

        this.cliente = cliente;
        this.nroFact = nroFact++;
        this.fecha = LocalDate.now();
    }

    public void agregarProductos(Producto p) {
        this.listaProd.add(p);
    }

    public double importeTotal() {
        double precioTotal = 0;
        for (Producto producto : this.listaProd) {
            precioTotal = precioTotal + producto.getPrecio();
        }

        return precioTotal;
    }

    public void imprimirFactura() {

        String text = "";
        text += "---------------\n";
        text += "Factura N°: " + this.nroFact + " - " + this.fecha;
        this.nroFact ++;
        for (Producto p : this.listaProd) {
            System.out.println(p.toString());
            

        }
        text += "Total a pagar: " + this.importeTotal() + "\n";
        System.out.println(text);
    }
}
