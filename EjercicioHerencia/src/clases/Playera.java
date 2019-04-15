package clases;

public class Playera extends Bicicleta{
	
	public void frenar()
	{
		super.frenar();
	}
	
	public void frenar(Integer decremento)
	{
		super.frenar(decremento);
	}
	
	public void frenar(Double decremento)
	{
		super.frenar(decremento.intValue());
	}
}
