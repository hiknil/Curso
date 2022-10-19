package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //contructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando contrusctor");
    }
    public Aritmetica(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando contructor con argumento");
        
    }
    
    
    //metodo
    public void sumar() {
        
        int resultado = a+b;
        System.out.println("Resultado = " + resultado);
        
    }
    public int sumarConRetorno(){
        
        return a+b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a=arg1;
        this.b=arg2;
        
        return sumarConRetorno();
        
    }
}
