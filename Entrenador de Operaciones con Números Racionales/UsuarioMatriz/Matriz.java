import java.util.*;

public class Matriz {

	private String nombre;
	private int filas;
	private int columnas;
	static int [][]matriz;


	public Matriz (String name,int fc) {
		this.nombre = name;
		matriz = new int[fc][fc];

		for(int i = 0 ; i < fc ; i++)
		{
			for(int j = 0 ; j < fc ; j++)
				matriz[i][j] = 1;	
		}
	}

	public Matriz(String nombre,int filas, int columnas) {
		this.nombre = nombre;
		this.filas = filas;
		this.columnas = columnas;
		matriz = new int[filas][columnas];

		for(int i = 0 ; i < filas ; i++)
		{
			for(int j = 0 ; j < columnas ; j++)
				matriz[filas][columnas] = 1;
		}
	}

	public Matriz(String nombre, int filas, int columnas, String llenar) {
		this.nombre = nombre;
		this.filas = filas;
		this.columnas = columnas;
		Random ran = new Random();
		matriz = new int[filas][columnas];
		
		for(int i = 0 ; i < filas ; i++)
		{
			for(int j = 0 ; j < columnas ; j++)
				matriz[filas][columnas] = ran.nextInt(10);
		}

	}
		
	/*public Matriz sumar(Matriz x) {
		

	}*/

	public void toString(Matriz X) {

		for(int i=0;i<this.columnas;i++)
		{
			for(int j=0;j<this.filas;j++)
				System.out.print(matriz[i][j]);

			System.out.print("\n");
		}
	}




}
