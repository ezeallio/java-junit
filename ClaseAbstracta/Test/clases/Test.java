package clases;

import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void testcalcularAreaRectangulo() {
		Rectangulo miRectangulo = new Rectangulo(4.5, 7.2);
		Assert.assertEquals((Double)32.4, miRectangulo.calcularArea(), 0.01);
	}
	
	@org.junit.Test
	public void testcalcularAreaCirculo() {
		Circulo miCirculo = new Circulo(4.5);
		Assert.assertEquals((Double)63.61, miCirculo.calcularArea(), 0.01);
	}
	
	@org.junit.Test
	public void testcalcularPerimetroRectangulo() {
		Rectangulo miRectangulo = new Rectangulo(4.5, 7.2);
		Assert.assertEquals((Double)23.4, miRectangulo.calcularPerimetro(), 0.01);
	}
	
	@org.junit.Test
	public void testcalcularPerimetroCirculo() {
		Circulo miCirculo = new Circulo(4.5);
		Assert.assertEquals((Double)28.27, miCirculo.calcularPerimetro(), 0.01);
	}
	
	@org.junit.Test
	public void testpolimorfismo() {
		Figuras miFigura = new CuadradoImpl(10.2);
		Assert.assertEquals((Double)104.04, miFigura.calcularArea(), 0.01);
		//CirculoP miCirculo = new CirculoP(4.5);
		miFigura = new CirculoP(4.5);
		Assert.assertEquals((Double)63.61, miFigura.calcularArea(), 0.01);
	}

}
