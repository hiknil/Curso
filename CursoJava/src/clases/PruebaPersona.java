/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author joser
 */
//clases siempre van en mayusculas la primera letra si son dos pabras

public class PruebaPersona {
    
    public static void main (String[] args){
        Persona persona01 = new Persona();
        
        
        persona01.nombre = "Juan";
        persona01.apellido = "Perez";
        persona01.desplegarInformacion();
        
        Persona persona02 =new Persona();
        
        System.out.println("persona01" + persona01);
        System.out.println("persona02" + persona02);
        System.out.println("Nombre persona02: " +persona02.nombre);
        System.out.println("Apellido persona02: " +persona02.apellido);
        
        persona02.apellido="Lara";
        persona02.nombre="Karla";
        System.out.println("Nombre persona02: " + persona02.nombre);
        System.out.println("Apellido persona02: " + persona02.apellido);
        
    }
    
    
    
}
