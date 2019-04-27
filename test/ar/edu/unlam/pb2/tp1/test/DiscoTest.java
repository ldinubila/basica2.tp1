package ar.edu.unlam.pb2.tp1.test;

import ar.edu.unlam.pb2.tp1.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {

	@Test
	public void test () {
		
		String radioInterior;
		String radioExterior;
		
		Scanner entradaEscaner = new Scanner (System.in);
		System.out.println("Ingrese Radio Interior:");
		radioInterior = entradaEscaner.nextLine();
		Double castRadioInterior = Double.parseDouble(radioInterior);
		System.out.println("Ingrese Radio Exterior:");
		radioExterior = entradaEscaner.nextLine();
		Double castRadioExterior = Double.parseDouble(radioExterior);
		
		
				
		Disco unDisco = new Disco ();
		
		Double perimetroExterior = unDisco.obtenerPerimetroExterior(castRadioExterior); 
		Double perimetroInterior = unDisco.obtenerPerimetroInterior(castRadioInterior);
		Double superficie = unDisco.obtenerSuperficie(castRadioExterior, castRadioInterior);

		
		System.out.println("El perimetro interior del disco es: " + perimetroInterior);
		System.out.println("El perimetro exterior del disco es: " + perimetroExterior);
		System.out.println("La superficie del disco es: %.2f" + superficie);
		
		
		
		
		
	}

	
}
