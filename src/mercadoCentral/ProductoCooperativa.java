package mercadoCentral;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(Double i, Integer s) {
		super(aplicarDescuento(i), s);
	}

	private static double aplicarDescuento(double precioProducto) {
		
		return precioProducto * 0.9;
	}
	

}
