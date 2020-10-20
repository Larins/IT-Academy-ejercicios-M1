//Este ejercicio es prácticamente igual al anterior en la parte del loop. Se añaden unas strings de texto.

//Crear la clase.

public class Fase4 {
	
	//Crear el método main.

	public static void main(String[] args) {
		
		//Crear las variables para el loop. La lógica de la variable "traspasyears" está comentada en el programa Fase2.java.
		
		int year = 1948;
		int birth = 1988;
		int interval = 4;
		int traspasyears = (int)((birth - year ) / 4);
		
		//Crear las variables de string de texto.
		
		String nombre = "Lara Saiz Moya";
		String nacimiento = "22/03/" + birth;
		
		//Crear el booleano.
		
		boolean birthtraspas = false;
		
		//Crear los strings con los dos mensajes según el resultado del booleano.
		
		String verdadero = "Mi nombre es " + nombre + ". \nNací el " + nacimiento + ".\nMi año de nacimiento SÍ fue un año bisiesto.";
		String falso = "Mi nombre es " + nombre + ". \nNací el " + nacimiento + ".\nMi año de nacimiento NO fue un año bisiesto.";
		
		//Crear el for.
		
		for(int i = year; i <= birth; i+=interval) {
			
			//Crear el if. Si el año de nacimiento "birth" coincide con los valores guardados en la variable del for "i", la variable "birthtraspas" será TRUE.
			
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
