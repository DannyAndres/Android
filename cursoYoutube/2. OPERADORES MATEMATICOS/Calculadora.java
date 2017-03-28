/*para poder reconocer valores que me entregue el usuario es necesario importar
el siguiente modulo que nos permite hacer preguntas al usuario*/

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args){
		//VARIABLES
		int x,y;
		int array[] = preguntar();

		//CODIGO PRINCIPAL
		x = array[0];
		y = array[1];

		System.out.println("el resultado de la suma -> "+(x+y));
		System.out.println("el resultado de la resta -> "+(x-y));
		System.out.println("el resultado de la division -> "+(x/y));
		System.out.println("el resultado del resto -> "+(x%y));
		System.out.println("el resultado de la multiplicacion -> "+(x*y));
		//tambien se pueden calcular los resultados aparte como variables y luego +resultado


	}
	public static int[] preguntar(){
		/*si le colocas void a un metodo este retornara un valor void conocido como funcion
		si le colocas int, solo retornara un entero*/
		//VARIABLES
		int array[] = new int[2]; //declaro un array que contenga enteros y que su largo sea de dos datos

		/*instanciamos el objeto de scanner para poder utilizarlo,
		basicamente el modulo completo lo convertimos en un codigo nuestro para
		que el programa pueda usarlo*/
		Scanner scanner = new Scanner(System.in);


		//cualquier numero ENTERO que se ingrese en esta parte del codigo quedara guardado en entrada
		//numero entero -> nextInt
		System.out.println("ingresa el primer numero entero -> ");
		array[0] = scanner.nextInt();

		System.out.println("ingresa el segundo numero entero -> ");
		array[1] = scanner.nextInt();

		return array;
	}
}
