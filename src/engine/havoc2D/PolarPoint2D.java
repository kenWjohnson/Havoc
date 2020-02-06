package engine.havoc2D;

import static java.lang.Math.*;

//TODO: Add functions for convert r and theta to x and y

public class PolarPoint2D extends Point2D {
	final private int MAXTHETA = 360;
	final private int MINANGLE = 0;
	final private int MINR = 0;
	
	private double r = 0;
	private double theta = 0;
	
	
	public PolarPoint2D() {}
	
	public PolarPoint2D(PolarPoint2D point) {
		r = point.getR();
		theta = point.getTheta();
		calculateXYPoint();

	}
	
	public PolarPoint2D(double rIn, double thetaIn) {		

		if (rIn < MINR) {
			rIn = abs(rIn);
			System.out.println(thetaIn);
			thetaIn += MAXTHETA/2;
			System.out.println(thetaIn);

		}

		theta = normalize(thetaIn);
		System.out.println(thetaIn);

		r = rIn;
		calculateXYPoint();
	}

	public double getTheta() {
		return theta;
	}
	
	public double getR() {
		return r;
	}
	
	public double findDistanceTo(PolarPoint2D p) {
		double angleDiffinRads = toRadians(p.getTheta() - theta);
		return sqrt(r*r + p.getR()*p.getR() - 2*r*p.getR()*cos(angleDiffinRads));
	}
	
	public String toString() {
		return String.format("(%.3f, %.3f)", r, theta);
	}
	
	private double normalize(double degree) {
		
		degree = degree % MAXTHETA;
		
		if(degree < MINANGLE) {
			degree += MAXTHETA;
		}
		
		return degree;
	}

	private void calculateXYPoint() {
		x = r*cos(theta);
		y = r*sin(theta);
	}
}
