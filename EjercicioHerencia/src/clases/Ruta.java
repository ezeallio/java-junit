package clases;

public class Ruta extends Bicicleta{
	private Integer platoMaximo, pinionMaximo;
	
	public Ruta(Integer plato, Integer pinion, Integer velocidad, Integer platoMaximo, Integer pinionMaximo)
	{
		super(plato, pinion, velocidad);
		this.platoMaximo = platoMaximo;
		this.pinionMaximo = pinionMaximo;
	}
	
	public Ruta(Integer platoMaximo, Integer pinionMaximo)
	{
		this.platoMaximo = platoMaximo;
		this.pinionMaximo = pinionMaximo;
	}
	
	public void acelerar()
	{
		super.acelerar();
		super.acelerar();
	}

	public void setPlato(Integer plato) {
		if(plato > 2 && plato < platoMaximo)
			super.setPlato(plato);
	}

	public void setPinion(Integer pinion) {
		if(pinion > 4 && pinion < pinionMaximo)
			super.setPinion(pinion);
	}

	public Integer getPlatoMaximo() {
		return platoMaximo;
	}

	public Integer getPinionMaximo() {
		return pinionMaximo;
	}
}
