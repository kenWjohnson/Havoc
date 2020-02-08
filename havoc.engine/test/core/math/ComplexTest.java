package core.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	public void testDefaultConstructor() {
		Complex z = new Complex(1, 1);
		assertEquals(1, z.real(), 1e-6);
		assertEquals(1, z.imag(), 1e-6);
	}

	@Test
	public void testGetReal() {
		Complex z = new Complex(1, 1);
		assertEquals(1, z.real(), 1e-6);
	}
	
	@Test
	public void testGetImag() {
		Complex z = new Complex(1, -1);
		assertEquals(-1, z.imag(), 1e-6);
	}
	
	@Test
	public void testToString() {
		Complex z1 = new Complex(1, 0);
		Complex z2 = new Complex(0, 1);
		Complex z3 = new Complex(1, -1);
		Complex z4 = new Complex(1, 1);

		assertEquals("1.000", z1.toString());
		assertEquals("1.000i", z2.toString());
		assertEquals("1.000 - 1.000i", z3.toString());
		assertEquals("1.000 + 1.000i", z4.toString());
	}
	
	@Test
	public void testAdd() {
		Complex z1 = new Complex(1, 0);
		Complex z2 = new Complex(0, 1);
		Complex diff = z1.add(z2);
		assertEquals(1, diff.real(), 1e-6);
		assertEquals(1, diff.imag(), 1e-6);	
	}
	
	@Test
	public void testSubtract() {
		Complex z1 = new Complex(1, 0);
		Complex z2 = new Complex(0, 1);
		Complex diff = z1.subtract(z2);
		assertEquals(1, diff.real(), 1e-6);
		assertEquals(-1, diff.imag(), 1e-6);	
	}
	
	@Test
	public void testAbs() {
		Complex z = new Complex(3, 4);
		assertEquals(5, z.abs(), 1e-6);
	}
	
	@Test
	public void testPhase() {
		Complex z = new Complex(3, 4);
		assertEquals(0.643501, z.phase(), 1e-6);
	}
	
	@Test
	public void testMultiply() {
		Complex z1 = new Complex(1, 0);
		Complex z2 = new Complex(0, 1);
		Complex prod = z1.multiply(z2);
		assertEquals(0, prod.real(), 1e-6);
		assertEquals(1, prod.imag(), 1e-6);	
	}
	
	@Test
	public void testScale() {
		Complex z = new Complex(1, 1);
		Complex scaled = z.scale(3);
		assertEquals(3, scaled.real(), 1e-6);
		assertEquals(3, scaled.imag(), 1e-6);	
	}
	
	@Test
	public void testConjugate() {
		Complex z = new Complex(1, 1);
		Complex conj = z.conjugate();
		assertEquals(1, conj.real(), 1e-6);
		assertEquals(-1, conj.imag(), 1e-6);	
	}
	
	@Test
	public void testReciprocal() {
		Complex z = new Complex(1, 1);
		Complex rec = z.reciprocal();
		assertEquals(0.5, rec.real(), 1e-6);
		assertEquals(-0.5, rec.imag(), 1e-6);	
	}
	
	@Test
	public void testDivide() {
		Complex z1 = new Complex(1, 1);
		Complex z2 = new Complex(1, 1);
		Complex quot = z1.divide(z2);
		assertEquals(1, quot.real(), 1e-6);
		assertEquals(0, quot.imag(), 1e-6);	
	}

	@Test
	public void testExp() {
		Complex z = new Complex(1, 1);
		Complex sol = z.exp();
		assertEquals(1.468693, sol.real(), 1e-6);
		assertEquals(2.287355, sol.imag(), 1e-6);	
	}
	
	@Test
	public void testCos() {
		Complex z = new Complex(1, 1);
		Complex sol = z.cos();
		assertEquals(0.833730, sol.real(), 1e-6);
		assertEquals(-0.988898, sol.imag(), 1e-6);	
	}
	
	@Test
	public void testSin() {
		Complex z = new Complex(1, 1);
		Complex sol = z.sin();
		assertEquals(1.298457, sol.real(), 1e-6);
		assertEquals(0.634963, sol.imag(), 1e-6);	
	}
	
	@Test
	public void testTan() {
		Complex z = new Complex(1, 1);
		Complex sol = z.tan();
		assertEquals(0.271752, sol.real(), 1e-6);
		assertEquals(0.392180, sol.imag(), 1e-6);	
	}
	
	@Test
	public void testStaticAdd() {
		Complex sum = Complex.add(new Complex(1, 1), new Complex(1, 1));
		assertEquals(2, sum.real(), 1e-6);
		assertEquals(2, sum.imag(), 1e-6);			
	}
	
	@Test
	public void testStaticSubtract() {
		Complex sum = Complex.subtract(new Complex(1, 1), new Complex(1, 1));
		assertEquals(0, sum.real(), 1e-6);
		assertEquals(0, sum.imag(), 1e-6);			
	}
	
	@Test
	public void testEqualPoints() {
		Complex z1 = new Complex(1, 1);
		Complex z2 = new Complex(1, 1);
		assertTrue(z1.equals(z2) && z2.equals(z1));
		assertTrue(z1.hashCode() == z2.hashCode());
	}
}
