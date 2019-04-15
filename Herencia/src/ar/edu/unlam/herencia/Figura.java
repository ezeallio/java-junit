package ar.edu.unlam.herencia;

public class Figura {
	private String color;
	
	public Figura(String color)
	{
		this.color = color;
	}
	
	public Figura()
	{
		this.color = "blanco";
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
}
