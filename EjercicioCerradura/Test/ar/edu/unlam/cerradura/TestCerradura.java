package ar.edu.unlam.cerradura;

import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {
	
	@Test
	public void crearCerradura()
	{
		Cerradura miCerradura = new Cerradura(6325, 2);
		Assert.assertTrue(miCerradura.estaCerrada());
		Assert.assertEquals((Integer)6325, miCerradura.getClaveDeApertura());
	}

	@Test
	public void abrirPuertaCerrada()
	{
		Cerradura miCerradura = new Cerradura(5463, 2);
		Assert.assertTrue(miCerradura.abrir(5463));
	}
	
	@Test
	public void noAbrirPuertaConClaveIncorrecta()
	{
		Cerradura miCerradura = new	Cerradura(4321, 3);
		Assert.assertFalse(miCerradura.abrir(1234));
	}
	
	@Test
	public void noAbrirPuertaConContraseñaCorrectaPorBloqueo()
	{
		Cerradura miCerradura = new Cerradura(1234, 3);
		
		for(int i = 0; i < 3; i++)
			miCerradura.abrir(5272);
		
		Assert.assertFalse(miCerradura.abrir(1234));
		Assert.assertTrue(miCerradura.fueBloqueada());
	}	
}
