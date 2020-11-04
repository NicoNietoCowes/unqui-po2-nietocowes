package unq;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> contador = new ArrayList<Integer>();

	public void addNumber(int x) {
		contador.add(x);
	}

	public int getPares() {
		int pares = 0;
		for (int i = 0; i < contador.size(); i++) {
			if(esPar(contador.get(i))) {
				pares++;
			}
		}
		return pares;
	}

	private boolean esPar(int x) {
		return (x % 2 == 0);
	}
	
	public int getImpares() {
		int impares = 0;
		for (int i = 0; i < contador.size(); i++) {
			if(!esPar(contador.get(i))) {
				impares++;
			}
		}
		return impares;
	}
	
	public int getMultiplosDe(int x) {
		int multiplos = 0;
		for (int i = 0; i < contador.size(); i++) {
			if(esMultiplo(contador.get(i), x)) {
				multiplos++;
			}
		}
		return multiplos;
	}
	
	private boolean esMultiplo(int n1, int n2) {
		if (n1%n2==0)
			return true;
		else
			return false;
	}
}
