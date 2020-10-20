//Este ejercicio es pr�cticamente igual al anterior en la parte del loop. Se a�aden unas strings de texto.

//Crear la clase.

public class Fase4 {
	
	//Crear el m�todo main.

	public static void main(String[] args) {
		
		//Crear las variables para el loop. La l�gica de la variable "traspasyears" est� comentada en el programa Fase2.java.
		
		int year = 1948;
		int birth = 1988;
		int interval = 4;
		int traspasyears = (int)((birth - year ) / 4);
		
		//Crear las variables de string de texto.
		
		String nombre = "Lara Saiz Moya";
		String nacimiento = "22/03/" + birth;
		
		//Crear el booleano.
		
		boolean birthtraspas = false;
		
		//Crear los strings con los dos mensajes seg�n el resultado del booleano.
		
		String verdadero = "Mi nombre es " + nombre + ". \nNac� el " + nacimiento + ".\nMi a�o de nacimiento S� fue un a�o bisiesto.";
		String falso = "Mi nombre es " + nombre + ". \nNac� el " + nacimiento + ".\nMi a�o de nacimiento NO fue un a�o bisiesto.";
		
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
