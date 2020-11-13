import java.util.Scanner;		//IMPORTA SCANNER
public class ProductoEscalar {

	public static int[] LeeVector (Scanner teclado, int tamaño) {
		
		int [] vector = new int [tamaño];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el tamaño del vector: ");		//SOLICITA DATO
		int tamaño = teclado.nextInt();		//ALMACENA EN TAMAÑO
		int [] vectorx = LeeVector(teclado,tamaño);		//LLAMA MÉTODO
		int [] vectory = LeeVector(teclado,tamaño);		//LLAMA MÉTODO
		System.out.print("Introduzca la n del sumatorio: ");		//SOLICITA DATO

		int suma=0;		//INICIALIZA SUMATORIO
		for (int i=0;i<vectorx.length;i++) {		//PARA N VECES
			suma = suma + vectorx[i]*vectory[i];		//ACTUALIZAR SUMATORIO
		}
				//OUTPUT
		System.out.printf("El resultado del sumatorio es: %d.", suma);
		if (suma==0) {		//SI SUMATORIO ES 0
			System.out.print("El producto escalar es 0, los vectores son ortogonales.");		//OUTPUT
		}	
	}
}