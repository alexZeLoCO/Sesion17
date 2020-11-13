import java.util.Scanner;
/**
 * @author UO281827
 *
 */
public class AnguloDeDosVectores {
	
	/**
	 * 
	 * @param teclado 
	 * @param tama�o
	 * @return vector de tama�o dado como par�metro.
	 */
	public static int[] LeeVector (Scanner teclado, int tama�o) {
		int [] vector = new int [tama�o];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA �NIDCE NAPOLE�N VECES
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
	public static double m�duloVector(int[] v) {
		return Math.sqrt(productoEscalar(v,v));		//OUTPUT 
	}
	
	/**
	 * 
	 * @param vector 1
	 * @param vector 2
	 * @return �ngulo entre ambos vectores
	 */
	public static double �nguloVectores(int []v1, int []v2) {
		double numerador = productoEscalar(v1,v2);		//LLAMA M�TODO PRODUCTO ESCALAR
		double denominador = m�duloVector(v1)*m�duloVector(v2);		//LLAMA M�TODO MODULO PARA AMBOS VECTORES
		return Math.acos(numerador/denominador);		//OUTPUT
			//MATH.POW	//MATH.COS (COSENO)			//EXPONENTE = -1
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca el tama�o del vector.");		//SOLICITA VALOR
		
		int [] v1 = LeeVector (teclado, teclado.nextInt());		//CREA VECTOR 1
		int [] v2 = LeeVector (teclado, v1.length);				//CREA VECTOR 2 (MISMO TAMA�O QUE EL 1)
		
		System.out.printf("El producto escalar de los vectores es: %d.", productoEscalar(v1,v2));		//OUTPUT
		System.out.printf("El m�dulo del primer vector es: %f.", m�duloVector(v1));						//OUTPUT
		System.out.printf("El m�dulo del segundo vector es: %f.",m�duloVector(v2));						//OUTPUT
		System.out.printf("El �ngulo entre ambos vectores es: %f.",�nguloVectores(v1,v2));				//OUTPUT
		
	}

}
