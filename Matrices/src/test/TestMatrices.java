package test;
import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        
        System.out.println("edades = " + edades);
        
        edades[0][0]=5;
        edades[0][1]=7;
        edades[1][0]=8;
        edades[1][1]=4;
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                //System.out.print(" " + edades[ren][col]);
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
                
            }
            //System.out.println("");
        }
    
    
    String frutas[][] = {{"Naranja", "Limon"},{"Freza", "Zarzamora", "Mora"}}; 
    
    for (int ren=0; ren< frutas.length; ren++){
        for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("fruta " + ren + "-" + col + ": " + frutas[ren][col]);
            
        }
    
    }
    
    Persona personas[][] = new Persona[2][3];
    
    
    personas[0][0]= new Persona ("Juan");
    personas[0][1]= new Persona ("Luis");
    personas[0][2]= new Persona ("Jose");
    personas[1][0]= new Persona ("Sakura");
    personas[1][1]= new Persona ("Nana");
    personas[1][2]= new Persona ("Kaguya");
    //variable[][]= new llamadaDeIntanciarLaClase();
    
    
    imprimir (personas);
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    public static void imprimir(Object matriz[][]){
        
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
        
    }
    
    
    
    
    
}
