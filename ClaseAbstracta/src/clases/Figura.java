package clases;

public abstract class Figura {
	private String color;
	
	public Figura()
	{
		this.color = "negro";
	}
	
	public abstract Double calcularArea();
	
	public abstract Double calcularPerimetro();
}
