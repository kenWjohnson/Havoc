package engine_.havoc2D;

import static java.lang.Math.*;

public class Point2D {
	protected double x = 0;
	protected double y = 0;

	public Point2D() {}
	
	public Point2D(Point2D point) {
		x = point.x;
		y = point.y;
	}
	
	public Point2D(double xIn, double yIn) {
		x = xIn;
		y = yIn;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double findDistanceTo(Point2D point) {
		double xPart = (point.getX() - x) * (point.getX() - x);
		double yPart = (point.getY() - y) * (point.getY() - y);
		return sqrt(xPart + yPart);
	}
	
	public String toString() {
		return String.format("(%.3f, %.3f)", x, y);
	}
	
}
