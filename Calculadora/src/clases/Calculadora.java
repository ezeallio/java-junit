package clases;

public class Calculadora {

	public Double dividir(Double numerador, Double denominador) throws Exception
	{
		if(denominador == 0)
			throw new Exception("Error en la division");
			
		return numerador / denominador;
	}
}
