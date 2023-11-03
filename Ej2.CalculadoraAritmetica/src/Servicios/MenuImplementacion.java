package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoH) 
	{
		
		int opcionSeleccionada;
		
		System.out.println(":");
		System.out.println("0. Cerrar caculadora");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("----------------------");
		System.out.println("Elija una opción");
		
		opcionSeleccionada = comunicacionTecladoH.nextInt();
		
		
		return opcionSeleccionada ;
		
		
		
		
		
	}
	

}
