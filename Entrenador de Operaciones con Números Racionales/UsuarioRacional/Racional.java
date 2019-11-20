// Sobrecarga de Métodos: Mismo nombre y retorno de métodos pero con diferente declaración
import java.util.*;
public class Racional {

	private int num;
	private int den;
	private static int contador=0;

	public Racional(int num, int den) {
		if(den==0)
			den = 1;

		this.num = num;
		this.den = den;
		contador++;
	}

	public Racional(Racional X) {
		num = X.num;
		den = X.den;
		contador++;
	}

	public Racional(int a) {
		if(a==0)
			a = 1;

		num = a;
		den = a;
		contador++;
	}

	public void imprimir() {
		if(num == den)
			System.out.println("1");
		
		else
			System.out.println(num + "/" + den);
	}

	public Racional mult(Racional R) {
		num = num * R.num;
		den = den * R.den;

		contador++;

		return this;
	}

	public Racional mult(Racional X, Racional Y) {
		num = X.num * Y.num;
		den = X.den * Y.den;

		contador++;

		return new Racional(this);
	}

	/*REDEFINICIÓN DE METODOS de Equals para que
	compare el contenido y no el lugar a donde apuntan*/
	public boolean equals(Racional R) {
		if(this.num % R.num == 0 && this.den % R.den == 0)
			return true;

		else if(R.num % this.num == 0 && R.den % this.den == 0)
			return true;

		else
			return false;
	}

	//Método para describir un objeto en caracteres
	public String toString() {
		return ("Racional: num = "+num+" " +"den = "+den);
	}

	public static int TotalRacionales() {
		return contador;
	}

	public static boolean Compara(ArrayList <Racional> uno, ArrayList <Racional> dos) {

		if(uno.size() != dos.size())
			return false;

		for(int i=0;i<uno.size();i++)
		{
			if(!(uno.get(i).equals(dos.get(i))))
				return false;			
		}

		return true;
	}

	public static boolean Compara(Racional[] a, Racional[] b) {

		if(a.length != b.length)
			return false;

		for(int i=0;i<a.length;i++)
		{
			if(!(a[i].equals(b[i])))
				return false;
		}

		return true;	
	}

	public static Racional Mayor(ArrayList <Racional> X) {
		
		Racional mayor = new Racional(0,1);

		for(int i=0;i<X.size()-1;i++)
		{
			if((double)mayor.num / (double)mayor.den < (double)X.get(i).num / (double)X.get(i).den)
			{
				mayor = X.get(i);
			}
		}

		return mayor;
	}

	public static Racional Mayor(Racional[] arr) {

		

	}
}
