import java.util.Scanner; 
import java.text.DecimalFormat;

public class Promedio{
	private double n1,n2,n3,n4,promedio;
    public Promedio(){
		Scanner escan = new Scanner(System.in);
		n1 = escan.nextDouble();
		n2 = escan.nextDouble();
		n3 = escan.nextDouble();
		n4 = escan.nextDouble();
		promedio = ((n1+n2+n3+n4)/4);
		System.out.println("tu promedio es de -> "+promedio);
	} 

	public static void main(String[] args){
		DecimalFormat df =  new DecimalFormat("0.0");	
		System.out.print("ingrese sus notas con una coma ---->  ");
		Promedio notas = new Promedio(); 
	}
}
