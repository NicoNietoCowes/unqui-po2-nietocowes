package unq;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	private LocalDate fechaNacimiento;
	private String nombre;
	
	public Persona (String name, int a�oNacimiento, int mesNacimiento, int diaNacimiento) {
		nombre = name;
		fechaNacimiento = LocalDate.of(a�oNacimiento, mesNacimiento, diaNacimiento);
	}

	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		long a�os = ChronoUnit.YEARS.between(this.fechaNacimiento, fechaActual);
		return (int)a�os;
	}

	public Boolean menorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad();
	}
	
}