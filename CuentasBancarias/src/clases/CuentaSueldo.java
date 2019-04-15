package clases;

public class CuentaSueldo extends Cuenta{

	public CuentaSueldo()
	{
		
	}
	
	public void depositar(Double monto)
	{
		super.depositar(monto);
	}
	
	public Boolean retirar(Double monto)
	{
		return super.retirar(monto);
	}
}
