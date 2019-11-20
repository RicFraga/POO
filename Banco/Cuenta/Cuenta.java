public class Cuenta {
	
	private double saldo;

	public Cuenta(double saldoInicial) {
		saldo = saldoInicial;
	}

	double consultar() {
		return saldo;
	}

	void depositar(double monto) {
		saldo = saldo + monto;
	}

	void retirar(double monto) {
		if(saldo >= monto) {
			saldo = saldo - monto;
		}

		else
		{
			System.out.println("Saldo insuficiente");
		}
	}

	

}
