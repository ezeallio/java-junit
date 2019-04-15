package ar.edu.unlam.ejerciciosubasta;

public class Subasta
{
	private Double oferta;
	private Boolean estadoSubasta;
	
	public Subasta(Double oferta)
	{
		this.oferta = oferta;
		this.estadoSubasta = true;
	}
	
	public void ofertar(Double oferta)
	{
		if(oferta > this.oferta && this.estadoSubasta)
			this.oferta = oferta;
	}
	
	public void cerrarSubasta()
	{
		this.estadoSubasta = false;
	}
	
	public Double getOferta()
	{
		return this.oferta;
	}
}
