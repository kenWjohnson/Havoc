package core.math;

import static java.lang.Math.*;

public class Line2d {
	private final Point2d p1;
	private final Point2d p2;
	
	Line2d(double x1, double y1, double x2, double y2){
		p1 = new Point2d(x1, y1);
		p2 = new Point2d(x2, y2);
	}
	
	Line2d(Point2d p1, Point2d p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String toString() {
		if(b() < 0) return String.format("y=%.3fx-%.3f", slope(), -b());
		return String.format("y=%.3fx+%.3f", slope(), b());
	}
	
	public double length() {
		return p1.distanceTo(p2);
	}
	
	public double distanceTo(double x, double y) {
		double num = abs(-slope()*x + y - b());
		double den = sqrt(slope()*slope() + 1);
		return num/den;
	}
	
	public double distanceTo(Point2d that) {
		double top = abs(-slope() * that.x() + that.y() - b());
		double bot = sqrt(slope() * slope() + 1);
		return top/bot;
	}
	
	public double slope() {
		double dy = p1.y() - p2.y();
		double dx = p1.x() - p2.x();
		return dy/dx;
	}
	
	public double b() {
		return p1.y() - slope()*p1.x();
	}
	
	
	
}
