package unq;

public class Cuadrado {
	public int l;
	private Point punto1;
	private Point punto2;
	private Point punto3;
	private Point punto4;
	
	public Cuadrado (int x) {
		this.punto1 = new Point();
		this.punto2 = new Point(0,x);
		this.punto3 = new Point(x,0);
		this.punto3 = new Point(x,x);
		l = x;
		
	
}

	public boolean esIgual(Cuadrado cuadrado) {
		return this.l == ((Cuadrado)cuadrado).l;
	}

	public Integer area() {
		return this.l * this.l;
	}

	public Integer perimetro() {
		return this.l * 4;
	}
	

}
