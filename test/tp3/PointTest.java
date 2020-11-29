package tp3;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Point;

class PointTest {
	
	private Point punto1;
	private Point punto2;
	
	@BeforeEach
	void setUp() throws Exception {
	punto1 = new Point();
	punto2 = new Point(1,2);
	}

	@Test
	void testContructorEn00() {
		assertTrue("no son iguales", punto1.equals((new Point(0,0))));
	}

	@Test
	void testContructorEn12() {
		assertTrue("no son iguales", punto2.equals((new Point(1,2))));
	}
	
	@Test
	void testMoverPointDe00a12() {
		punto1.moverPoint(1,2);
		assertTrue("no son iguales", punto1.equals((new Point(1,2))));
	}
	
	@Test
	void testSumarPoint12y12a24() {
		punto2.sumarPoint(new Point(1,2));
		assertTrue("no son iguales", punto2.equals((new Point(2,4))));
	}
}
