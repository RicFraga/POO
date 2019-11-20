package Clases;

public class Tiempo extends Thread {
    private boolean salir;
    private int cont;
    
    public Tiempo() {
        this.salir = false;
        this.cont = 0;
    }
    
    public void run() {
        while(!salir) {
            try {
                sleep(1000);
                cont++;
                Vistas.Juego.jLabel6.setText(Integer.toString(cont));
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }               
    }
}
