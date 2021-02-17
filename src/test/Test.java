package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Prueba prueba = new Prueba();
		List<Integer> lista = prueba.crearLista();
		for(int numero : lista) {
			System.out.println("numero de la lista::" + numero);
		}
		imprimir(lista);
		
	}
	
	private static void imprimir(List<Integer> lista) {
		
		for(int numero : lista) {
			if(numero !=0) {
				String aux = "";
				String numeroString = String.valueOf(numero);
				int numeroint = 0;
				for(int i =numeroString.length()-1; i>=0; i--) {
					aux += numeroString.charAt(i);
					numeroint = Integer.parseInt(aux);
				}
				System.out.println(numeroint);
			}else {
				System.out.println("El programa Finalizo");
			}
			
		}
		
	}

}
