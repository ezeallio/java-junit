package clases;

public class Hijo extends Padre{
	private Integer z;
	
	public Hijo(Integer z, Integer x, Integer y)
	{
		super(x, y);
		this.z = z;
	}
	
	public void metodo()
	{
		super.setX(5);
	}
}
