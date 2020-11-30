package tp7.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/** Corresponde al ejemplo del ejercicio 9.2*/
public class Prueba {
	public static void main(String[] args) { 
		ArrayList<String> lista = new ArrayList<>(); 

		lista.add("Esto"); 
		lista.add("es"); 
		lista.add("una"); 
		lista.add("prueba"); 
        lista.add("de"); 
        lista.add("un"); 
        lista.add("iterador"); 
        lista.add("adaptado"); 

        System.out.println("La lista es: \n" + lista); 

        Iterator<String> iter = lista.iterator(); 

        System.out.println("\nLos valores iterados de la lista son: "); 
        while (iter.hasNext()) { 
            System.out.print(iter.next() + " "); 
        } 
    }

}