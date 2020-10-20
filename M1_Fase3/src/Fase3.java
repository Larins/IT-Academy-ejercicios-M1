//Crear la clase.

public class Fase3 {
	
	//Crear el método main.

	public static void main(String[] args) {
		
		//Crear las variables. La lógica de la variable "traspasyears" está comentada en el programa Fase2.java.
		
		int year = 1948;
		int birth = 1988;
		int interval = 4;
		int traspasyears = (int)((birth - year ) / 4);
		
		//Crear el booleano.
		
		boolean birthtraspas = false;
		
		//Crear los strings con los dos mensajes según el resultado del booleano.
		
		String verdadero = "Mi año de nacimiento (" + birth + ") SÍ fue un año bisiesto.";
		String falso = "Mi año de nacimiento (" + birth + ") NO fue un año bisiesto.";
		
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
