public class Nombre_proyecto {
	public static void main(String[] args){
		//VARIABLES
		int numeroEntero = 10;
		double numeroDecimal = 10.5;
		char caracterSolo = 'a'; // importantes las comillas simples
		String cadenaTexto = "soyTexto"; //se declara con comillas dobles

		//se pueden declarar mas de una variable con solo un tipo, por ejemplo
		int numero1,numero2,numero3; //se pueden declarar todas las variables que desees que sean de este tipo
		numero1 = 1;
		numero2 = 2;
		numero3 = 3;

		double decimal1,decimal2,decimal3;
		decimal1 = 1.0;
		decimal2 = 2.0;
		decimal3 = 3.0;

		char letraa,letrab,letrac;
		letraa = 'a';
		letrab = 'b';
		letrac = 'c';



		//CODIGO PRINCIPAL

		/*se puede cambiar el valor de las variables a medida que se avanza en el codigo
		sin necesidad de colocar su tipo ya que solo se instancian una sola vez*/
		numeroEntero = 20;
		numeroDecimal = 20.5;

		//se pueden crear y ejecutar acciones
		accion();
		//se pueden imprimir variables
		System.out.println(cadenaTexto);
		//se pueden concatenar valores con el simbolo de suma
		System.out.println(cadenaTexto+"otroTexto"+numeroEntero);
	}
	public static void accion(){
		//para imprimir algo en terminal
		System.out.println("hola a todos");
	}
}