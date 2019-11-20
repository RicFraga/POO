import java.util.*;

public class UsuarioCliente {
	public static void main(String[] args) {

		System.out.println("\n\n -------ENTORNO DE PRUEBAS PARA LAS CLASE CLIENTE------ \n\n");
		ArrayList<Cuenta> Ca = new ArrayList<Cuenta>();

		//FECHAS DE CREACIÓN de las Cuentas: Simularemos fechas específicas para poder observar toda la funcionalidad de las clases 
		Fecha F1 = new Fecha(-2,13,2017);
		Fecha F2 = new Fecha(13,10,2018);
		Fecha F3 = new Fecha(21,8,2017);
		Fecha F4 = new Fecha(26,5,2019);
		Fecha F5 = new Fecha(18,7,2017);
		Fecha F6 = new Fecha(14,1,2018);
		Fecha F7 = new Fecha(25,2,2018);
		Fecha F8 = new Fecha(12,12,2019);
		Fecha F9 = new Fecha(9,6,2016);
		Fecha F10 = new Fecha(2,11,2017);
		Fecha F11 = new Fecha(20,3,2017);
		Fecha F12 = new Fecha(31,4,2018);
		
		//TRES INSTANCIAS DE CLIENTE
		Cliente C1 = new Cliente("Samuel Miranda","324646");
		Cliente C2 = new Cliente("Ricardo Fraga", "190199", Ca);
		Cliente C3 = new Cliente("Rodrigo Vera", "201515");

		//CUENTAS PARA CLIENTE 1
		Cuenta CC1 = new CuentaAhorros(10000,0.10,F1);
		Cuenta CC2 = new CuentaAhorros(5000,0.15, F2);
		Cuenta CC3 = new CuentaCheques(2500,5000, F3);

		C1.agregarCuenta(CC1);
		C1.agregarCuenta(CC2);
		C1.agregarCuenta(CC3);
		
		//CUENTAS PARA CLIENTE 2
		Cuenta CC4 = new CuentaCredito(5000,0.12,200,F4);
		Cuenta CC5 = new CuentaCredito(10000,0.12,0,F5);
		Cuenta CC6 = new CuentaAhorros(25000,0.6,F6);

		C2.agregarCuenta(CC4);
		C2.agregarCuenta(CC5);
		C2.agregarCuenta(CC6);

		//CUENTAS PARA CLIENTE 3
		Cuenta CC7 = new CuentaCheques(6000,2000,F7);
		Cuenta CC8 = new CuentaCheques(5000,1000,F8);
		Cuenta CC9 = new CuentaCredito(4000,0.5,500,F9);

		C3.agregarCuenta(CC7);
		C3.agregarCuenta(CC8);
		C3.agregarCuenta(CC9);

		//OPERACIONES CON EL CLIENTE 1
		CC1.depositar(5000,F1);
		CC1.consultar(F2);
		CC1.retirar(1000,F2);

		//OPERACIONES CON EL CLIENTE 2
		CC4.retirar(6000,F3);
		CC5.depositar(1200,F5);
		CC6.depositar(800,F3);
		CC4.retirar(12000,F1);
		CC4.consultar(F3);

		//OPERACIONES CON EL CLIENTE 3
		CC7.retirar(3000,F1);
		CC8.depositar(12000,F3);
		CC9.depositar(20000,F1);
		CC9.consultar(F4);

		//ESTADO DE CUENTA DEL CLIENTE 1
		C1.reportarEdosCtas();

		//ESTADO DE CUENTA DEL CLIENTE 2
		C2.reportarEdosCtas();

		//ESTADO DE CUENTA DEL CLIENTE 3
		C3.reportarEdosCtas();
	}
}