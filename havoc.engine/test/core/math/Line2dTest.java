package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Line2dTest {

	@Test
	void testDistanceFromLine1() {
		Line2d l = new Line2d(1, 1, 0, 0);
		assertEquals(0.707106, l.distanceTo(1, 2), 1e-6);
	}

	@Test
	void testDistanceFromLine2() {
		Line2d l = new Line2d(4, 2, 8, -1);
		assertEquals(1.2, l.distanceTo(-2, 5), 1e-6);
	}
	
	@Test
	void testToString() {
		Line2d l = new Line2d(4, 2, 8, -1);
		assertEquals("y=-0.750x+5.000", l.toString());
	}
	
	
	@Test
	void testDistanceFromLine3() {
		Line2d l = new Line2d(134, -982, -314, -156);
		assertEquals("y=-1.844x-734.938", l.toString());
		assertEquals(578.432759, l.distanceTo(-34, 541), 1e-6);
	}
}
