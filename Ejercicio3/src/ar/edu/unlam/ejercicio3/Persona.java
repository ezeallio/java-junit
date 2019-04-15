package ar.edu.unlam.ejercicio3;

public class Persona
{
	private String nombre, sexo;
	private static final String SEXO = "H";
	private Integer dni, edad;
	private Double peso, altura;
	private static final Integer BAJOPESO = -1, PESOIDEAL = 0, SOBREPESO = 1;
	
	public Persona()
	{
		dni = generaDNI();
		nombre = "";
		this.sexo = SEXO;
		edad = 0;
		peso = altura = 0.0;
	}
	
	public Persona(String nombre, String sexo, Integer edad)
	{
		dni = generaDNI();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		peso = altura = 0.0;
	}
	
	public Persona(String nombre, String sexo, Integer edad, Double peso, Double altura)
	{
		dni = generaDNI();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Integer calcularIMC()
	{
		Integer resultado = (int)(peso/(altura*altura));
		return (resultado < 20)?BAJOPESO:(resultado >= 20 && resultado <= 25)?PESOIDEAL:SOBREPESO;
	}
	
	public Boolean esMayorDeEdad()
	{
		return (edad >= 18)?true:false;
	}
	
	public void comprobarSexo()
	{
		if(sexo != "H" && sexo != "M")
			sexo = "H";
	}
	
	public String toString()
	{
		return "DNI: " + dni + ", Nombre: " + nombre + ", Sexo: " + sexo + ", Edad: " + edad
				+ ", Peso: " + peso + ", Altura: " + altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	private Integer generaDNI()
	{
		return (int)(Math.random() * 100000000);
	}
}
