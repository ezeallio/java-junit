package clases;

public class Bicicleta {
	private Integer plato, pinion, velocidad;
	
	public Bicicleta()
	{
		this.plato = 7;
		this.pinion = 5;
		this.velocidad = 40;
	}
	
	public Integer getPlato() {
		return plato;
	}

	public void setPlato(Integer plato) {
		this.plato = plato;
	}

	public Integer getPinion() {
		return pinion;
	}

	public void setPinion(Integer pinion) {
		this.pinion = pinion;
	}

	public Bicicleta(Integer plato, Integer pinion, Integer velocidad)
	{
		this.plato = plato;
		this.pinion = pinion;
		this.velocidad = velocidad;
	}
	
	public void acelerar()
	{
		this.velocidad++;
	}
	
	public void frenar()
	{
		this.velocidad--;
	}
	
	public void frenar(Integer decremento)
	{
		this.velocidad -= decremento;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	
}
