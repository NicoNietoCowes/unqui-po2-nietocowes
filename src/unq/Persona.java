package unq;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	private LocalDate fechaNacimiento;
	private String nombre;
	
	public Persona (String name, int añoNacimiento, int mesNacimiento, int diaNacimiento) {
		nombre = name;
		fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
	}

	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		long años = ChronoUnit.YEARS.between(this.fechaNacimiento, fechaActual);
		return (int)años;
	}

	public Boolean menorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad();
	}
	
}