package clases;

public class Examen {
	private Double nota;
	
	public Examen()
	{
		this.nota = 0.;
	}
	
	public void calificar(Double nota) throws Exception
	{
		if((nota >= 1) && (nota <= 10))
			this.nota = nota;
		else
			throw new Exception("Nota invalida");
	}	

	public Double getNota() {
		return nota;
	}
}
