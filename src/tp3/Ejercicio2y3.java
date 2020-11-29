package tp3;

	public class Ejercicio2y3 {
	    
	       public static void main(String[] args) {
	    	   String a = "abc";
	    	   String s = a;
	    	   String t;
	    	   int x;   
	    	   Integer y;
	    	   System.out.println(a);
	       }
	}
	
// s.length(); retorna 3
// t.length(); da error, "The local variable t may not have been initialized"
// 1 + a; retorna 1abc
// a.toUpperCase(); retorna ABC
// "Libertad".indexOf("r"); retorna 4
// "Universidad".lastIndexOf('i'); retorna 7
// "Quilmes".substring(2,4); retorna il
// (a.length() + a).startsWith("a"); retorna false
// s == a; retorna true
// a.substring(1,3).equals("bc"); retorna true

/*
1. ¿Qué son los tipos de datos primitivos?

Los datos primitivos representan un único dato simple que puede ser de tipo char, byte, short, int, long, float, 
double y boolean. Cada tipo de dato presenta un conjunto de valores o constantes literales.

2. ¿Cuál es la diferencia entre un int y un Integer?

La diferencia sustancial es que, en JAVA, int es un tipo primitivo, no un objeto, mientras que Integer es un objeto 
o una Clase. Dicho en lenguaje coloquial: un int es un número, y un Integer es un puntero que hace referencia a una clase 
que contiene un entero.

3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se
define una de tipo Integer? Haga la prueba en Eclipse.

El valor predeterminado de int es 0 y el de Integer es null.

4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
instancia se define una variable de método.

Al ejecutar ambas variables se retorna el error The local variable y/x may not have been initialized

*/