package domain;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegustro;
    private static int idContador;
    private boolean vip;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);
        
        this.idCliente = Cliente.idContador;
        Cliente.idContador=Cliente.idContador+1;
        
        this.vip = vip;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegustro() {
        return fechaRegustro;
    }

    public void setFechaRegustro(Date fechaRegustro) {
        this.fechaRegustro = fechaRegustro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegustro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }





    
    


    
    
    
    
    
    
    
    
    
    
    
    
    
}
