package clases;

import org.junit.Assert;


public class Test {

	@org.junit.Test
	public void testCuentaSueldo() {
		CuentaSueldo micuenta = new CuentaSueldo();
		micuenta.depositar(4000.);
		Assert.assertTrue(micuenta.retirar(3500.));
		Assert.assertFalse(micuenta.retirar(6000.));
		//Double saldo = micuenta.getSaldo();
	}
	
	@org.junit.Test
	public void testCuentaAhorro()
	{
		CuentaCajaAhorro micuenta = new CuentaCajaAhorro();
		micuenta.depositar(4000.);
		
		for(int i = 0; i <= 5; i++)
			micuenta.retirar(100.);
		
		Assert.assertFalse(micuenta.retirar(6000.));
		//Double saldo = micuenta.getSaldo();
	}
	
	@org.junit.Test
	public void testCuentaCorriente()
	{
		CuentaCorriente micuenta = new CuentaCorriente(200.);
		micuenta.depositar(4000.);
		
		Assert.assertFalse(micuenta.retirar(6000.));
		Assert.assertTrue(micuenta.retirar(400.));
		//Double saldo = micuenta.getSaldo();
	}

}
