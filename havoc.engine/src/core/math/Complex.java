package core.math;

import java.util.Objects;

public class Complex {
	private final double re;
	private final double im;
	
	public Complex(double real, double imag) {
		re = real;
		im = imag;
	}
	
	public double real() {return re;}
	public double imag() {return im;}
	
	public String toString() {
		if(im == 0) return String.format("%.3f", re);
		if(re == 0) return String.format("%.3fi", im);
		if(im < 0) return String.format("%.3f - %.3fi", re, -im);
		return String.format("%.3f + %.3fi", re, im);
	}
	
	public double abs() {
		return Math.hypot(re, im);
	}
	
	public double phase() {
		return Math.atan2(re, im);
	}
	
	public Complex add(Complex b) {
		Complex a = this;
		double real = a.re + b.re;
		double imag = a.im + b.im;
		return new Complex(real, imag);
	}
	
	public Complex subtract(Complex b) {
		Complex a = this;
		double real = a.re - b.re;
		double imag = a.im - b.im;
		return new Complex(real, imag);	
	}
	
	public Complex multiply(Complex b) {
		Complex a = this;
		double real = a.re * b.re - a.im * b.im;
		double imag = a.re * b.im - a.im * b.im;
		return new Complex(real, imag);	
	}
	
	public Complex scale(double aplha) {
		return new Complex(aplha * re, aplha * im);
	}
	
	public Complex conjugate() {
		return new Complex(re, -im);
	}
	
	public Complex reciprocal() {
	    double scale = re*re + im*im;
	    return new Complex(re / scale, -im / scale);	
	}
	
    public Complex divide(Complex b) {
        Complex a = this;
        return a.multiply(b.reciprocal());
    }
	
    public Complex exp() {
        return new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
    }

    public Complex sin() {
        return new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
    }
    
    public Complex cos() {
        return new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
    }
    
    public Complex tan() {
        return sin().divide(cos());
    }

    public static Complex add(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }
    
    public static Complex subtract(Complex a, Complex b) {
        double real = a.re - b.re;
        double imag = a.im - b.im;
        Complex diff = new Complex(real, imag);
        return diff;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Complex that = (Complex) obj;
        return (this.re == that.re) && (this.im == that.im);
    }
    
    public int hashCode() {
        return Objects.hash(re, im);
    }
    
    public Complex clone() {
    	return new Complex(re, im);
    }

}

	
