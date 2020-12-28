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
	
	@Test
	public void testGetMagnitude() {
		Vector2d v = new Vector2d(3, 4);
		assertEquals(5, v.magnitude(), 1e-6);
	}
	
	@Test
	public void testGetDirection() {
		Vector2d v = new Vector2d(3, 4);
		assertEquals(0.927295, v.direction(), 1e-6);
	}
	
	@Test
	public void testToString() {
		Vector2d v = new Vector2d(1,1);
		assertEquals("[1.000i, 1.000j]", v.toString());
	}	
	
	@Test
	public void testNormalize() {
		Vector2d v = new Vector2d(10, 10);
		Vector2d unit = v.normalize();
		
		assertEquals(Math.sqrt(2) / 2, unit.i(), 1e-6);
		assertEquals(Math.sqrt(2) / 2, unit.j(), 1e-6);
	}
	
	@Test
	public void testAddWithComponent() {
		Vector2d v = new Vector2d(1, 1);
		Vector2d sum = v.add(1, 1);
		
		assertEquals(2, sum.i(), 1e-6);
		assertEquals(2, sum.j(), 1e-6);
	}
	
	@Test
	public void testAddWithVector() {
		Vector2d v1 = new Vector2d(1, 1);
		Vector2d v2 = new Vector2d(1, 1);
		Vector2d sum = v1.add(v2);
		assertEquals(2, sum.i(), 1e-6);
		assertEquals(2, sum.j(), 1e-6);
	}
	
	@Test
	public void testStatcAddition() {
		Vector2d v1 =  new Vector2d(1, 1);
		Vector2d v2 =  new Vector2d(1, 1);
		Vector2d sum = Vector2d.add(v1, v2);
		
		assertEquals(2, sum.i(), 1e-6);
		assertEquals(2, sum.j(), 1e-6);
	}
	
	@Test
	public void testSubtractWithComponent() {
		Vector2d v = new Vector2d(1, 1);
		Vector2d diff = v.subtract(1, 1);
		
		assertEquals(0, diff.i(), 1e-6);
		assertEquals(0, diff.j(), 1e-6);
	}
	
	@Test
	public void testSubtractWithVector() {
		Vector2d v1 = new Vector2d(1, 1);
		Vector2d v2 = new Vector2d(1, 1);
		Vector2d diff = v1.subtract(v2);
		assertEquals(0, diff.i(), 1e-6);
		assertEquals(0, diff.j(), 1e-6);
	}
	
	@Test
	public void testStatcSubtraction() {
		Vector2d v1 =  new Vector2d(1, 1);
		Vector2d v2 =  new Vector2d(1, 1);
		Vector2d diff = Vector2d.subtract(v1, v2);
		
		assertEquals(0, diff.i(), 1e-6);
		assertEquals(0, diff.j(), 1e-6);
	}
	
	@Test
	public void testScale() {
		Vector2d v = new Vector2d(1, 2);
		v = v.scale(5);
		assertEquals(5, v.i(), 1e-6);
		assertEquals(10, v.j(), 1e-6);
	}
	
	@Test
	public void testDotWithArguments() {
		Vector2d v = new Vector2d(1, 2);
		assertEquals(11, v.dot(3,4), 1e-6);
	}
	
	@Test
	public void testDotWithVector2d() {
		Vector2d v1 = new Vector2d(1, 2);
		Vector2d v2 = new Vector2d(3, 4);
		assertEquals(11, v1.dot(v2), 1e-6);
	}
	
	@Test
	public void testStaticDot() {
		Vector2d v1 = new Vector2d(1, 2);
		Vector2d v2 = new Vector2d(3, 4);
		assertEquals(11, Vector2d.dot(v1, v2), 1e-6);
	}
	
	@Test
	public void testProjectWithArguments() {
		Vector2d v = new Vector2d(5, 0);
		assertEquals(1, v.project(1,0), 1e-6);
	}
	
	@Test
	public void testProjectWithVector() {
		Vector2d v = new Vector2d(5, 0);
		Vector2d v2 = new Vector2d(1, 0);
		assertEquals(1, v.project(v2), 1e-6);
	}
	
	@Test
	public void testStaticProject() {
		Vector2d v1 = new Vector2d(5, 0);
		Vector2d v2 = new Vector2d(1, 0);
		assertEquals(1, Vector2d.project(v1, v2), 1e-6);
	}
	
	@Test
	public void testProjectedVectorWithArgument() {
		Vector2d v1 = new Vector2d(5, 0);
		Vector2d proj = v1.projectedVector(1, 0);
		assertEquals(1, proj.i(), 1e-6);
		assertEquals(0, proj.j(), 1e-6);
	}
	
	@Test
	public void testPorjectedVectorWithVector2d() {
		Vector2d v1 = new Vector2d(5, 0);
		Vector2d v2 = new Vector2d(1, 0);
		Vector2d proj = v1.projectedVector(v2);
		assertEquals(1, proj.i(), 1e-6);
		assertEquals(0, proj.j(), 1e-6);
	}
	
	@Test
	public void testStaticProjectedVector2d() {
		Vector2d v1 = new Vector2d(5, 0);
		Vector2d v2 = new Vector2d(1, 0);
		Vector2d proj = Vector2d.projectedVector(v1, v2);
		assertEquals(1, proj.i(), 1e-6);
		assertEquals(0, proj.j(), 1e-6);
	}
	
	@Test 
	public void testRotateVector() {
		Vector2d v = new Vector2d(1, 0);
		Vector2d rot = v.rotate(Math.PI/2);
		assertEquals(0, rot.i(), 1e-6);
		assertEquals(1, rot.j(), 1e-6);	
	}
	
	@Test
	public void testRotateTo() {
		Vector2d v = new Vector2d(1,1);
		Vector2d rot = v.rotateTo(0);
		assertEquals(1.414214, rot.i(), 1e-6);
		assertEquals(0, rot.j(), 1e-6);		
	}
	
	@Test
	public void testReverse() {
		Vector2d v = new Vector2d(1,1);
		Vector2d rev = v.reverse();
		assertEquals(-1, rev.i(), 1e-6);
		assertEquals(-1, rev.j(), 1e-6);		
	}
	
	@Test
	public void testEquals() {
		Vector2d v1 = new Vector2d(1, 0);
		Vector2d v2 = new Vector2d(0, 0);
		Vector2d v3 = new Vector2d(0, 1);
		Vector2d v4 = new Vector2d(1, 1);
		int x = 1;
		assertTrue(v1.equals(v1));
		assertTrue(!v1.equals(v2));
		assertTrue(!v1.equals(v3));
		assertTrue(!v1.equals(v4));
		assertTrue(!v1.equals(null));
		assertTrue(v1.hashCode() != v2.hashCode());
		assertTrue(v1.hashCode() == v1.hashCode());
		assertTrue(!v1.equals(x));
	}
	
	@Test
	public void testClone() {
		Vector2d v1 = new Vector2d(1,2);
		Vector2d v2 = v1.clone();
		assertTrue(v2.equals(v1));
		
	}
}


