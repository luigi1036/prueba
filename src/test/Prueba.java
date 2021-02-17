package test;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
	
	public List<Integer> crearLista() {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i = 0; i<5; i++) {
			lista.add(random());
		}
		lista.add(0);
		return lista;
	}
	
	
	
	private int random() {
		
		int aleatorio = (int) Math.floor(Math.random()*10000);
		return aleatorio;
		
	}
	
	


}
