import java.util.*;

public class CuentaAhorros extends Cuenta{
	protected double tasa;
	protected int id;

	// Constructor de una Cuenta de Ahorros
	public CuentaAhorros(double saldo, double tasa) {
		// Se llama al constructor de la clase madre
		super(saldo);
		this.tasa = tasa;
	}

	/* Este método consulta la fecha de creación de la cuenta, si ha transcurrido
	un mes, se agrega el interes al saldo */ 
	public void Consultar() {
		

	}
}