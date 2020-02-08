package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Line2dTest {
	
	@Test
	public void testConstructorLineFromTwoPoint2d(){
		Point2d p1 = new Point2d(1,1);
		Point2d p2 = new Point2d(2,2);
		Line2d l = new Line2d(p1, p2);
				
		assertEquals(1.414214, l.length(), 1e-6);
	}
	
	@Test
	public void testDistanceFromLine1() {
		Line2d l = new Line2d(1, 1, 0, 0);
		assertEquals(0.707106, l.distanceTo(1, 2), 1e-6);
	}

	@Test
	public void testDistanceFromLine2() {
		Line2d l = new Line2d(4, 2, 8, -1);
		assertEquals(1.2, l.distanceTo(-2, 5), 1e-6);
	}
	
	@Test
	public void testToString() {
		Line2d l = new Line2d(4, 2, 8, -1);
		assertEquals("y=-0.750x+5.000", l.toString());
	}
	
	@Test
	public void testDistanceFromLine3() {
		Line2d l = new Line2d(134, -982, -314, -156);
		assertEquals("y=-1.844x-734.938", l.toString());
		assertEquals(578.432759, l.distanceTo(-34, 541), 1e-6);
	}
	
	@Test
	public void testDistanceFromLineWithPoint2d() {
		Line2d l = new Line2d(134, -982, -314, -156);
		Point2d p = new Point2d(-34, 541);
		assertEquals("y=-1.844x-734.938", l.toString());
		assertEquals(578.432759, l.distanceTo(p), 1e-6);
	}
	
	public void testGetLength() {
		Line2d l = new Line2d(1, 1, 0, 0);
		assertEquals(0.707106, l.distanceTo(1, 2), 1e-6);
	}
}
