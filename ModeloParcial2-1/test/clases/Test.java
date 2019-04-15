package clases;

import static org.junit.Assert.*;

import java.util.TreeSet;

public class Test {

	@org.junit.Test
	public void test() {
		TreeSet<Persona> lista = new TreeSet<Persona>();
		lista.add(new Persona("Pepe", 123, 32));
		lista.add(new Persona("Ramon", 345, 65));
		lista.add(new Persona("Santa", 723, 23));
		lista.add(new Persona("Horacio", 274, 43));
		
		for(Persona persona : lista)
		{
			System.out.println(persona.getDni());
		}
		System.out.println("\n");
		TreeSet<Persona> lista2 = new TreeSet<Persona>(new OrdenarPorDniInverso());
		lista2.add(new Persona("Pepe", 123, 32));
		lista2.add(new Persona("Ramon", 345, 65));
		lista2.add(new Persona("Santa", 723, 23));
		lista2.add(new Persona("Horacio", 274, 43));
		
		for(Persona persona : lista2)
		{
			System.out.println(persona.getDni());
		}
	}

}
