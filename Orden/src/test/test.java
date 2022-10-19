package test;
import domain.Orden;
import domain.Producto;

public class test {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        System.out.println(orden1.calcularTotal());
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        System.out.println(orden2.calcularTotal());
        orden2.mostrarOrden();
        
        String nombre = "none";
        double precio= 8.8;
        Producto producto = new Producto(nombre, precio);
        
        orden1.agregarProducto(producto);
        
        orden1.toString();
        
        
        
    }
    
}
