package Clases;
public class Jugador {
    private String Nombre;
    private int elegido;
    private int elegidorival;
    
    public Jugador(String Nombre) {
        this.Nombre = Nombre;
    }        
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public void setPersonaje(int a) {
        this.elegido = a;
    }
    
    public int getPersonaje() {
        return this.elegido;
    }
    
    public void setPersonajeRival(int a) {
        this.elegidorival = a;
    }
    
    public int getPersonajeRival() {
        return this.elegidorival;
    }           
}