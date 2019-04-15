package clases;

public class CirculoP implements Figuras{
	private Double radio;
	
	public CirculoP(Double radio)
	{
		this.radio = radio;
	}

	public Double calcularArea() {
		return Math.PI * radio * radio;
	}

	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

}
