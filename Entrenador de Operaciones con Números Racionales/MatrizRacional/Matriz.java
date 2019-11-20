import java.util.*;

public class Matriz {

	private String nombre;
	private int filas;
	private int columnas;
	private Racional [][]matriz;
	private Racional [][]trans;

	public Matriz (String nombre,int fc) {
		this.nombre = nombre;
		this.matriz = new Racional[fc][fc];

		for(int i = 0 ; i < fc ; i++)
		{
			for(int j = 0 ; j < fc ; j++)
				this.matriz[i][j] = new Racional(1);
		}
	}

	public Matriz(String nombre, Matriz A) {
		this.nombre = nombre;
		this.filas = A.filas;
		this.columnas = A.columnas;
		this.matriz = new Racional[this.filas][this.columnas];

		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
				this.matriz[i][j] = new Racional(A.matriz[i][j]);
		}
	}

	public Matriz(String nombre,int filas, int columnas) {
		this.nombre = nombre;
		this.filas = filas;
		this.columnas = columnas;
		this.matriz = new Racional[filas][columnas];

		for(int i = 0 ; i < filas ; i++)
		{
			for(int j = 0 ; j < columnas ; j++)
				this.matriz[i][j] = new Racional(1);
		}
	}

	public Matriz(String nombre, int filas, int columnas, String llenar) {
		this.nombre = nombre;
		this.filas = filas;
		this.columnas = columnas;
		Random ran = new Random();
		Random ran2 = new Random();
		String numero = "";
		int num=0,numera,denomi,signo;
		char rango;

		// Se crea la matriz de f filas por c columnas
		this.matriz = new Racional[this.filas][this.columnas];
		
		// Se obtiene el caracter que determinará el signo de los números de la matriz
		rango = llenar.charAt(1);

		/* Se extrae el valor del número hasta el cual se generarán los números aleatorios
		que llenarán la matriz */
		for(int i=2;i<llenar.length();i++)
			numero+=llenar.charAt(i);

		// Se transforma ese número a entero
		num = Integer.parseInt(numero);

		// Se llena la matriz con los valores
		for(int i = 0 ; i < filas ; i++)
		{
			for(int j = 0 ; j < columnas ; j++)
			{
				// Si rango es +, se generán números positivos
				if(rango == '+')
				{
					numera = 1 + ran.nextInt(num);
					denomi = 1 + ran.nextInt(num);
					this.matriz[i][j] = new Racional(numera,denomi);
				}

				// Si rango es -, se generán números negativos
				else if(rango == '-')
				{
					// Se genera un número aleatorio para saber que número será el negativo del Racional
					signo = ran2.nextInt(2);
					if(rango == 0)
					{
						numera = 1 + ran.nextInt(num);
						denomi = -(1 + ran.nextInt(num));
					}

					else
					{
						numera = -(1 + ran.nextInt(num));
						denomi = 1 + ran.nextInt(num);
					}
					
					this.matriz[i][j] = new Racional(numera,denomi);	
				}

				// Si rango es *, se generán números positivos y negativos
				else if(rango == '*')
				{
					// Se genera un aleatorio entre 0 y 1 para determinar el signo del numerador
					signo = ran2.nextInt(2);
					if(signo == 0)
						numera = 1 + ran.nextInt(num);

					else
						numera = -(1 + ran.nextInt(num));

					// Se genera un aleatorio entre 0 y 1 para determinar el signo del demominador
					signo = ran2.nextInt(2);
					if(signo == 0)
						denomi = 1 + ran.nextInt(num);

					else
						denomi = -(1 + ran.nextInt(num));					

					this.matriz[i][j] = new Racional(numera,denomi);		
				}

			}
		}

	}
	
	public void transpuesta() {

		// Se crea la matriz transpuesta
		this.trans = new Racional[this.columnas][this.filas];

		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
				this.trans[j][i] = this.matriz[i][j];
		}

		for(int i=0;i<this.columnas;i++)
		{
			for(int j=0;j<this.filas;j++)
				System.out.print(this.trans[i][j]+" ");

			System.out.print("\n");
		}

	}

	public Matriz sumar(Matriz A) {

		if(this.filas != A.filas || this.columnas != A.columnas)
		{
			System.out.println("No es posible realizar la operacion de suma, las matrices tienen diferentes dimensiones");
			Matriz suma = new Matriz("S"+this.nombre,1,1);
			return suma;
		}

		else 
		{
			Matriz suma = new Matriz("S"+this.nombre,this.filas,this.columnas);
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					suma.matriz[i][j] = this.matriz[i][j].Suma(this.matriz[i][j],A.matriz[i][j]);
			}

			return suma;
		}

	}

	public Matriz sumar(Matriz A, Matriz B) {

		if(this.filas != A.filas || this.filas != B.filas || this.columnas!= A.columnas || this.columnas!= B.columnas)
		{
			System.out.println("No es posible realizar la operacion de suma, las matrices tienen diferentes dimensiones");
			Matriz suma = new Matriz("S"+this.nombre,1,1);
			return suma;
		}

		else
		{
			Matriz suma = new Matriz("S"+this.nombre,this.filas,this.columnas);
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					suma.matriz[i][j] = A.matriz[i][j].Suma(A.matriz[i][j],B.matriz[i][j]);
			}

			return suma;
		}
	}

	public Matriz restar(Matriz A) {

		if(this.filas != A.filas || this.columnas != A.columnas)
		{
			System.out.println("No es posible realizar la operacion de resta, las matrices tienen diferentes dimensiones");
			Matriz resta = new Matriz("S"+this.nombre,1,1);
			return resta;
		}

		else 
		{
			Matriz resta = new Matriz("S1",this.filas,this.columnas);
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					resta.matriz[i][j] = this.matriz[i][j].resta(this.matriz[i][j],A.matriz[i][j]);
			}

			return resta;
		}
	}

	public Matriz restar(Matriz A, Matriz B) {

		if(this.filas != A.filas || this.filas != B.filas || this.columnas!= A.columnas || this.columnas!= B.columnas)
		{
			System.out.println("No es posible realizar la operacion de resta, las matrices tienen diferentes dimensiones");
			Matriz resta = new Matriz("S"+this.nombre,1,1);
			return resta;
		}

		else
		{
			Matriz resta = new Matriz("S"+this.nombre,this.filas,this.columnas);
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					resta.matriz[i][j] = A.matriz[i][j].resta(A.matriz[i][j],B.matriz[i][j]);
			}

			return resta;
		}
	}

	public void calculos() {

		Racional max = new Racional(this.matriz[0][0]);
		Racional min = new Racional(this.matriz[0][0]);
		double promedio=0;

		// Valor máximo
		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
			{
				if(max.valor() < this.matriz[i][j].valor())
					max = this.matriz[i][j];
			}	
		}

		// Valor mínimo
		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
			{
				if(min.valor() > this.matriz[i][j].valor())
					min = this.matriz[i][j];
			}	
		}

		// Promedio
		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
				promedio += this.matriz[i][j].valor();
		}

		// Moda
		Racional componentes[] = new Racional[this.filas * this.columnas];
		int repeticiones=0,repeticion_max=0;
		Racional moda = new Racional(1);

		int m=0;
		for(int i=0;i<this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
			{
				componentes[m] = new Racional(this.matriz[i][j]);
				m++;
			}
		}

		for(int i=0;i<this.filas * this.columnas;i++)
		{
			repeticiones = 0;
			for(int j=0;j<this.filas * this.columnas;j++)
			{
				if(componentes[i].valor() == componentes[j].valor())
					repeticiones++;
			}

			if(repeticiones >= repeticion_max)
			{
				moda = new Racional(componentes[i]);
				repeticion_max = repeticiones;
			}
		}

		System.out.println("Valor Maximo de " + this.nombre +" : " + max);
		System.out.println("Valor Minimo de " + this.nombre +" : " + min);
		System.out.println("Promedio de " + this.nombre + " : " + promedio/(this.filas * this.columnas));
		System.out.println("Recuerda que m/m == n/n == l/l");
		System.out.println("La Moda de "+this.nombre+" : "+moda);
	}

	public void espiral() {
		
		int direccion=0,x=0,y=0,impresos=0;
		Racional esp [] = new Racional[this.filas * this.columnas];

		while(impresos < this.filas * this.columnas)
		{
			if(direccion == 0)
			{
				for(int j=x;j<this.columnas - y;j++)
				{
					//System.out.print(this.matriz[x][j]+" ");
					esp[impresos] = this.matriz[x][j];
					impresos++;
				}

					direccion++;
			}

			else if(direccion == 1)
			{
				for(int i = x+1;i<this.columnas - x;i++)
				{
					//System.out.print(this.matriz[i][this.filas - 1 - y]+" ");
					esp[impresos] = this.matriz[i][this.filas-1-y];
					impresos++;
				}

				direccion++;
			}

			else if(direccion == 2)
			{
				for(int k = this.filas-2-y;k >= y;k--)
				{
					//System.out.print(this.matriz[this.columnas -1-x][k]+" ");
					esp[impresos] = this.matriz[this.columnas-1-x][k];
					impresos++;
				}

				direccion++;
			}

			else if(direccion == 3)
			{
				for(int l = this.columnas -2-x;l>=x+1;l--)
				{
					//System.out.print(this.matriz[l][y]+" ");
					esp[impresos] = this.matriz[1][y];
					impresos++;
				}

				direccion=0;
				x++;
				y++;
			}			
		}

		for(int i = this.filas * this.columnas - 1;i >= 0;i--)
			System.out.print(esp[i]+" ");

		System.out.println();
	}

	public void imprimir(String formato) {

		if(formato == "diagonal")
		{	
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					System.out.print(this.matriz[i][j]+" ");

				System.out.print("\n");
			}
		}

		else if(formato == "binomio")
		{
			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
					this.matriz[i][j].impresion(this.matriz[i][j]);

				System.out.print("\n");
			}
				
		}

		else if(formato == "ternas")
		{
			int primer_t;
			double segundo_t;
			String tercer_t;

			for(int i=0;i<this.filas;i++)
			{
				for(int j=0;j<this.columnas;j++)
				{
					primer_t = (int)this.matriz[i][j].valor();
					segundo_t = (double)this.matriz[i][j].valor() - (double)primer_t;

					tercer_t = String.valueOf(segundo_t);
					System.out.print("("+primer_t+",["+tercer_t.charAt(0)+"][");

					for(int k = 1;k<tercer_t.length();k++)
					{
						System.out.print(tercer_t.charAt(k)+",");
					}

					System.out.print("]");
					System.out.println(")");
				}
			}

			System.out.println();
		}
	}

	public Matriz inversa() {
		Racional determinante = new Racional(1);
		Matriz inversa = new Matriz("MI"+this.nombre,2,2);

		if(this.columnas != 2 || this.filas != 2)
		{
			System.out.println("La inversa solamente esta implementada para matrices 2x2");
			return inversa;
		}

		determinante = (this.matriz[0][0].mult(this.matriz[1][1])).resta(this.matriz[0][1].mult(this.matriz[1][0]));
		determinante = determinante.div(new Racional(1),determinante);

		for(int i=this.filas-1;i>=0;i--)
		{
			for(int j=this.columnas-1;j>=0;j--)
			{				
				inversa.matriz[i][j] = new Racional(determinante.mult(determinante,this.matriz[i][j]));

				if(i != j)
					inversa.matriz[i][j].signoNeg();
			}
		}

		return inversa;
	}

	public boolean equals(Matriz A) {

		boolean valor=true,retorno;

		for(int i=0;i< this.filas;i++)
		{
			for(int j=0;j<this.columnas;j++)
			{
				if(this.matriz[i][j].equals(A.matriz[i][j]))
					valor = true;

				else
					valor = false;
			}
		}

		return valor;
	}

}
