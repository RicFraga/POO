import java.util.*;

public class Cuenta {
	protected double saldo;
	protected Banco pertenece;
	private String modificaciones = "";

	// Este constructor crea una cuenta a partir de un saldo
	public Cuenta(double saldo) {
		java.util.Date utilDate = new java.util.Date(); //fecha actual
	  	long lnMilisegundos = utilDate.getTime();

		if(saldo >= 0)
			this.saldo = saldo;

		else {
			System.out.println("Operación Incorrecta // public Cuenta(double saldo) // No es posible asignar un saldo inicial negativo");
		}

		this.modificaciones += "Se creo la cuenta: " + utilDate + "\n";
	}

	// Redefinción de toString()
	public String toString() {
		String a = "";
		a += this.saldo;

		return a;
	}

	// Este método hace un depósito a la cuenta
	public void depositar(double monto) {
		java.util.Date utilDate = new java.util.Date(); //fecha actual
	  	long lnMilisegundos = utilDate.getTime();

		//Se pregunta si el monto es mayor a 0 para continuar
		if(monto > 0) {
			this.saldo = this.saldo + monto;
		}

		//Si no cumple con la condición, no tiene sentido continuar la operación
		else {
			System.out.println("Operación Incorrecta // public void depositar(double monto) // Probablemente quieras utilizar 'retirar'");
		}

		this.modificaciones += "Se deposito a la cuenta: " + monto + ":" + utilDate + "\n";
	}

	// Este método retira un monto de una cuenta
	public void retirar(double monto) {
		java.util.Date utilDate = new java.util.Date(); //fecha actual
	  	long lnMilisegundos = utilDate.getTime();

		if(monto > 0) {
			this.saldo = this.saldo - monto;
		}

		else {
				System.out.println("Operación Incorrecta // public void retirar(double monto) // No es posible retirar un monto negativo");	
		}

		this.modificaciones += "Se retiro de la cuenta: " + monto + ":" + utilDate + "\n";
	}

	public String obtenerModif() {
		return this.modificaciones;
	}
}
