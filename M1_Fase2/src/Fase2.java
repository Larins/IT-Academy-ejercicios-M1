//Crear la clase.

public class Fase2 {

	//Crear el m�todo main.

	public static void main(String[] args) {
		
			//Crear la constante y las variables. Es importante c�mo definimos la variable "traspasyears". 
		
		//En primer lugar, restamos "birth" menos "YEAR", y lo dividimos entre 4, para saber cu�ntos a�os bisiestos ha habido en el intervalo. 
		
		//En segundo lugar, usamos (int) para asegurarnos que este valor es un entero. 
		
		//Por ejemplo, hay 10 a�os de traspaso entre 1948 y 1988, y no habr� 11 a�os de traspaso hasta que no lleguemos a 1992. 
		
		//Se puede comprobar as�: si cambiamos el valor de "birth" a 1989, 1990 o 1991, el programa seguir� indicando 10 a�os bisiestos. Cuando lleguemos a 1992, mostrar� 11 a�os bisiestos.
			
			int YEAR = 1948;
			int birth = 1988;
			int interval = 4;
			int traspasyears = (int)((birth - YEAR ) / 4);
			
			//Printar por consola el mensaje concatenado con las variables.

			System.out.println("Ha habido " + traspasyears + " a�os bisiestos entre el a�o " + YEAR + " y mi a�o de nacimiento (" + birth + ").");
	
	} 

}
