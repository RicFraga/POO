import java.util.*;

public class CuentaCheques extends Cuenta{

	protected double sobregiro;
	protected int id_Ch;

	// Constructor de una Cuenta de Cheques
	public CuentaCheques(double saldo2, double sobregiro, Fecha creacion) {
		// Se llama al constructor de la clase madre
		super(saldo2, creacion);
		this.sobregiro = sobregiro;
	}

	@Override
	public void consultar(Fecha actual){
		this.modificaciones += "CONSULTA " + actual + " saldo = $"+this.saldo+ " Sobregiro: $"+this.sobregiro+"\n";
	}

	// Método para depositar un monto en una cuenta de cheques
	@Override
	public void depositar(double monto, Fecha actual) {

		// Se verifica que se deposite una cantidad correcta
		if(monto>0){

			// Si el monto es menos a la cantidad que se debe al banco, entonces sólo se le descuenta al sobregiro (deuda)
			if(monto <= this.sobregiro){
				this.sobregiro -= monto;
			}
			// Si el monto es mayor al sobregiro, entonces se cubrirá y el restante se agregará al saldo
			else{
				monto -= this.sobregiro;
				this.sobregiro -= this.sobregiro;
				this.saldo += monto;
			}

			this.modificaciones += "DEPOSITO " + actual + " Monto: $" +monto+ " Saldo = $"+this.saldo+"\n";
		}

		else {
			System.out.println("Error Class CuentaCheques depositar(): El monto a depositar no puede ser menor o igual a 0");
		}
	}

	// Método para retirar un monto en una cuenta de cheques
	@Override
	public void retirar(double monto, Fecha actual) {

		if(monto<=this.saldo) {
			this.saldo -= monto;
			this.modificaciones += "RETIRO " + actual + " Monto: $" +monto+ " Saldo = $"+this.saldo+"\n";
		}

		else if(this.saldo + this.sobregiro >= monto) {
			monto -= this.saldo;
			this.saldo -= this.saldo;
			this.sobregiro -= monto;
			this.modificaciones += "RETIRO " + actual + " Saldo = $"+this.saldo+" sobregiro = $"+this.sobregiro+"\n";	
		}

		else {
			System.out.println("Error Class CuentaCheques retirar(): No es posible realizar la operacion, no cuenta con los recursos suficientes");
		}
	}
}