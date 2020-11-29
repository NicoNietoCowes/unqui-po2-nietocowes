package tp5;

public class Producto {

	protected Double monto;
	protected Integer stock;
	
	
	public Producto(Double i, Integer s) {
		monto = i;
		stock =s;
	}
	
	public Double getMonto() {
		return monto;
	}
	
	public Integer getStock( ) {
		return stock;
	}

	public void descontarStock() {
		stock -=1;
	}
	
}
