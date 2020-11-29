package tp3;

public class Point {
	
	public int x;
	public int y;
	
	
	public Point () {
		x = 0;
		y = 0;
	}


	public Point(int coordenadaX, int coordenadaY) {
		x = coordenadaX;
		y = coordenadaY;
	}

	public int getX(Point point) {
		return point.x;
	}
	
	public int getY(Point point) {
		return point.y;
	}
	
	public Point getCoordenadas(Point point) {
		
		return point;
	}
	

	public boolean equals(Point point) {
		return this.x == ((Point)point).x && this.y == ((Point)point).y;
	}


	public void moverPoint(int i, int j) {
		this.x = i;
		this.y = j;
	}


	public void sumarPoint(Point point) {
		this.x += getX(point);
		this.y += getY(point);
	}
}
