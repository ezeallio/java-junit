package clases;

import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void revisarRutaGets() {
		Ruta miRuta = new Ruta(20, 6);
		Assert.assertEquals((Integer)7, miRuta.getPlato());
		Assert.assertEquals((Integer)5, miRuta.getPinion());
		Assert.assertEquals((Integer)40, miRuta.getVelocidad());
		Assert.assertEquals((Integer)20, miRuta.getPlatoMaximo());
		Assert.assertEquals((Integer)6, miRuta.getPinionMaximo());
	}

}
