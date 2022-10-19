package operaciones;

public class PruebaAritmetica {
    
    public static void main (String[] args){
        Aritmetica aritmetica1 = new Aritmetica();
        
        System.out.println("Aritmetica a:" + aritmetica1.a);
        System.out.println("Aritmetica b:"+ aritmetica1.b);
        
        Aritmetica aritmetica2=new Aritmetica(5,8);
        System.out.println("Aritmetica a:" + aritmetica2.a);
        System.out.println("Aritmetica b:"+ aritmetica2.b);
        
    }
}
