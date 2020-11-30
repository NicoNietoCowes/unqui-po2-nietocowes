package tp10.registro;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		// Estas constantes no van a ser necesarias porque ahora se delega en otro métodos.
		// LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		// Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
		// String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sÃ³lo realizan vtv los vehÃ­culos con mÃ¡s de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (!this.esVehiculoPolicial(vehiculo) && this.tieneMasDe1AnioDeAntiguedad(vehiculo, fecha)
				&& this.estaRadicadoEnBuenosAires(vehiculo));

		/** Lo único que me hace ruido en este return es la poca claridad
		 * que aportan las acciones empleadas, si bién están respaldadas por el comentario
		 * siempre es buena práctica reemplazar un comentario por métodos con nombres
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
