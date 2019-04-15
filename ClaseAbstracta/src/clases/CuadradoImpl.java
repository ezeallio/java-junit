package clases;

public class CuadradoImpl implements Figuras{
	
	private Double lado;
	
	public CuadradoImpl(Double lado)
	{
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public Double calcularArea() {
		return lado * lado;
	}

	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

}
