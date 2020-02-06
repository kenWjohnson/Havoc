package engine.havoc2D;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import engine.havoc2D.Point2D;

class Point2DTest extends Point2D {

	@Test
	void testConstructorDefaultPoint() {
		Point2D point = new Point2D();
		assertEquals(0, point.getX(), 1e-6);
		assertEquals(0, point.getY(), 1e-6);
	}

	@Test
	void testConstructorCopyPoint() {
		Point2D point1 = new Point2D();
		Point2D point2 = new Point2D(point1);
		assertEquals(point1.getX(), point2.getX(), 1e-6);
		assertEquals(point1.getY(), point2.getY(), 1e-6);
	}
	
	@Test
	void testConstructorArgsPoint() {
		Point2D point = new Point2D(1, 1);
		assertEquals(1, point.getX(), 1e-6);
		assertEquals(1, point.getY(), 1e-6);
	}
	
	@Test
	void testGetX() {
		Point2D point = new Point2D();
		assertEquals(0, point.getX(), 1e-6);
	}
	
	@Test
	void testGetY() {
		Point2D point = new Point2D();
		assertEquals(0, point.getY(), 1e-6);
	}
	
	@Test
	void findDistanceTo1() {
		Point2D point1 = new Point2D(-1, 1);
		Point2D point2 = new Point2D(1, -1);		
		assertEquals(2.828427, point1.findDistanceTo(point2), 1e-6);
		assertEquals(2.828427, point2.findDistanceTo(point1), 1e-6);
	}
	
	@Test
	void findDistanceTo2() {
		Point2D point1 = new Point2D(1, 1);
		Point2D point2 = new Point2D(-1, -1);		
		assertEquals(2.828427, point1.findDistanceTo(point2), 1e-6);
		assertEquals(2.828427, point2.findDistanceTo(point1), 1e-6);
	}
	
	@Test
	void testToString1() {
		Point2D p = new Point2D();
		assertEquals("(0.000, 0.000)", p.toString());
	}
	
	@Test
	void testToString2() {
		Point2D p = new Point2D(-543.245525,156.254258);
		assertEquals("(-543.246, 156.254)", p.toString());
	}
	
	@Test
	void testToString3() {
		Point2D p = new Point2D(141.15415, -65.9966);
		assertEquals("(141.154, -65.997)", p.toString());
	}
		
}
