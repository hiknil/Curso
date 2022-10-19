package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 5000.00, false);
        System.out.println("Persona1 nombre antes de cambio: " + persona1.getNombre());
        System.out.println("Persona1: " + persona1); //no es necesario usar  .toString() ya que print y println lo llaman por defecto
        persona1.setNombre("Juan Calos");
        //El siguente metodo ya no es valido
        //persona1.nombre = "Juan carlos";
        /*
        System.out.println("Persona1 nombre: " + persona1.getNombre());
        System.out.println("Persona1 sueldo: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado());
        */
        System.out.println("Persona1: " + persona1.toString());
        
        
        
    }
    
    
    
}
