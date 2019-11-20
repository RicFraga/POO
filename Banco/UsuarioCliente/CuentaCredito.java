import java.util.*;

public class CuentaCredito extends Cuenta {
    private double tasa;
    private double deficit;
    private int id_Cr;
    
    // Constructor para una cuenta de crédito
    public CuentaCredito(double saldo3,double tasa, double deficit, Fecha creacion) {
        super(saldo3, creacion);
        this.deficit= deficit;
        this.tasa=tasa;
    }

    @Override
    public void consultar(Fecha actual){
        this.modificaciones += "CONSULTA " + actual + " Saldo = $"+this.saldo+ " Deficit: $"+this.deficit+"\n";
    }

    // Método para depositar a una cuenta de crédito
    @Override
    public void depositar(double monto, Fecha actual) {
    	if(this.deficit < monto) {
    		monto -= this.deficit;
    		this.deficit = 0;
    		this.saldo += monto;
    		this.modificaciones += "DEPOSITO " + actual +" Monto: $" +monto+ " Saldo = $"+this.saldo+" Deficit: $"+this.deficit+"\n";
    	}

    	else {
    		this.deficit -= monto;
    		this.modificaciones += "DEPOSITO " + actual +" Monto: $" +monto+ " Saldo = $"+this.saldo+" Deficit: $"+this.deficit+"\n";
    	}
    }
    
    // Método para retirar de una cuenta de crédito
    @Override
    public void retirar(double monto, Fecha actual) {
    	int a;

        if(monto > this.saldo) {
            monto -= this.saldo;
            this.saldo -= this.saldo;
            this.deficit += monto;
            this.modificaciones += "RETIRO " + actual +" Monto: $" +monto+ " Saldo = $"+this.saldo+" Deficit: $"+this.deficit+"\n";
        }
        
        else
        {
        	this.saldo -= monto;
        	this.modificaciones += "RETIRO " + actual +" Monto: $" +monto+ " Saldo = $"+this.saldo+" Deficit: $"+this.deficit+"\n";
        }

        a = apertura.obtenerMes();

        while(a < actual.obtenerMes()) {
        	this.deficit = this.deficit * (1-this.tasa);
        	a++;
 			this.modificaciones += "RETIRO " + actual +" Monto: $" +monto+ " Saldo = $"+this.saldo+" Deficit: $"+this.deficit+" "+(this.tasa*100)+"% fue aplicado en el mes"+"\n";
        }
    }
}