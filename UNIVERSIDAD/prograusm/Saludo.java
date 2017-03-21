import java.util.Scanner;
public class Saludo{
	public static void main(String[] args){
		Scanner escan = new Scanner(System.in);
		System.out.print("cual es tu nombre?  -->");
		String nombre = escan.next();
		System.out.println("hola "+nombre+" bienvenido");
	}
}
