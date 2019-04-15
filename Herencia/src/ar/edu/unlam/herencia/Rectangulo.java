package ar.edu.unlam.herencia;

public class Rectangulo extends Figura{
	private Double base, altura;
	
	public Rectangulo(String color, Double base, Double altura)
	{
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Double calcularPerimetro()
	{
		return (2 * base) + (2 * altura);
	}
	
	public Double calcularArea()
	{
		return base * altura;
	}
}
