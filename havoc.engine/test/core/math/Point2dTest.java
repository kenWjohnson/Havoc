package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Point2dTest extends Point2d {
	
	@Test
	public void testDefaultConstuctor() {
		Point2d p = new Point2d();
		assertEquals(0, p.x(), 1e-6);
		assertEquals(0, p.y(), 1e-6);
	}
	
	@Test
	public void testArgumentConstuctor() {
		Point2d p = new Point2d(1, 2);
		assertEquals(1, p.x(), 1e-6);
		assertEquals(2, p.y(), 1e-6);
	}
	
	@Test
	public void testGetX() {
		Point2d p = new Point2d(1, 0);
		assertEquals(1, p.x(), 1e-6);
	}
	
	@Test
	public void testGetY() {
		Point2d p = new Point2d(1, 2);
		assertEquals(2, p.y(), 1e-6);
	}
	
	@Test
	public void testGetR() {
		Point2d p = new Point2d(3, 4);
		assertEquals(5, p.r(), 1e-6);
	}
	
	@Test
	public void testGetTheta() {
		Point2d p = new Point2d(3, 4);
		assertEquals(0.927295, p.theta(), 1e-6);
	}
	
	@Test
	public void testToString() {
		Point2d p = new Point2d(1, 1);
		assertEquals("(1.000, 1.000)", p.toString());
	}
	
	@Test
	public void testToStringPolar() {
		Point2d p = new Point2d(1, 1);
		assertEquals("(1.414, 0.785)", p.toStringPolar());
	}
	
	@Test
	public void testDistanceTo() {
		Point2d p1 = new Point2d(1, -1);
		Point2d p2 = new Point2d(-1, 1);

		assertEquals(2.828427, p1.distanceTo(p2), 1e-6);
	}
	
	@Test
	public void testEqualPoints() {
		Point2d p1 = new Point2d(1, 2);
		Point2d p2 = new Point2d(1, 2);
		assertTrue(p1.equals(p2) && p2.equals(p1));
		assertTrue(p1.hashCode() == p2.hashCode());
	}
	
	@Test
	public void testEqualWithNull() {
		Point2d p1 = new Point2d(0, 0);
		assertTrue(!p1.equals(null));
	}

	@Test
	public void testPointsThatAreNotEqual() {
		Point2d p1 = new Point2d(0, 0);
		Point2d p2 = new Point2d(1, 0);
		assertTrue(!p1.equals(p2));
	}
	
	
	@Test
	public void testTranslate() {
		Point2d p0 = new Point2d(1, 1);
		Point2d p = p0.translate(4, 6);
		assertEquals(5, p.x(), 1e-6);
		assertEquals(7, p.y(), 1e-6);
	}
	
	@Test
	public void testRotate1() {
		Point2d p0 = new Point2d(1, 0);
		Point2d p = p0.rotate(90);
		assertEquals(0, p.x(), 1e-6);
		assertEquals(1, p.y(), 1e-6);
	}
	
	@Test
	public void testRotate2() {
		Point2d p0 = new Point2d(1, 0);
		Point2d p = p0.rotate(180);
		assertEquals(-1, p.x(), 1e-6);
		assertEquals(0, p.y(), 1e-6);
	}	
	
}
