import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args){
		int i = 1;
		int anterior = 0;
		int temp;	
		while(i<100)
		{
			System.out.println(i);
			temp = i;
			i = i + anterior;
			anterior = temp;
		}
	}
}

