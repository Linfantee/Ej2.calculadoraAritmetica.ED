package Servicios;

import java.util.Scanner;

public interface OperacionInterfaz {
	
	public double valor(Scanner ComunicacionValor);
	
	
	public void Suma(Scanner ComunicacionValor);			

	public void Resta(Scanner ComunicacionValor);			
	
	public void Multiplicacion(Scanner ComunicacionValor);	
	
	public void Division(Scanner ComunicacionValor);		
	
}
