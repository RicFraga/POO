import java.util.*;

public class Cuenta {
	protected double saldo;
	public Fecha apertura;
	public String modificaciones = "";

	// Este constructor crea una cuenta a partir de un saldo
	public Cuenta(double saldo, Fecha fechaApertura) {

		this.apertura = fechaApertura;
		if(saldo >= 0) {
			this.saldo = saldo;
			this.modificaciones += "Se creo la cuenta con un saldo de: $" + this.saldo + " Fecha: " + this.apertura + "\n";
		}
		
		else {
			System.out.println("Error Cuenta(double saldo, Fecha): No es posible asignar un saldo inicial negativo");
		}
	}

	// Este método obtiene el saldo de la cuenta
	public void consultar(Fecha actual) {
        //return this.saldo;
    }

	// Este método hace un depósito a la cuenta
	public void depositar(double monto, Fecha actual) {

		//Se pregunta si el monto es mayor a 0 para continuar
		if(monto > 0) {
			this.saldo += monto;
			this.apertura = actual;
			this.modificaciones += "DEPOSITO " + actual + " saldo = $"+this.saldo+"\n";
		}

		//Si no cumple con la condición, no tiene sentido continuar la operación
		else {
			System.out.println("Error Class Cuenta depositar(): El monto ingresado no es valido");
		}
	}
		
	// Este método retira un monto de una cuenta
	public void retirar(double monto, Fecha actual) {
		
		if(monto <= this.saldo) {
			this.saldo -= monto;
			this.modificaciones += "RETIRO " + actual + " saldo = "+this.saldo+"\n";
		}

		else {
			System.out.println("Error Class Cuenta retirar(): No es posible retirar un monto negativo o retirar mas del dinero que percibes");	
		}	
	}

	public String obtenerModif() {
		return this.modificaciones;
	}

	// Redefinción de toString()
	public String toString() {
		String a = "";
		a += this.saldo;

		return a;
	}
}