package shoponline2;
//cova y julieta
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese su teléfono: ");
        int telefono = teclado.nextInt();
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese su dni: ");
        int dni = teclado.nextInt();
        Cliente cliente = new Cliente(nombre, edad, telefono, dni);
        Venta V1 = new Venta(cliente);
        Producto p = menu();
        V1.agregarProductos(p);
        
       
    }
    public static Producto menu(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Remera("s", "Recta Blanca ", 2500));
        productos.add(new Pantalon("oxford", "Tiro Alto ", 5000));
        productos.add(new Accesorio(2, "Oro", "Collar + dije cruz ", 1500));
        String text = "------Menu------\n";
        int index = 0;//posicion array
        for(Producto p : productos){
            text += index + ": " + p.toString() + "\n";
            index++;
        }
        System.out.println(text);
        System.out.println("Elija el producto que desee: ");
        int opc = teclado.nextInt();
        return productos.get(opc);//te devuelve el producto del index seleccionado
    }
}
