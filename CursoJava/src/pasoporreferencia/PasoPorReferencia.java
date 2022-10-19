package pasoporreferencia;
import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre="Juan";
        System.out.println("Persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("Persona1= "+persona1.nombre);
    }
    

    public static Persona cambiarValor(Persona persona){
        
        if (persona != null){
            persona.nombre = "Karla";
        }else{
            System.out.println("Valor de la persona invalido");
            
        }
        
       return persona;
    }


}


