import java.util.Scanner;
public class Circulos{
    public static void main(String[] args){
   		System.out.print("ingrese el radio del circulo ----> ");
		Scanner escan = new Scanner(System.in);
		double radio = escan.nextDouble();
		double area = (Math.PI*(Math.pow(radio,2)));
		double perimetro = (2*Math.PI*radio);
		System.out.println("el area es "+area+" centimetros cuadrados"); 
		System.out.println("el perimetro es "+perimetro+" centimetros");
	}
}

