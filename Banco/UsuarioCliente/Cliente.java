import java.util.*;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Cliente {
	private String nombre;
	private ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();
	private int numeroCuentas;
	private String NoCuenta;
	public int CtaAh = 1;
	public int CtaCh = 1;
	public int CtaCr = 1;

	// Este constructor hace un cliente apartir de un nombre
	public Cliente(String nombre, String NoCuenta) {
		this.nombre = nombre;
		this.NoCuenta = NoCuenta;
	}

	// Este constructor crea un cliente con un arreglo de cuentas
	public Cliente(String nombre, String NoCuenta, ArrayList<Cuenta> cuentas) {
        this.nombre=nombre;
      	this.NoCuenta = NoCuenta;
    }

    // Este método añade una cuenta a un cliente
	public void agregarCuenta(Cuenta a) {
		this.Cuentas.add(a);
	}

	// Este método consulta una cuenta apartir de un índice
	public Cuenta consultarCuenta(int indice) {
		return this.Cuentas.get(indice);
	}

	// Este método imprime toda la información acerca de un cliente
	public void reportarEdosCtas() {
		//Acuérdate que esto es CONCATENACION DE CADENAS
		System.out.println(this.nombre);
		System.out.println("Numero de Cuenta:"+this.NoCuenta);
		System.out.println(" ------------------------------------------------ ");

		//Se añade a la cadena info las cuentas que tiene el cliente
		for(int i = 0;i < this.Cuentas.size();i++) {
			System.out.println("Cuenta"+(i+1));

			if(this.Cuentas.get(i) instanceof CuentaAhorros) {
				System.out.println("Cuenta de Ahorros "+this.CtaAh);
				this.CtaAh++;
			}

			else if(this.Cuentas.get(i) instanceof CuentaCheques) {
				System.out.println("Cuenta de Cheques "+this.CtaCh);
				this.CtaCh++;
			}

			else if(this.Cuentas.get(i) instanceof CuentaCredito) {
				System.out.println("Cuenta de Credito "+this.CtaCr);
				this.CtaCr++;
			}

			System.out.println("Saldo actual: $"+this.Cuentas.get(i));
			System.out.print(this.Cuentas.get(i).obtenerModif());


			System.out.println(" ------------------------------------------------ ");
		}

		System.out.println("Termino el Estado de Cuenta de "+this.nombre);
		System.out.println(" ------------------------------------------------- ");
		System.out.println(" ------------------------------------------------- \n");
			
	}

	// Este método obtiene el número de cuentas con las que cuenta un cliente
	public int obtenerNumCtas() {
		return this.Cuentas.size();
	}

	// Redefinición de toString()
	public String toString() {
		return this.nombre+ " \nNumero de cuentas: " +this.obtenerNumCtas(); 
	}
}