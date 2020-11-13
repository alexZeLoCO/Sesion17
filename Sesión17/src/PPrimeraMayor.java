import java.util.Scanner;
public class PPrimeraMayor {
	/**
	 * 
	 * @param teclado
	 * @param tamaño
	 * @return vector formado con el tamaño pasado como @param y los valores dados por el usuario.
	 */
	public static int[] LeeVector (Scanner teclado, int tamaño) {
		int [] vector = new int [tamaño];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int tamaño = teclado.nextInt();		//CREA VECTOR
		int [] vector = LeeVector(teclado,tamaño);		//LLAMA MÉTODO LEEVECTOR(TECLADO,TAMAÑO)
		
		int i=0;		//CREA VARIABLE CENTINELA I
		do {
			i++;		//ACTUALIZA I
		} while (i<vector.length-1 && vector[i]<vector[i+1]);		//CONDICIONES
		
		if (i==vector.length-1) {		//SI CONDICIÓN
			System.out.print("No hay ningún elemento mayor que el siguiente.");		//OUTPUT
		} else {		//SI NO
			System.out.printf("El primer componente mayor al siguiente es: %d %d.",vector[i-1],vector[i]);		//OUTPUT
		}

	}

}
