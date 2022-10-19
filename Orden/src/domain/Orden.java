package domain;

public class Orden extends Producto {

    private int idOrden;
    private static int contadorOrdenes;//variable incremetna en el contructor por cada objeto orden creado
    private static final int MAX_PRODUCTOS=10;
    Producto productos[] = new Producto[MAX_PRODUCTOS];
    
    
    
    
    
    public Orden(){
        //aqui se inicializa idorden y el arreglo de productos
        
        this.idOrden=0;
        for (int i = 0; i < MAX_PRODUCTOS; i++)
        {
            //this.productos[i]= new Producto("uan", ((i+1)*10));
            this.productos[i] = new Producto("Vacio", (i+1));
        }
    
        
    }
    
    
    public void agregarProducto (Producto producto){
        if (contadorOrdenes<10) {
            this.productos[this.contadorOrdenes] = new Producto(producto.getNombre(), producto.getPrecio());
            this.idOrden=Orden.contadorOrdenes++;
            
        }else
            System.out.println("Sin Espacio");
            
        
        
    }
    
    public double calcularTotal(){
        //suma todos los precios en la orden //los precios se encuentran en el arreglo productos
        double sum=0;
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            sum=sum+this.productos[i].getPrecio();
        }
        return sum;
    }
    
    public void mostrarOrden(){
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.println(this.productos[i].toString());
        }
        
    }
    
    
    
    
    
    
}
