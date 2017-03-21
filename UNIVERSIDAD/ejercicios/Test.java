public class Test{
	int year;
	public Test(int age){
		year = age;	
	}
	public void accionconstructor(){
		System.out.println("constructor");
	}
	public static void main(String[] args){
		Test objeto = new Test(10);	
		System.out.println(objeto.year);
		accion();
		objeto.accionconstructor();
	}
	public static void accion(){
		System.out.println("hola");
	}
} 
