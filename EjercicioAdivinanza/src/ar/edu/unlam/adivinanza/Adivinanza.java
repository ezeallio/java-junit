package ar.edu.unlam.adivinanza;

public class Adivinanza
{
	private Integer numero;
	
	public Adivinanza()
	{
		numero = 16;
	}
	
	public Boolean esIgual(Integer valor)
	{
		return numero == valor;
	}
	
	public Boolean esMayorOMenor(Integer valor)
	{
		return numero > valor;
	}
	
	public Integer getNumero()
	{
		return numero;
	}
	
	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}
	
	public String toString()
	{
		return "Numero: " + numero;
	}
}
