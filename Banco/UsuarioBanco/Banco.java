import java.util.*;

public class Banco {
	private String nombre;
	private int numClientes;
	protected ArrayList<Cliente> Clientes = new ArrayList<Cliente>();

	// Este constructor solo recibe el nombre del banco
	public Banco(String nombre) {
		this.nombre = nombre;
	}

	// Este constructor recibe el nombre del banco y un arreglo de Clientes
	public Banco(String nombre,Cliente[] grupo) {
		this.nombre = nombre;

		//Se añade cada elemento del arreglo grupo al arraylist clientes del banco
		for(int i = 0;i < grupo.length;i++) {
			Clientes.add(grupo[i]);
		}
	}

	// Por este método se busca un cliente en el banco por el NIP
	public Cliente obtenerCliente(Cliente buscado) {
		/*Se recorre todo el arraylist en busca del cliente, en caso de que no se encuentre se manda un aviso
		y se regresa un usuario en blanco*/
		Cliente vacio = new Cliente("Vacio");

		//Se busca por NIP al cliente
		for(int i = 0;i < this.Clientes.size();i++){
			//Se accede a cada cliente del arraylist y se usa el método obtenerNIP (de la clase Cliente)
			if((this.Clientes.get(i)).obtenerNIP() == buscado.obtenerNIP())
				return this.Clientes.get(i);
		}

		System.out.println("El cliente buscado no existe");
		return vacio;
	}

	// Este método agrega un cliente a un banco
	public void agregarCliente(Cliente agregar) {
		this.Clientes.add(agregar);
	}

	public void imprimirCliente() {
		for(int i = 0;i < this.Clientes.size();i++) {
			System.out.println(this.Clientes.get(i));
		}
	}

	public String toString() {
		String banco = "";
		banco += this.nombre + " ";

		for(int i = 0;i < this.Clientes.size();i++) {
			banco += this.Clientes.get(i);
			banco += " ";
		}

		return banco;
	}
}
