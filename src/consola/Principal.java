package consola;

import java.util.Scanner;

import logica.*;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Fecha f = new Fecha(17,4,2008);
		Alumno a = new Alumno("Gomez","Segundo",100,f);
		
		System.out.println(a.toString());

	}

}
