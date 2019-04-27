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
		radioInterior = entradaEscaner.nextLine();
		Double castRadioInterior = Double.parseDouble(radioInterior);
		radioExterior = entradaEscaner.nextLine();
		Double castRadioExterior = Double.parseDouble(radioExterior);
		//System.out.println (radioInterior);
		
				
		Disco unDisco = new Disco ();
		
		Double perimetroExterior = unDisco.obtenerPerimetroExterior(castRadioExterior); 
		Double perimetroInterior = unDisco.obtenerPerimetroInterior(castRadioInterior);
		Double superficie = unDisco.obtenerSuperficie(castRadioExterior, castRadioInterior);

		
		System.out.println(perimetroInterior);
		System.out.println(perimetroExterior);
		System.out.println(superficie);
		
		
		
		
		
	}

	
}
