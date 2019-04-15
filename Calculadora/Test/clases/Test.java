package clases;

public class Test {

	@org.junit.Test
	//(expected = Exception.class)
	public void test(){
		Calculadora miCalculadora = new Calculadora();
		
		try{
			miCalculadora.dividir(1.2, 0.);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
