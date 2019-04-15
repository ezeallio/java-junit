package ar.edu.unlam.herencia;

public class Circulo extends Figura{
	private Double radio;
	
	public Circulo(String color, Double radio)
	{
		super(color);
		this.radio = radio;
	}
	
	public Double calcularArea()
	{
		return (Math.PI * Math.pow(radio, 2));
	}
	
	public Double calcularPerimetro()
	{
		return 2 * Math.PI * radio;
	}
}
