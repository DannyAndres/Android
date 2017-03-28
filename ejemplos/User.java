import java.util.Scanner;

public class User {

	private String name;
	private int age;

	public User(String nameValue,int ageValue){
		name = nameValue;
		age = ageValue;
	}
	
	public String getName(){
		return name;
		//aqui las variables del constructor se usan como this.var
	}

	public int getAge(){
		return age;
	}

	public static void main(String[] args){
		String name;
		int age;	

		Scanner sc = new Scanner(System.in);
		System.out.println("bienvenido! necesito unos datos antes de comenzar.");	
		System.out.print("Cual es tu nombre? -> ");
		name = sc.next();
		System.out.print("Que edad tienes? -> ");
		age = sc.nextInt();
		User objeto = new User(name,age);
		System.out.println("hola "+objeto.getName()+", gracias por unirte!");
	}
}
