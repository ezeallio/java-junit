package clases;

public class Rectangulo extends Figura{
	private Double base, altura;
	
	public Rectangulo(Double base, Double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public Double calcularArea() {
		return base * altura;
	}

	@Override
	public Double calcularPerimetro() {
		return base * 2 + altura * 2;
	}

}
