package clases;

public class Materia {
	private Examen examen1, examen2;
	
	public void evaluar(Integer nExamen, Double nota) throws Exception
	{
		if(nExamen.equals(1))
		{
			examen1 = new Examen();
			try{				
				examen1.calificar(nota);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
			if(nExamen.equals(2))
			{
				examen2 = new Examen();
				try{				
					examen2.calificar(nota);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			else
				throw new Exception("Numero de examen invalido");
	}

	public Examen getExamen1() {
		return examen1;
	}

	public Examen getExamen2() {
		return examen2;
	}
}
