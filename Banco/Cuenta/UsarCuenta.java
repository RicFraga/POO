public class UsarCuenta {
	public static void main(String[] args) {

	Cuenta cta1 = new Cuenta(100.0);
	
	Cuenta cta2 = new Cuenta(235.60);	

	cta1.depositar(30.5);

	cta2.depositar(65.83);

	System.out.println("Saldo cta1 = "+cta1.consultar());
	System.out.println("Saldo cta2 = "+cta2.consultar());

	cta1.retirar(500);
	cta2.retirar(500);

	System.out.println("Saldo cta1 = "+cta1.consultar());
	System.out.println("Saldo cta2 = "+cta2.consultar());	

	}
}
