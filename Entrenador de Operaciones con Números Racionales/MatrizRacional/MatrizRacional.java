public class MatrizRacional {
	
	public static void main(String [] args) {

		Matriz m1 = new Matriz("M1",2,2,"R+8");

		m1.imprimir("diagonal");
		System.out.println();
		m1.imprimir("ternas");
		m1 = m1.inversa();
		m1.imprimir("diagonal");
	}
}
