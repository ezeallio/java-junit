package clases;

public class Cuenta {
	private Double saldo;

	public Cuenta()
	{
		saldo = 0.;
	}
	
	public void depositar(Double monto)
	{
		saldo += monto;
	}
	
	public Boolean retirar(Double monto)
	{
		if(monto <= saldo)
		{
			saldo -= monto;
			return true;
		}
		
		return false;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
