import java.util.*;

public class Cliente {
	private String nombre;
	private ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();
	private int numeroCuentas;
	private String NIP;

	// Este constructor hace un cliente apartir de un nombre
	public Cliente(String nombre)
	{
		this.nombre = nombre;
		this.NIP = "";
		Random ran = new Random();

		//Generación del NIP del cliente
		for(int i = 0;i < 4;i++)
		{
			NIP += ran.nextInt(10);
		}
	}

	// Este método añade una cuenta a un cliente
	public void agregarCuenta(Cuenta a) {
		this.Cuentas.add(a);
	}

	// Este método consulta una cuenta apartir de un índice
	public Cuenta consultarCuenta(int indice) {
		return this.Cuentas.get(indice);
	}
	
	// Este método obtiene el NIP de un cliente
	public String obtenerNIP() {
		return this.NIP;
	}

	// Este método imprime toda la información acerca de un cliente
	public void obtenerInfo() {
		//Acuérdate que esto es CONCATENACION DE CADENAS
		System.out.print(this.nombre + " " + this.NIP + " \n");
		System.out.println(" ------------------------------------------------ ");

		//Se añade a la cadena info las cuentas que tiene el cliente
		for(int i = 0;i < this.Cuentas.size();i++) {
			System.out.println(this.Cuentas.get(i));
			System.out.println(this.Cuentas.get(i).obtenerModif());
			System.out.println(" ------------------------------------------------ ");
		}

		System.out.println("Termino de reporte de informacion de "+this.nombre);
		System.out.println(" ------------------------------------------------ ");
		System.out.println(" ------------------------------------------------ ");
			
	}

	// Este método obtiene el número de cuentas con las que cuenta un cliente
	public int obtenerNumCtas() {
		return this.Cuentas.size();
	}

	// Redefinición de toString()
	public String toString(){
		return this.nombre+" "+this.NIP;
	}
}

