package Servicios;

import java.util.Scanner;

public class OperacionImplementacion implements OperacionInterfaz {
	
	public double valor(Scanner ComunicacionValor) 
	{
		
		 double numero;
		System.out.print("Introduzca un número:");
		numero = ComunicacionValor.nextInt();
		return numero;
		
		
	}
	
	public void Suma(Scanner ComunicacionValor)
	{
		double n1 = valor(ComunicacionValor);
		double n2 = valor(ComunicacionValor);
		System.out.println("Resultado: ");
		System.out.println(n1 + n2);
		
	}

	public void Resta(Scanner ComunicacionValor)
	{
		double n1 = valor(ComunicacionValor);
		double n2 = valor(ComunicacionValor);
		System.out.println("Resultado: ");
		System.out.println(n1 - n2);
		
		
	}
	
	public void Multiplicacion(Scanner ComunicacionValor)
	{
		double n1 = valor(ComunicacionValor);
		double n2 = valor(ComunicacionValor);
		System.out.println("Resultado: ");
		System.out.println(n1 * n2);
		
		
	}
	
	public void Division(Scanner ComunicacionValor)
	{
		double n1 = valor(ComunicacionValor);
		double n2 = valor(ComunicacionValor);
		System.out.println("Resultado: ");
		double division = n1 / n2;
		System.out.println(division);
		System.out.println("Modulo de la división: ");
		System.out.println(n1 % n2);
		
		
	}
}
