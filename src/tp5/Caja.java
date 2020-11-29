package tp5;

import java.util.ArrayList;

import tp5.pagosMercado.Agencia;
import tp5.pagosMercado.Factura;

public class Caja implements Agencia {
	
	ArrayList<Producto> productosRegistrados = new ArrayList<Producto>();
	ArrayList<Factura> pagosRegistrados = new ArrayList<Factura>();

	public void registrarProducto(Producto producto) {
		productosRegistrados.add(producto);
		producto.descontarStock();
		
	}

	public Double getMontoTotal() {
		return productosRegistrados.stream().mapToDouble(Producto::getMonto).sum();
	}

	@Override
	public void registrarPago(Factura factura) {
		pagosRegistrados.add(factura);
	}
	
	public Double getRecaudacionFacturasTotal() {
		return pagosRegistrados.stream().mapToDouble(Factura::getMonto).sum();
	}
}

