import java.util.*;

public class Entrenador {

	public static void main(String[] args) {

		int nume,deno,respuesta,puntaje,iteraciones,dificultad,aleatorio;
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		Racional uno,dos,tres;

		System.out.println("Bienvenido");

		while(true)
		{
			System.out.println("Que operacion deseas realizar?");
			System.out.print("1.- Suma\n2.- Resta\n3.- Multiplicacion\n4.- Division\n");
			respuesta = in.nextInt();
			System.out.println();

			System.out.println("Cuantas operaciones deseas realizar");
			iteraciones = in.nextInt();

			System.out.println("En una escala del 1 al 5, con que dificultad quieres entrenar?");
			dificultad = in.nextInt();

			if(dificultad == 1)
				aleatorio = 3;

			else if(dificultad == 2)
				aleatorio = 5;

			else if(dificultad == 3)
				aleatorio = 7;

			else if(dificultad == 4)
				aleatorio = 9;

			else if(dificultad == 5)
				aleatorio = 10;

			else
			{
				System.out.println("Ya que no ingresaste una opcion valida, se tomara la dificultad media (3)");
				aleatorio = 7;
			}

			puntaje = 0;

			switch(respuesta)
			{
				//SUMA
				case 1:

				for(int i=0;i<iteraciones;i++) {

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					uno = new Racional(nume,deno);

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					dos = new Racional(nume,deno);			

					System.out.println(uno+" + "+dos);

					tres = new Racional(uno.Suma(uno,dos));
					//System.out.println(tres);

					System.out.println("Ingresa el numerador del resultado:");
					nume = in.nextInt();

					System.out.println("Ingresa el denominador del resultado:");
					deno = in.nextInt();

					while(deno == 0)
					{
						System.out.println("La division entre 0 no esta definida, vuelve a ingresar el denominador");
						deno = in.nextInt();
					}

					uno = new Racional(nume,deno);

					if(uno.equals(tres))
					{
						if(nume % 2 == 0 && deno % 2 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 3 == 0 && deno % 3 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 5 == 0 && deno % 5 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");
				
						else
							System.out.print("\nRespuesta Correcta\n");

						puntaje++;
					}

					else
						System.out.print("\nRespuesta incorrecta, no te desanimes!\n");

				}

				if(puntaje >= (int)iteraciones * 0.6)
					System.out.println("Excelente! Estás listo para presentar un examen!");
				
				else
					System.out.print("Obtuviste un puntaje bajo, recuerda que debes multiplicar los " +
					"denominadores para obtener el valor del denominador del resultado y sumar las multiplicaciones\n del numerador de la primera fraccion por el denominador de la segunda y el denominador de la primera fraccion por el numerador de la segunda!\n");

				break;

				// RESTA
				case 2:

				for(int i=0;i<iteraciones;i++) {

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					uno = new Racional(nume,deno);

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					dos = new Racional(nume,deno);			

					System.out.println(uno+" - "+dos);

					tres = new Racional(uno.resta(uno,dos));
					//System.out.println(tres);

					System.out.println("Ingresa el numerador del resultado:");
					nume = in.nextInt();

					System.out.println("Ingresa el denominador del resultado:");
					deno = in.nextInt();

					while(deno == 0)
					{
						System.out.println("La division entre 0 no esta definida, vuelve a ingresar el denominador");
						deno = in.nextInt();
					}

					uno = new Racional(nume,deno);

					if(uno.equals(tres))
					{
						if(nume % 2 == 0 && deno % 2 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 3 == 0 && deno % 3 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 5 == 0 && deno % 5 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");
				
						else
							System.out.print("\nRespuesta Correcta\n");

						puntaje++;
					}

					else
						System.out.println("Respuesta incorrecta, no te desanimes!");

				}

				if(puntaje >= (int)iteraciones * 0.6)
					System.out.println("Excelente! Estás listo para presentar un examen!");
				
				else
					System.out.print("Obtuviste un puntaje bajo, recuerda que debes multiplicar los " +
					"denominadores para obtener el valor del denominador del resultado y restar a la multiplicacion\n del numerador de la primera fraccion por el denominador de la segunda la multiplicacion del denominador de la primera fraccion por el numerador de la segunda!\n");			


				break;

				// MULTIPLICACION
				case 3:

				for(int i=0;i<iteraciones;i++) {

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					uno = new Racional(nume,deno);

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					dos = new Racional(nume,deno);	

					System.out.println(uno+" * "+dos);

					tres = new Racional(uno.mult(dos));
					//System.out.println(tres);

					System.out.println("Ingresa el numerador del resultado:");
					nume = in.nextInt();

					System.out.println("Ingresa el denominador del resultado:");
					deno = in.nextInt();

					while(deno == 0)
					{
						System.out.println("La division entre 0 no esta definida, vuelve a ingresar el denominador");
						deno = in.nextInt();
					}

					uno = new Racional(nume,deno);

					if(uno.equals(tres))
					{
						if(nume % 2 == 0 && deno % 2 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 3 == 0 && deno % 3 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 5 == 0 && deno % 5 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");
				
						else
							System.out.print("\nRespuesta Correcta\n");

						puntaje++;
					}

					else
						System.out.println("Respuesta incorrecta, no te desanimes!");				

				}

				if(puntaje >= (int)iteraciones * 0.6)
					System.out.println("Excelente! Estás listo para presentar un examen!");
				
				else
					System.out.print("Obtuviste un puntaje bajo, recuerda que debes multiplicar el " +
					"numerador de la primera fraccion por el numerador de la segunda fraccion y \n el denominador de la primera fraccion por el de la segunda fraccion\n");			

				break;

				// DIVISION
				case 4:

				for(int i=0;i<iteraciones;i++) {

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					uno = new Racional(nume,deno);

					nume = 1 + ran.nextInt(aleatorio);
					deno = 1 + ran.nextInt(aleatorio);

					dos = new Racional(nume,deno);			

					System.out.println(uno+" / "+dos);

					tres = new Racional(uno.div(uno,dos));
					//System.out.println(tres);

					System.out.println("Ingresa el numerador del resultado:");
					nume = in.nextInt();

					System.out.println("Ingresa el denominador del resultado:");
					deno = in.nextInt();

					while(deno == 0)
					{
						System.out.println("La division entre 0 no esta definida, vuelve a ingresar el denominador");
						deno = in.nextInt();
					}

					uno = new Racional(nume,deno);

					if(uno.equals(tres))
					{
						if(nume % 2 == 0 && deno % 2 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 3 == 0 && deno % 3 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");

						else if(nume % 5 == 0 && deno % 5 ==0)
							System.out.print("\nRespuesta Correcta pero no simplificada en su totalidad\n");
				
						else
							System.out.print("\nRespuesta Correcta\n");

					}

					else
						System.out.println("Respuesta incorrecta, no te desanimes!");

				}

				if(puntaje >= (int)iteraciones * 1)
					System.out.println("Excelente! Estas listo para presentar un examen!");

				else if(puntaje >= (int)iteraciones * 0.6)
					System.out.println("Bien! Estas listo para presentar un examen!");
				
				else
					System.out.print("Obtuviste un puntaje bajo, recuerda que debes multiplicar el " +
					"numerador de la primera fraccion por el denominador de la segunda fraccion (numerador del resultado) y \n el denominador de la primera fraccion por el numerador de la segunda fraccion (denominador del resultado)\n");						

				break;

				default:
				System.out.println("No es una opcion valida, intente de nuevo");
				break;
			}
		
		System.out.println("Obtuviste una califiacion de "+(double)(puntaje*10)/iteraciones);

		System.out.print("Deseas realizar otra operacion?\n1.-Si\n2.-No\n");
		respuesta = in.nextInt();

		if(respuesta == 2)
			break;

		}	


	}
}
