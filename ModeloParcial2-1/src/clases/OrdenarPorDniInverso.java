package clases;

import java.util.Comparator;

public class OrdenarPorDniInverso implements Comparator<Persona>{

	public int compare(Persona o1, Persona o2) {
		return o2.getDni() - o1.getDni();
	}

}
