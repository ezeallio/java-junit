package clases;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private Integer dni, edad;
	
	public Persona(String nombre, Integer dni, Integer edad)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

}
