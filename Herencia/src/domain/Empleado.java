package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    
    public Empleado(){
        //super(); por defecto se ejecuta esta linea y no es necesario escribirla
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        
        this();//esto llama directamente al contructor vacio (linea 9)
        this.nombre = nombre; //se puede modificar porque los atributos de la clase padre son protected
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    
    
    
    
    
    
    
    
}
