package tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String string, double d, double i, boolean b) {
		super(string, aplicarDescuento(d, i), b);
	}

	private static double aplicarDescuento(double precioBaseDelProducto, double descuento) {
		double porcentaje = 1 - (descuento/100);
		double precioProductoPrimeraNecesidad = precioBaseDelProducto * porcentaje;
		return precioProductoPrimeraNecesidad;
	}
	
}
