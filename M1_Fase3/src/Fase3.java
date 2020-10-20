//Crear la clase.

public class Fase3 {
	
	//Crear el m�todo main.

	public static void main(String[] args) {
		
		//Crear las variables. La l�gica de la variable "traspasyears" est� comentada en el programa Fase2.java.
		
		int year = 1948;
		int birth = 1988;
		int interval = 4;
		int traspasyears = (int)((birth - year ) / 4);
		
		//Crear el booleano.
		
		boolean birthtraspas = false;
		
		//Crear los strings con los dos mensajes seg�n el resultado del booleano.
		
		String verdadero = "Mi a�o de nacimiento (" + birth + ") S� fue un a�o bisiesto.";
		String falso = "Mi a�o de nacimiento (" + birth + ") NO fue un a�o bisiesto.";
		
		//Crear el for.
		
		for(int i = year; i <= birth; i+=interval) {
			
			//Crear el if. Si el a�o de nacimiento "birth" coincide con los valores guardados en la variable del for "i", la variable "birthtraspas" ser� TRUE.
			
			if(birth == i) {
				birthtraspas = true;
			}
		}
				
		//Printar por consola el mensaje adecuado.
		
		if(birthtraspas == true) {
			System.out.println(verdadero);
		}
		else {
			System.out.println(falso);
		}
		
	}

}
