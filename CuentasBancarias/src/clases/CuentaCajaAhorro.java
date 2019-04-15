package clases;

public class CuentaCajaAhorro extends Cuenta{
	private Integer cantidadMovimientos;
	
	public CuentaCajaAhorro()
	{
		cantidadMovimientos = 0;
	}
	
	public void depositar(Double monto)
	{
		super.depositar(monto);
	}
	
	public Boolean retirar(Double monto)
	{
		if(cantidadMovimientos < 5)
		{
			cantidadMovimientos++;
			return super.retirar(monto);
		}
		
		if(super.getSaldo() > (monto + 6))
			super.setSaldo(super.getSaldo() - 6);
		
		return super.retirar(monto);
	}
}
