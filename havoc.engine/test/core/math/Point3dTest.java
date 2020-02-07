package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Point3dTest {

	@Test
	
	public void testDefaultConstuctor() {
		Point3d p = new Point3d();
		assertEquals(0, p.x(), 1e-6);
		assertEquals(0, p.y(), 1e-6);
		assertEquals(0, p.z(), 1e-6);

	}
	
	@Test
	public void testArgumentConstuctor() {
		Point3d p = new Point3d(1, 2, 3);
		assertEquals(1, p.x(), 1e-6);
		assertEquals(2, p.y(), 1e-6);
		assertEquals(3, p.z(), 1e-6);

	}
	
	@Test
	public void testGetX() {
		Point3d p = new Point3d(1, 2, 3);
		assertEquals(1, p.x(), 1e-6);
	}
	
	@Test
	public void testGetY() {
		Point3d p = new Point3d(1, 2, 3);
		assertEquals(2, p.y(), 1e-6);
	}
	
	@Test
	public void testGetZ() {
		Point3d p = new Point3d(1, 2, 3);
		assertEquals(3, p.z(), 1e-6);
	}
	
	@Test
	public void testGetR() {
		Point3d p = new Point3d(3, 4, 5);
		assertEquals(7.071067, p.r(), 1e-6);
	}
	
	@Test
	public void testGetTheta() {
		Point3d p = new Point3d(3, 4, 5);
		assertEquals(0.927295, p.theta(), 1e-6);
	}
	
	@Test
	public void testGetPhi() {
		Point3d p = new Point3d(3, 4, 5);
		assertEquals(0.785398, p.phi(), 1e-6);
	}
	
	@Test
	public void testToString() {
		Point3d p = new Point3d(1, 1,1);
		assertEquals("(1.000, 1.000, 1.000)", p.toString());
	}
	
	@Test
	public void testToStringPolar() {
		Point3d p = new Point3d(1, 1, 1);
		assertEquals("(1.732, 0.785, 0.955)", p.toStringPolar());
	}
	
	@Test
	public void testDistanceTo() {
		Point3d p1 = new Point3d(1, -1, 1);
		Point3d p2 = new Point3d(-1, 1, -1);
		assertEquals(3.464101, p1.distanceTo(p2), 1e-6);
	}
	
	@Test
	public void testEqualPoints() {
		Point3d p1 = new Point3d(1, 2, 3);
		Point3d p2 = new Point3d(1, 2, 3);
		assertTrue(p1.equals(p2) && p2.equals(p1));
		assertTrue(p1.hashCode() == p2.hashCode());
	}
	
	@Test
	public void testEqualWithNull() {
		Point3d p1 = new Point3d(0, 0, 0);
		assertTrue(!p1.equals(null));
	}

	@Test
	public void testPointsThatAreNotEqual() {
		Point3d p1 = new Point3d(0, 0, 0);
		Point3d p2 = new Point3d(1, 0, 0);
		Point3d p3 = new Point3d(0, 1, 0);
		Point3d p4 = new Point3d(0, 0, 1);
		assertTrue(!p1.equals(p2));
		assertTrue(!p1.equals(p3));
		assertTrue(!p1.equals(p4));


	}
}
