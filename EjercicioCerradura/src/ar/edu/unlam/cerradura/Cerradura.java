package ar.edu.unlam.cerradura;

public class Cerradura
{
	private Integer claveDeApertura, cantidadDeFallosConsecutivosQueLaBloquean, cantidadFallos = 0;
	private Boolean estadoCerradura = false, estadoBloqueo = false;
	
	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean)
	{
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public Boolean abrir(Integer clave)
	{
		if((clave.equals(claveDeApertura)) && (!estadoBloqueo))
		{
			estadoCerradura = true;
			cantidadFallos = 0;
			return true;
		}
		
		cantidadFallos++;
		
		if(cantidadFallos == cantidadDeFallosConsecutivosQueLaBloquean)
		{
			estadoBloqueo = true;
			estadoCerradura = false;
		}
		
		return false;
	}
	
	public void cerrar()
	{
		estadoCerradura = false;
	}
	
	public Boolean estaCerrada()
	{
		return !estadoCerradura;
	}
	
	public Boolean fueBloqueada()
	{
		return estadoBloqueo;
	}
	
	public Integer getClaveDeApertura()
	{
		return claveDeApertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((cantidadDeFallosConsecutivosQueLaBloquean == null) ? 0
						: cantidadDeFallosConsecutivosQueLaBloquean.hashCode());
		result = prime * result
				+ ((claveDeApertura == null) ? 0 : claveDeApertura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerradura other = (Cerradura) obj;
		if (cantidadDeFallosConsecutivosQueLaBloquean == null) {
			if (other.cantidadDeFallosConsecutivosQueLaBloquean != null)
				return false;
		} else if (!cantidadDeFallosConsecutivosQueLaBloquean
				.equals(other.cantidadDeFallosConsecutivosQueLaBloquean))
			return false;
		if (claveDeApertura == null) {
			if (other.claveDeApertura != null)
				return false;
		} else if (!claveDeApertura.equals(other.claveDeApertura))
			return false;
		return true;
	}
}
