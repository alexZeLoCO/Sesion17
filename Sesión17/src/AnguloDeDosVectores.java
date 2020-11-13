import java.util.Scanner;
/**
 * @author UO281827
 *
 */
public class AnguloDeDosVectores {
	
	/**
	 * 
	 * @param teclado 
	 * @param tamaño
	 * @return vector de tamaño dado como parámetro.
	 */
	public static int[] LeeVector (Scanner teclado, int tamaño) {
		int [] vector = new int [tamaño];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	
	/**
	 * 
	 * @param vector 1
	 * @param vector 2
	 * @return producto escalar entre ambos vectores
	 */
	public static int productoEscalar(int[] v1, int[] v2) {
		int suma=0;		//INICIALIZA SUMATORIO
		for (int i=0;i<v1.length;i++) {		//PARA N VECES
			suma = suma + v1[i]*v2[i];		//ACTUALIZAR SUMATORIO
		}
				//OUTPUT
		return suma;
	}
	
	/**
	 * 
	 * @param vector
	 * @return producto escalar de ese vector
	 */
	public static double móduloVector(int[] v) {
		return Math.sqrt(productoEscalar(v,v));		//OUTPUT 
	}
	
	/**
	 * 
	 * @param vector 1
	 * @param vector 2
	 * @return ángulo entre ambos vectores
	 */
	public static double ánguloVectores(int []v1, int []v2) {
		double numerador = productoEscalar(v1,v2);		//LLAMA MÉTODO PRODUCTO ESCALAR
		double denominador = móduloVector(v1)*móduloVector(v2);		//LLAMA MÉTODO MODULO PARA AMBOS VECTORES
		return Math.acos(numerador/denominador);		//OUTPUT
			//MATH.POW	//MATH.COS (COSENO)			//EXPONENTE = -1
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el tamaño del vector.");		//SOLICITA VALOR
		
		int [] v1 = LeeVector (teclado, teclado.nextInt());		//CREA VECTOR 1
		int [] v2 = LeeVector (teclado, v1.length);				//CREA VECTOR 2 (MISMO TAMAÑO QUE EL 1)
		
		System.out.printf("El producto escalar de los vectores es: %d.", productoEscalar(v1,v2));		//OUTPUT
		System.out.printf("El módulo del primer vector es: %f.", móduloVector(v1));						//OUTPUT
		System.out.printf("El módulo del segundo vector es: %f.",móduloVector(v2));						//OUTPUT
		System.out.printf("El ángulo entre ambos vectores es: %f.",ánguloVectores(v1,v2));				//OUTPUT
		
	}

}
