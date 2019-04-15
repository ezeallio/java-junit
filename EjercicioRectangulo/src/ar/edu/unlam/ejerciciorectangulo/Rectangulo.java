package ar.edu.unlam.ejerciciorectangulo;

public class Rectangulo
{
	private Integer base;
	private Integer altura;
	
	public Rectangulo(Integer base, Integer altura)
	{
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo()
	{
		this.base = 2;
		this.altura = 4;
	}
	
	public Integer calcularArea()
	{
		return base * altura;
	}
	
	public Integer calcularPerimetro()
	{
		return 2 * (base + altura);
	}
}
