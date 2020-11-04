package supermercado;

public class Producto {
	
	protected String nombre;
	protected double precio;
	protected boolean preciosCuidados;
	
	public Producto(String string, double d, boolean b) {
		nombre = string;
		precio = d;
		preciosCuidados = b;
	}

	public Producto(String string, double d) {
		nombre = string;
		precio = d;
		preciosCuidados = false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		return preciosCuidados;
	}

	public void aumentarPrecio(double d) {
		this.precio += d;
		
	}
}
