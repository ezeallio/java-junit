package clases;

public class CuentaCorriente extends Cuenta{
	private Double descubierto, deuda = 0.;
	
	public CuentaCorriente(Double descubierto)
	{
		this.descubierto = descubierto;
	}
	
	public void depositar(Double monto)
	{
		super.depositar(monto - deuda);
		
		if(monto > deuda)
			deuda = 0.;
	}
	
	public Boolean retirar(Double monto)
	{
		if((monto - super.getSaldo()) < descubierto)
		{
			if(monto - super.getSaldo() > 0)
			{
				deuda = (monto - super.getSaldo())  + ((monto - super.getSaldo()) * 0.05);
				super.setSaldo(0.);
				return true;
			}
			
			super.setSaldo(super.getSaldo() - monto);
			return true;
		}
		
		return false;
	}
}
