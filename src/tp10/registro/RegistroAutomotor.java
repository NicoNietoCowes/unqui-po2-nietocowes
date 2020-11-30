package tp10.registro;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		// Estas constantes no van a ser necesarias porque ahora se delega en otro m�todos.
		// LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		// Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
		// String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (!this.esVehiculoPolicial(vehiculo) && this.tieneMasDe1AnioDeAntiguedad(vehiculo, fecha)
				&& this.estaRadicadoEnBuenosAires(vehiculo));

		/** Lo �nico que me hace ruido en este return es la poca claridad
		 * que aportan las acciones empleadas, si bi�n est�n respaldadas por el comentario
		 * siempre es buena pr�ctica reemplazar un comentario por m�todos con nombres
		 * descriptivos. */
	}
	
	public Boolean esVehiculoPolicial(Vehiculo vehiculo) {
		return vehiculo.esVehiculoPolicial();
	}
	
	public Boolean tieneMasDe1AnioDeAntiguedad(Vehiculo vehiculo, LocalDate fechaDeConsulta) {
		return fechaDeConsulta.minusYears(1).isAfter(vehiculo.getFechaFabricacion());
	}
	
	public Boolean estaRadicadoEnBuenosAires(Vehiculo vehiculo) {
		return vehiculo.estaRadicadoEn("Buenos Aires");
	}
}
