package ar.edu.unlam.pb2.tp1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.tp1.Disco;

public class DiscoTest {

	@Test
	public void testQueCompruebeElPerimetroInterior() {

		Double radioInterior = 2.0;
		Double radioExterior = 4.0;

		Disco miDisco = new Disco(radioInterior, radioExterior);
		miDisco.obtenerPerimetroInterior(radioInterior);
		Double esperado = 2 * radioInterior * Math.PI;
		Double obtenido = miDisco.getPerimetroInterior();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testQueCompruebeElPerimetroExterior() {

		Double radioInterior = 2.0;
		Double radioExterior = 4.0;

		Disco miDisco = new Disco(radioInterior, radioExterior);
		miDisco.obtenerPerimetroExterior(radioExterior);
		Double esperado = 2 * radioExterior * Math.PI;
		Double obtenido = miDisco.getPerimetroExterior();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testQueCompruebeLaSuperficie() {
		Double radioInterior = 2.0;
		Double radioExterior = 4.0;

		Disco miDisco = new Disco(radioInterior, radioExterior);
		miDisco.obtenerSuperficie(radioExterior, radioInterior);
		Double esperado = (radioExterior * radioExterior * Math.PI) - (radioInterior * radioInterior * Math.PI);
		Double obtenido = miDisco.getSuperficie();

		assertEquals(esperado, obtenido);

	}

}
