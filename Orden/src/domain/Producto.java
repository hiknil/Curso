
package domain;


public class Producto {
    
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto=0;
    
    
   private Producto (){
       
        this.idProducto = Producto.contadorProducto++;

        
    }
    public Producto (String nombre, double precio){
        this();
        this.nombre=nombre;
        this.precio=precio;
    }
    

    public int getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("ID:").append(idProducto);
        sb.append(", nombre:").append(nombre);
        sb.append(" ").append(precio);
        sb.append("$, contadorProducto=").append(contadorProducto);
        sb.append('.');
        return sb.toString();
    }

    
    
    
    
    
    
    
    
    
    
    
}
