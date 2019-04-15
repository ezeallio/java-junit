package ar.edu.unlam.ejerciciosubasta;

import org.junit.Assert;
import org.junit.Test;

public class TestSubasta {

	@Test
	public void nuevaOferta()
	{
		Subasta subasta = new Subasta(1000.);
		subasta.ofertar(3500.);
		Assert.assertEquals(3500., subasta.getOferta(), 0.01);
	}
	
	@Test
	public void cerrarSubasta()
	{
		Subasta subasta = new Subasta(3200.);
		subasta.ofertar(200.);
		subasta.cerrarSubasta();
		subasta.ofertar(5000.);
		Assert.assertEquals(3200., subasta.getOferta(), 0.01);
	}

}
