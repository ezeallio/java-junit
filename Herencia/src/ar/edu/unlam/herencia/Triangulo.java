package ar.edu.unlam.herencia;

public class Triangulo extends Figura{
	private Double base, altura;
	
	public Triangulo(String color, Double base, Double altura)
	{
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Double calcularPerimetro()
	{
		return base + altura + (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
	}
	
	public Double calcularArea()
	{
		return (base * altura) / 2;
	}
}
