import java.util.Scanner;

public class Unidades{
	public static void main(String[] args){
		Scanner escan = new Scanner(System.in);
		System.out.print("quiere convertir centimetros (cm) o pulgadas (in)? ---> ");
		String unidad = escan.next();
		if (unidad.equals("cm")){
			System.out.print("ingrese los centimetros  --> ");
			double cm = escan.nextDouble();
			double cin = (cm/2.54);
			System.out.println("son "+cin+" pulgadas");
				
		}else if (unidad.equals("in")){
			System.out.print("ingrese las pulgadas  --> ");
			double in = escan.nextDouble();
			double pcm = (in*2.54);                                                                                                                                   
            System.out.println("son "+pcm+" centimetros");
		}else{
			System.out.println("no ingresaste lo solicitado!");
		}
	}
}
