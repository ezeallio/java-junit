package ar.edu.unlam.adivinanza;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdivinanza {

	@Test
	public void esIgual() {
		Adivinanza miAdivinanza = new Adivinanza();
		assertEquals(false, miAdivinanza.esIgual(12));
	}
	
	@Test
	public void esMayor() {
		Adivinanza miAdivinanza = new Adivinanza();
		assertTrue(miAdivinanza.esMayorOMenor(9));
	}
	
	@Test
	public void esMenor() {
		Adivinanza miAdivinanza = new Adivinanza();
		assertFalse(miAdivinanza.esMayorOMenor(29));
	}
	
	@Test
	public void metodoToString() {
		Adivinanza miAdivinanza = new Adivinanza();
		System.out.println(miAdivinanza);
	}

}
