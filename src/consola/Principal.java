package consola;

import logica.*;

public class Principal {

	public static void main(String[] args) {

		Fecha f = new Fecha(17,4,2008);
		Alumno a = new Alumno("Gomez","Segundo",100,f);
		
		System.out.println(a.toString());

	}

}
