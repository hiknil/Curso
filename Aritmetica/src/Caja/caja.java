
package Caja;


public class caja {
    int alto;
    int ancho;
    int profundo; //riko
    
    public caja (){
        System.out.println("Constructor de caja");        
    }
    public void cajaDefinir (int alto, int ancho, int profundo/*riko*/){
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo;//riko        

}
   public int cajaCalVolumen(){
       return this.alto*this.ancho*this.profundo;
   }
    
}
