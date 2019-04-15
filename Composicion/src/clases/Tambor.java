package clases;

public class Tambor {
	private Integer cara;
	
	public void girar()
	{
		this.cara = (int)(Math.random() * 9) + 1;
	}
	
	public Integer mostrar()
	{
		return this.cara;
	}
}
