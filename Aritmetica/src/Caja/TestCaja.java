/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caja;

/**
 *
 * @author joser
 */
public class TestCaja {
    public static void main (String[] args){
        caja caja1 = new caja();
        
        
        System.out.println("Volumen es: " + caja1.cajaCalVolumen());
        caja1.cajaDefinir(2, 3, 6);
        System.out.println("Volumen es: " + caja1.cajaCalVolumen());
        
    }
    
}
