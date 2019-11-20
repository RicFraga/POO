import java.util.*;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int d,int m,int a) {
        while(d <= 0 || d > 31) {
        	System.out.println("FORMATO INCORRECTO DE DIA ("+d+") INGRESE UNO VALIDO: ");
        	Scanner in = new Scanner(System.in);
        	d = in.nextInt();
        }

		while(m <= 0 || m > 12) {
        	System.out.println("FORMATO INCORRECTO DE MES ("+m+") INGRESE UNO VALIDO: ");
        	Scanner in = new Scanner(System.in);
        	m = in.nextInt();
        }        

        while(a < 0) {
        	System.out.println("FORMATO INCORRECTO DE ANIO ("+a+") INGRESE UNO VALIDO: ");
        	Scanner in = new Scanner(System.in);
        	a = in.nextInt();
        }

        this.dia = d;
        this.mes = m;
        this.anio = a;        
    }

    public int obtenerDia() {
        return this.dia;
    }

    public int obtenerMes() {
        return this.mes;
    }

    public int obtenerAnio() {
        return this.anio;
    }

    public Fecha obtenerFecha() {
        return this;
    }

    public void establecerFecha(int d, int m, int a) {
        d= dia;
        m= mes;
        a= anio;
    }

    @Override
    public String toString() {
        return (dia+"/"+mes+"/"+anio);
    }
}