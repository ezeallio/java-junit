package ar.edu.unlam.herencia;

import org.junit.Assert;
import org.junit.Test;

public class TestHerencia {

	@Test
	public void test() {
		Triangulo miTriangulo = new Triangulo("Verde", 6.2, 9.7);
		Assert.assertEquals(miTriangulo.getColor(), "Verde");
	}

}
