package tp6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNetoMensual;
	
	public Cliente(String n, String a, String d, Integer e, double s) {
		nombre = n;
		apellido = a;
		direccion = d;
		edad = e;
		sueldoNetoMensual = s;
	}

	public Double getIngresoAnual() {
		return sueldoNetoMensual * 12;
	}

	public Double getSueldoNeto() {
		return sueldoNetoMensual;
	}

	public Integer getEdad() {
		return edad;
	}

}
