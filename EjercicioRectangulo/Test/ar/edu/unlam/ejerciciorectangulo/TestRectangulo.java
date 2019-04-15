package ar.edu.unlam.ejerciciorectangulo;

import org.junit.Test;

public class TestRectangulo {

	@Test
	public void testQueCalculaElAreaDeUnRectangulo() {
		Rectangulo miRectangulo = new Rectangulo(2, 3);
		Rectangulo miRectangulo2 = new Rectangulo(4, 7);
		System.out.println("El area del rectangulo es: " + miRectangulo.calcularArea());
		System.out.println("El area del rectangulo es: " + miRectangulo2.calcularArea());
	}
	
	@Test
	public void testQueCalculaElPerimetroDeUnRectangulo(){
		Rectangulo miRectangulo = new Rectangulo();
		System.out.print("El perimetro del rectangulo es: " + miRectangulo.calcularPerimetro());
	}

}
 