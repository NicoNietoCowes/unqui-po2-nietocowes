package supermercado;

import java.util.ArrayList;

import unq.Persona;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String string, String string2) {
		nombre = string;
		direccion = string2;
		productos = new ArrayList<Producto>();
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		
	}

	public Double getPrecioTotal() {
		Double sum = 0.0;
		if(!this.productos.isEmpty()) {
			for (Producto producto : productos) {
				sum += producto.getPrecio();
			}
		}
		return sum;
	}
}
