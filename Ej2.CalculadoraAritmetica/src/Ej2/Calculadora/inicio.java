package Ej2.Calculadora;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperacionImplementacion;
import Servicios.OperacionInterfaz;

public class inicio
{
	public static void main(String[] args) 
	{
		
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		MenuInterfaz aka =new MenuImplementacion();
		OperacionInterfaz op = new OperacionImplementacion();
		
		while(!cerrarMenu) 
		{
			seleccionUsuario = aka.mostrarMenuYSeleccion(comunicacionTeclado);
			
			
			switch(seleccionUsuario) 
			{
			case 0:
				System.out.print("Se ejecuta caso 0");
				cerrarMenu = true;
				break;
			case 1:
				System.out.print("Procediendo a Suma: ");
				op.Suma(comunicacionTeclado);
				break;
			case 2:
				System.out.print("Procediendo a Resta: ");
				op.Resta(comunicacionTeclado);
				break;
			case 3:
				System.out.print("Procediendo a Multiplicación: ");
				op.Multiplicacion(comunicacionTeclado);
				break;
			case 4:
				System.out.print("Procediendo a División: ");
				op.Division(comunicacionTeclado);
				
				break;
			       default:
					System.out.print("Se ejecuta caso default");
					break;
					
			}
			
		}
		
	}

}
