package clases;

public class Circulo extends Figura{
	private Double radio;
	
	public Circulo(Double radio)
	{
		this.radio = radio;
	}
	
	@Override
	public Double calcularArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
}
