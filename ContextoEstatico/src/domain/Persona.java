package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas; //al ser estatica es una variable unica para la variable

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incremantar el ocntador por cada objeto nuevo
        Persona.contadorPersonas++; //los atributos estaticos necesitan tener ante puesto el nombre de la clase
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;

    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
