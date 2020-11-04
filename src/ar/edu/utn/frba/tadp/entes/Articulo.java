package ar.edu.utn.frba.tadp.entes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
* Indica cu�les son los art�culos que corresponde usar con un
* Nombrable para generar frases en el idioma castellano.
* @author Leo Gassman
* @see Nombrable
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Articulo {
	/**
	* Dependiendo de si es masculino o femenino,
	* se admiten las formas "un" o "una"
	*/
	String cardinal();
	/**
	* Es un t�tulo agregado al nombre
	*/
	String titulo();
}
