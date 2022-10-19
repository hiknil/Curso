package test;
import domain.Persona;

public class testarreglosobejot {
    public static void main(String[] args) {
        //ejemplo de creacion de arrego
        //int edades[] = new int[3]
        
        Persona personas[] = new Persona[3];
    
    int hola[] = new int[4];
        
        personas[0] = new Persona("juan");
        personas[1] = new Persona("Karla");
        
        for (int i = 0; i <personas.length; i++) {
            System.out.println("Personas "+ i +":"+ personas[i]);
        }
        
        
        String frutas[] = {"Naranaja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas 0"+i+":" + frutas[i]);
            
        }
        for (int i=0; i<hola.length; i++){
            System.out.println("hola = " + hola[i]);
    
    }
    }
    

}
