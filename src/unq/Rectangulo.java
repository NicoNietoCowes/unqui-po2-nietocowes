package unq;

public class Rectangulo {
	public int h;
	public int b;
	private Point punto1;
	private Point punto2;
	private Point punto3;
	private Point punto4;

	public Rectangulo(int base, int altura) {
		this.punto1 = new Point();
		this.punto2 = new Point(0,altura);
		this.punto3 = new Point(base,0);
		this.punto3 = new Point(base,altura);
		b = base;
		h = altura;
		
	}

	public boolean esIgual(Rectangulo rectangulo) {
		return this.b == ((Rectangulo)rectangulo).b && this.h == ((Rectangulo)rectangulo).h;
	}

	public Integer area() {
		return this.b * this.h;
	}

	public Integer perimetro() {
		return (this.b * 2)+(this.h *2);
	}

	public boolean esHorizontal() {
		return this.b > this.h;
	}

	public boolean esVertical() {
		return this.b < this.h;
	}
	
	
}



