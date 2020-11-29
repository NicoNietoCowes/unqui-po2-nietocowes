package tp5.pagosMercado;

public class FacturaServicio extends Factura {
	
	private Double precioUnidad;
	private Double cantidadUnidades;
	private String periodo;
	
	
	public FacturaServicio(String s, Double d, Double e) {
		periodo = s;
		precioUnidad = d;
		cantidadUnidades = e;
	}
	
	@Override
	public Double getMonto(){
		return precioUnidad * cantidadUnidades;
	}
}
