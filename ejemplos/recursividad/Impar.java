import java.util.Scanner;
public class Impar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("imprimir los numeros impares del cero hasta el -> ");
		int num = sc.nextInt();
		if(num<0){
			System.out.println("tienes que ingresar un numero mayor a cero.");
		}else if(num==0){
			System.out.println("no existe numero par entre cero y cero");
		}else{
			for(int i=0;i<=num;i++)
			{
				if((i%2)!=0){
					System.out.println(i);
				}
			}
		}
	}
}
