import java.util.Scanner;import java.text.DecimalFormat;

public class Notas{
	public static void main(String[] args){
		//VARIABLES
		String nombre, total;
		double[] notas = new double[3];
		//OBJETOS
		DecimalFormat df =  new DecimalFormat("0.0");
		//CODIGO PRINCIPAL
		System.out.print("primero necesito saber tu nombre...  -> ");
		nombre = nombre();
		System.out.println("hola "+nombre+" bienvenido!");
		System.out.println("si necesitas que calcule tu promedio, debes darme tus tres notas...");
		notas = notas();
		System.out.println("tus notas son: "+notas[0]+" - "+notas[1]+" - "+notas[2]);
		total = df.format((notas[0]+notas[1]+notas[2])/3);
		System.out.println("tu promedio es de: "+ total);
	}
	public static String nombre(){
		String nombre;
		Scanner escan = new Scanner(System.in);
		nombre = escan.next();
		return nombre;
	}
	public static double[] notas(){
		Scanner escan = new Scanner(System.in);
		System.out.println("ingresa tus notas separandolas con una coma");
		double[] notas = {escan.nextDouble(),escan.nextDouble(),escan.nextDouble()};
		return notas;
	}
}
