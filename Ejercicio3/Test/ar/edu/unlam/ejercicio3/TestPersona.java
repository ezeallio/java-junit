package ar.edu.unlam.ejercicio3;

import org.junit.Assert;
import org.junit.Test;

public class TestPersona {

	@Test
	public void comprobarPesoIdeal() {
		Persona persona = new Persona("pepe", "H", 23, 75.0, 1.67);
		Integer resultado = persona.calcularIMC(), ideal = 0;
		Assert.assertEquals(ideal, resultado);
	}
	
	@Test
	public void comprobarSobrepeso() {
		Persona persona = new Persona("pepe", "H", 23, 75.0, 1.67);
		Integer resultado = persona.calcularIMC(), sobrepeso = 1;
		Assert.assertEquals(sobrepeso, resultado);
	}
	
	@Test
	public void comprobarPesoDebajoIdeal() {
		Persona persona = new Persona("pepe", "H", 23, 75.0, 1.67);
		Integer resultado = persona.calcularIMC(), pesoDebajoIdeal = -1;
		Assert.assertEquals(pesoDebajoIdeal, resultado);
	}
	
	@Test
	public void comprobarMayorDeEdad() {
		Persona persona = new Persona("pepe", "H", 23, 70., 1.60);
		Assert.assertTrue(persona.esMayorDeEdad());
	}

}
