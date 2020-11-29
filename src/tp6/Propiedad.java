package tp6;

public class Propiedad {
	
	private String descripcion;
	private String direccion; 
	private Double valorFiscal;
	
	public Propiedad(String d, String dir, Double vf) {
		descripcion = d;
		direccion = dir;
		valorFiscal = vf;
	}

	public Double getValorFiscal() {
		return valorFiscal;
	}
	
}
