package engine_.havoc2D;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import engine_.havoc2D.PolarPoint2D;

class PolarPoint2DTest extends PolarPoint2D {

	@Test
	void testConstrcutorDefaultPolarPoint() {
		PolarPoint2D point = new PolarPoint2D();		
		assertEquals(0, point.getR());
		assertEquals(0, point.getTheta());
		assertEquals(0, point.getX(), 1e-6);
		assertEquals(0, point.getY(), 1e-6);
	}
	
	@Test
	void testConstrcutorCopytPolarPoint() {
		PolarPoint2D point1 = new PolarPoint2D();
		PolarPoint2D point2 = new PolarPoint2D(point1);
		assertEquals(point1.getR(), point2.getR());
		assertEquals(point1.getTheta(), point2.getTheta());

	}
	
	@Test
	void testConstrcutorArgsPolarPoint() {
		PolarPoint2D point = new PolarPoint2D(1, 45);
		assertEquals(1, point.getR());
		assertEquals(45, point.getTheta());
		assertEquals(0.707, point.getX(), 1e-6);
		assertEquals(0.707, point.getY(), 1e-6);
	}

	@Test
	void testGetRPositive() {
		PolarPoint2D point = new PolarPoint2D(1, 0);
		assertEquals(1, point.getR());
	}
	
	@Test
	void testGetRNegative1() {
		PolarPoint2D point = new PolarPoint2D(-1, 0);
		assertEquals(1, point.getR());
	}
	
	@Test
	void testGetRNegative2() {
		PolarPoint2D point = new PolarPoint2D(-1, 180);
		assertEquals(1, point.getR());
		assertEquals(0, point.getTheta());
	}
	
	@Test
	void testGetTheta() { 
		PolarPoint2D point = new PolarPoint2D(1, 45);
		assertEquals(45, point.getTheta());
	}
	
	@Test
	void testThetaLargerThan360() {
		PolarPoint2D point = new PolarPoint2D(0, 361);
		assertEquals(1, point.getTheta());
	}
	
	@Test
	void testThetaNegative() {
		PolarPoint2D point = new PolarPoint2D(0, -45);
		assertEquals(315, point.getTheta());
	}
	
	@Test
	void testRNegativeAndThetaNegative1(){
		PolarPoint2D point = new PolarPoint2D(-1, -180);
		assertEquals(1, point.getR());
		assertEquals(0, point.getTheta());
	}
	
	@Test
	void testRNegativeAndThetaPositivee2(){
		PolarPoint2D point = new PolarPoint2D(-1, 180);
		assertEquals(1, point.getR());
		assertEquals(0, point.getTheta());
	}

	@Test
	void testFindDistanceTo1() {
		PolarPoint2D p1 = new PolarPoint2D(1, 30);
		PolarPoint2D p2 = new PolarPoint2D(6, 135);
		assertEquals(6.332916, p1.findDistanceTo(p2), 1e-6);
	}

	@Test
	void testFindDistanceTo2() {
		PolarPoint2D p1 = new PolarPoint2D(2, -65);
		PolarPoint2D p2 = new PolarPoint2D(9, 85);
		assertEquals(10.778539, p1.findDistanceTo(p2), 1e-6);
	}
	
	@Test
	void testFindDistanceTo3() {
		PolarPoint2D p1 = new PolarPoint2D(-3,  142);
		PolarPoint2D p2 = new PolarPoint2D(10, -88);
		assertEquals(8.392421, p1.findDistanceTo(p2), 1e-6);
	}

	@Test
	void testToString1() {
		PolarPoint2D p = new PolarPoint2D();
		assertEquals("(0.000, 0.000)", p.toString());
	}
	
	@Test
	void testToString2() {
		PolarPoint2D p = new PolarPoint2D(54823.245525,156.254258);
		assertEquals("(54823.246, 156.254)", p.toString());
	}
	
	@Test
	void testToString3() {
		PolarPoint2D p = new PolarPoint2D(141.15415, 65.9966);
		assertEquals("(141.154, 65.997)", p.toString());
	}

}