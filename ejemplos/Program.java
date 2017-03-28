import java.util.Scanner;

public class Program {

	private String name;
	private int age;
	private String creator;

	public Program(String nameValue,int ageValue){
		creator = "danny";
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
		String[] userData = new String[2];
		userData = userInfo(); // --> {name,age}
	}
	public static String[] userInfo(){

		//pide nombre y edad --> muestra y guarda en arreglo

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese nombre de usuario y edad...");
		String name = sc.next();
		int age = sc.nextInt();
		Program objeto = new Program(name,age);
		System.out.println("datos.....");
		System.out.println("creador --> "+objeto.creator);
		System.out.println("usuario --> "+objeto.getName());
		System.out.println("edad --> "+objeto.getAge());
		String ageString = String.valueOf(age);
		String[] data = new String[]{name,ageString};
		return data;
	}
}
