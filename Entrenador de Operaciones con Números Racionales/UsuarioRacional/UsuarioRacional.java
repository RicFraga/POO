import java.util.*;

public class UsuarioRacional {

	public static void main(String[] args) {

		Racional A,B;

		A = new Racional(1,2);
		B = new Racional(4,8);
		Racional C = new Racional(B);

		A.imprimir();
		B.imprimir();
		C.imprimir();

		System.out.println("----------");
		/*A = A * B;	En c se puede realizar esta operación porque *
						está sobrecargado */

		//A.mult(B);
		//A.imprimir();

		//A.mult(B.mult(C));
		//A.imprimir();

		/*Así F apunta a A (F es una variable de referencia)
		Racional F = A.mult(B,C);*/

		/*Así F ya no es una variable de referencia
		Racional F = new Racional(A.mult(B,c)); */

		/*Equals(Object): boolean [definción de Object]
		Revisa que dos objetos estén apuntando al mismo lugar */

		//A=B;	//Esto hace que ambas variables apunten al mismo lugar

		boolean b = A.equals(B);
		//System.out.println("Valor de b: "+b); 

		//Imprime el tipo de objeto y la dirección de memoria en hexadecimal
		//System.out.println("Valor de A: "+A);

		//to String quiere dar una representación de caracteres de un objeto
		Racional[] grupo = new Racional[10];
		Racional[] grupo_dos = new Racional[10];

		Random ran = new Random();
		int j,k;

		for(int i=0;i<grupo.length;i++)
		{
			j = 1 + ran.nextInt(10);
			k = 1 + ran.nextInt(10);
			grupo[i] = new Racional(j,k);
			grupo_dos[i] = new Racional(j,k);
		}

		//for(int i=0;i<grupo.length;i++)
			//System.out.println("1.- "+grupo[i]);
		
		ArrayList <Racional> grupo2 = new ArrayList<Racional>();
		ArrayList <Racional> grupo3 = new ArrayList<Racional>();
		
		grupo2.add(A);
		grupo2.add(new Racional(1,2));
		grupo2.add(new Racional(9));

		grupo3.add(A);
		grupo3.add(new Racional(1,2));
		grupo3.add(new Racional(9));

		System.out.println("Comparacion de ArrayList: "+Racional.Compara(grupo2,grupo3));
		System.out.println("Comparacion de Arreglos: "+Racional.Compara(grupo,grupo_dos));
		System.out.println("Mayor del ArrayList1: "+Racional.Mayor(grupo2));

		//Array List se puede imprimir así
		//System.out.println(grupo2);

		int tam = Racional.TotalRacionales();
		System.out.println("Numero de instancias: "+tam);

	}
}

