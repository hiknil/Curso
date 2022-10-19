package palabrathis;

public class PalabraThid {
    public static void main(String[] args) {
        Persona persona = new Persona ("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
}


class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al contructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this:" + this);
        // Imprimir imprimir = new Imprimir(); //No es necesario definir una variable para imprimir 
        new Imprimir().imprimir(this);
        
    }
}


class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir:" + persona);
        System.out.println("impresion de objeto actual (this) " + this);
    }
    
    
}