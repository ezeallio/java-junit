package clases;

public class Tragamonedas {
	private Tambor miTambor1, miTambor2, miTambor3;

	public Tragamonedas()
	{
		miTambor1 = new Tambor();
		miTambor2 = new Tambor();
		miTambor3 = new Tambor();
	}
	
	public void jugar()
	{
		miTambor1.girar();
		miTambor2.girar();
		miTambor3.girar();
	}
	
	public String obtenerPremio()
	{
		if(miTambor1.mostrar() == miTambor2.mostrar() && miTambor1.mostrar() == miTambor3.mostrar())
			return "Ganador!";
		
		return "Perdedor!";
	}
	
	public String verJugada()
	{
		return miTambor1.mostrar() + " " + miTambor2.mostrar() +
				" " + miTambor3.mostrar() + " ";
	}

	public Tambor getMiTambor1() {
		return miTambor1;
	}

	public Tambor getMiTambor2() {
		return miTambor2;
	}

	public Tambor getMiTambor3() {
		return miTambor3;
	}
	
	
}
