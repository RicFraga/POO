import java.util.*;

public class CuentaAhorros extends Cuenta implements Impuestos{

	protected double tasa;
	protected int id_A;
	private static Fecha anterior;

	// Constructor de una Cuenta de Ahorros
	public CuentaAhorros(double saldo1, double tasa, Fecha creacion) {
		// Se llama al constructor de la clase madre
		super(saldo1, creacion);
		this.anterior = creacion;
		this.tasa = tasa;
	}

	/* Este método consulta la fecha de creación de la cuenta, si ha transcurrido
	un mes, se agrega el interés al saldo */ 
	@Override
	public void consultar(Fecha actual) {
		if(anterior.obtenerMes() < actual.obtenerMes()) {
			pagarISRmensual(actual);	
		}
		
		if(anterior.obtenerAnio() < actual.obtenerAnio() + 1) {
			pagarISRanual(actual);
		}

		anterior = actual;

		if(actual.obtenerMes() +1 > anterior.obtenerMes()){
			this.saldo += this.saldo * (this.tasa);
			this.modificaciones += "CONSULTA " + actual + " saldo = $"+this.saldo+" (El saldo aumento "+this.tasa+"%)\n";
		}
	}


	public void depositar(double monto, Fecha actual) {
		this.saldo += monto;
		this.modificaciones += "DEPOSITO " + actual + " Monto: $" +monto+ " Saldo = $"+this.saldo+"\n";	
	}

	public void retirar(double monto, Fecha actual) {
		if(this.saldo >= monto) {
			this.saldo -= monto;
			this.modificaciones += "RETIRO " + actual + " Monto: $" +monto+ " Saldo = $"+this.saldo+"\n";	
		}	

		else
			System.out.println("/n ERROR://public void retirar(double monto, Fecha actual) SALDO INSUFICIENTE");
	}
	
    @Override
    public void pagarISRmensual(Fecha actual) {
        if(this.saldo > 10000) {
        	this.saldo = this.saldo * (0.9);
        	this.modificaciones += "CONSULTA " + actual + " Saldo = $"+this.saldo+" (El saldo disminuyo 10% por pago de ISR mensual)"+"\n";
        }
    }

    @Override
    public void pagarISRanual(Fecha actual) {
     	if(this.saldo > 50000) {
       		this.saldo = this.saldo * (0.85);
       		this.modificaciones += "CONSULTA " + actual + " Saldo = $"+this.saldo+" (El saldo disminuyo 15% por pago de ISR anual)"+"\n";
        }   
    }
}