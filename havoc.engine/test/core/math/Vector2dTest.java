package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector2dTest {

	@Test
	public void testDefualtConstructor() {
		Vector2d v = new Vector2d(1, 2);
		assertEquals(1, v.i(),1e-6);
		assertEquals(2, v.j(),1e-6);
	}

	
	@Test
	public void testConstructorVectorFromOnePoint2d() {
		Point2d p = new Point2d(1,2);
		Vector2d v = new Vector2d(p);	
		assertEquals(1, v.i(),1e-6);
		assertEquals(2, v.j(),1e-6);
	}
	
	@Test
	public void testConstructorFromTwoPoints() {
		Vector2d v = new Vector2d(1, 0, 1, 2);
		assertEquals(0, v.i(),1e-6);
		assertEquals(2, v.j(),1e-6);
	}
	
	@Test
	public void testConstructorVectorFromTwoPoint2d() {
		Point2d p1 = new Point2d(1,0);
		Point2d p2 = new Point2d(1,2);

		Vector2d v = new Vector2d(p1, p2);	
		assertEquals(0, v.i(),1e-6);
		assertEquals(2, v.j(),1e-6);
	}
	
	@Test
	public void testCreateVeccotrFromMagnitudeAndPhase() {
		Vector2d v = Vector2d.toCartesion(1, Math.PI/4);
		assertEquals(Math.sqrt(2)/2, v.i(),1e-6);
		assertEquals(Math.sqrt(2)/2, v.j(),1e-6);
	}

}
