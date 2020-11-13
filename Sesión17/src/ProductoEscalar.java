import java.util.Scanner;		//IMPORTA SCANNER
public class ProductoEscalar {

	public static int[] LeeVector (Scanner teclado, int tama�o) {
		
		int [] vector = new int [tama�o];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA �NIDCE NAPOLE�N VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el tama�o del vector: ");		//SOLICITA DATO
		int tama�o = teclado.nextInt();		//ALMACENA EN TAMA�O
		int [] vectorx = LeeVector(teclado,tama�o);		//LLAMA M�TODO
		int [] vectory = LeeVector(teclado,tama�o);		//LLAMA M�TODO
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