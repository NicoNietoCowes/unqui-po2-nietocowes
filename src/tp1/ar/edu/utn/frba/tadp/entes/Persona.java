package tp1.ar.edu.utn.frba.tadp.entes;

@Articulo(cardinal = "una", titulo = "Sr.")
public class Persona implements Nombrable{
	private String nombre;
	private Direccion direccion;
	public Persona() {
	super();
	}
	public Persona(String nombre, Direccion direccion) {
	this();
	this.nombre = nombre;
	this.direccion = direccion;
	}
	public String getNombre() {
	return this.nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public Direccion getDireccion() {
	return direccion;
	}
	public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
	}
	@Override
	public String toString() {
	return this.getNombre();
	}
	/**
	* @deprecated use {@link Persona#vive(Direccion)}
	*/
	public boolean viveEn(Direccion direccion) {
	return this.vive(direccion);
	}
	/**
	* @return si es la dirección de la Persona
	*/
	public boolean vive(Direccion direccion) {
	return this.direccion.equals(direccion);
	}
}
