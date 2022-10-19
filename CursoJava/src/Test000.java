/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joser
 */

import java.util.*;

public class Test000 {
    public static void main(String args[]){
        char nota='S';
        int numero = -1;
        Scanner entrada = new Scanner(System.in);
        
        
        
        System.out.println("Proporciona un valor del 0 al 10");
        numero=Integer.parseInt(entrada.nextLine());
        
        if((numero>=9)&&(numero<=10)){
            nota='A';
        }else if ((numero>=8)&&(numero<9)){
            nota='B';
        }else if ((numero>=7)&&(numero<8)){
            nota='C';
        }else if ((numero>=6)&&(numero<7)){
            nota='D';
        }else if ((numero>=0)&&(numero<5)){
            nota='F';
        }
        
        if (nota=='S')
            System.out.println("Valor incorrecto");
        else{
            System.out.println("La nota: " + nota);
        }
    }
    
            
        
        
        
    }
    

