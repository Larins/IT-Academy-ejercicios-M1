//Crear la clase.

public class Fase2 {

	//Crear el método main.

	public static void main(String[] args) {
		
			//Crear la constante y las variables. Es importante cómo definimos la variable "traspasyears". 
		
		//En primer lugar, restamos "birth" menos "YEAR", y lo dividimos entre 4, para saber cuántos años bisiestos ha habido en el intervalo. 
		
		//En segundo lugar, usamos (int) para asegurarnos que este valor es un entero. 
		
		//Por ejemplo, hay 10 años de traspaso entre 1948 y 1988, y no habrá 11 años de traspaso hasta que no lleguemos a 1992. 
		
		//Se puede comprobar así: si cambiamos el valor de "birth" a 1989, 1990 o 1991, el programa seguirá indicando 10 años bisiestos. Cuando lleguemos a 1992, mostrará 11 años bisiestos.
			
			int YEAR = 1948;
			int birth = 1988;
			int interval = 4;
			int traspasyears = (int)((birth - YEAR ) / 4);
			
			//Printar por consola el mensaje concatenado con las variables.

			System.out.println("Ha habido " + traspasyears + " años bisiestos entre el año " + YEAR + " y mi año de nacimiento (" + birth + ").");
	
	} 

}
