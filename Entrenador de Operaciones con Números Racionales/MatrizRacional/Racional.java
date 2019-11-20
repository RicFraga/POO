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
			System.out.println("("+num + "/" + den+")");
	}

	public Racional Suma(Racional X, Racional Y) {
		Racional summ = new Racional(1,1);
		if(X.den == Y.den)
		{
			summ.num = X.num + Y.num;
			summ.den = X.den;
		}

		else
		{
			summ.den = X.den * Y.den;
			summ.num = (X.num * Y.den) + (X.den * Y.num); 
		}

		return summ;
	}

	public Racional resta(Racional X, Racional Y) {

		Racional summ = new Racional(1,1);
		if(X.den == Y.den)
		{
			summ.num = X.num - Y.num;
			summ.den = X.den;
		}

		else
		{
			summ.den = X.den * Y.den;
			summ.num = (X.num * Y.den) - (X.den * Y.num); 
		}

		return summ;

	}

	public Racional resta(Racional X) {

		Racional resta = new Racional(1,1);
		if(X.den == this.den)
		{
			resta.num = X.num - this.num;
			resta.den = X.den;
		}

		else
		{
			resta.den = X.den * this.den;
			resta.num = (X.num * this.den) - (X.den * this.num); 
		}

		return resta;

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

	public Racional signoNeg() {

		this.num = (-1)*(this.num);
		this.den = (-1)*(this.den);

		return new Racional(this.num,this.den);
	}

	public Racional div(Racional P, Racional O){

		num= P.num * O.den;
		den= P.den * O.num;

		contador ++;

		return new Racional(this); 
	}

	/*REDEFINICIÓN DE METODOS de Equals para que
	compare el contenido y no el lugar a donde apuntan*/
	public boolean equals(Racional R) {
		if((double)(this.num / this.den) == (double)(R.num / R.den))
			return true;

		else 
			return false;
	}

	// Método que devuelve el valor numérico de un Racional
	public double valor() {

		return (double)this.num / (double)this.den;
	}

	//Método para describir un objeto en caracteres
	public String toString() {
		return ("("+num+"/"+den+")");
	}

	public void impresion(Racional X) {
		System.out.print("("+num+","+den+") ");
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

}
