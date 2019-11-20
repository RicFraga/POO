import java.util.*;

public class UsuarioBanco {
	public static void main(String[] args) {

		Cliente a = new Cliente("Alan");
		Cliente b = new Cliente("Rodrigo");
		Cliente c = new Cliente("Luis");
		Cliente d = new Cliente("Indra");
		Cliente e = new Cliente("Emma");
		Cliente f = new Cliente("Samuel el Marica");
		Cliente g = new Cliente("Ricardo el Espartano");
		Cliente h = new Cliente("Alejandro");

		Banco uno = new Banco("Banamexxx");
		Banco dos = new Banco("BaAancKoo0mEer");

		Cuenta a1 = new Cuenta(256.90);
		Cuenta a2 = new Cuenta(0.40);
		Cuenta b1 = new Cuenta(21234.102);
		Cuenta b2 = new Cuenta(10);
		Cuenta c1 = new Cuenta(1234.231);
		Cuenta c2 = new Cuenta(10090.12);
		Cuenta d1 = new Cuenta(190373.29482);
		Cuenta d2 = new Cuenta(1737.37283);
		Cuenta e1 = new Cuenta(74283.0874);
		Cuenta e2 = new Cuenta(626372.8374);
		Cuenta f1 = new Cuenta(1664.9273);
		Cuenta f2 = new Cuenta(6362.7364);
		Cuenta g1 = new Cuenta(63472.782);
		Cuenta g2 = new Cuenta(8291.923);
		Cuenta h1 = new Cuenta(1028.21);
		Cuenta h2 = new Cuenta(1938.183);

		a.agregarCuenta(a1);
		a.agregarCuenta(a2);
		b.agregarCuenta(b1);
		b.agregarCuenta(b2);
		c.agregarCuenta(c1);
		c.agregarCuenta(c2);
		d.agregarCuenta(d1);
		d.agregarCuenta(d2);
		e.agregarCuenta(e1);
		e.agregarCuenta(e2);
		f.agregarCuenta(f1);
		f.agregarCuenta(f2);
		g.agregarCuenta(g1);
		g.agregarCuenta(g2);
		h.agregarCuenta(h1);
		h.agregarCuenta(h2);

		a1.retirar(500);
		a2.depositar(10000);
		b1.retirar(500);
		b2.depositar(10000);
		c1.retirar(500);
		c2.depositar(10000);
		d1.retirar(500);
		d2.depositar(10000);
		e1.retirar(500);
		e2.depositar(10000);
		f1.retirar(500);
		f2.depositar(10000);
		g1.retirar(500);
		g2.depositar(10000);
		h1.retirar(500);
		h2.depositar(10000);

		a.obtenerInfo();
		b.obtenerInfo();
		c.obtenerInfo();
		d.obtenerInfo();
		e.obtenerInfo();
		f.obtenerInfo();
		g.obtenerInfo();
		h.obtenerInfo();

		CuentaAhorros cab = new CuentaAhorros(320.1,212.12);

	}
}
