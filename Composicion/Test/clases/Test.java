package clases;

import org.junit.Assert;


public class Test {

	@org.junit.Test
	public void testTambor() {
		Tambor miTambor = new Tambor();
		miTambor.girar();
		Assert.assertTrue(miTambor.mostrar() >= 1 && miTambor.mostrar() <= 9);
	}
	
	@org.junit.Test
	public void testTragamonedas(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		
		for(int i = 1; i <= 100; i++)
		{
			miTragamonedas.jugar();
			System.out.print(miTragamonedas.verJugada() + miTragamonedas.obtenerPremio() + "\n");			
		}
	}

}
