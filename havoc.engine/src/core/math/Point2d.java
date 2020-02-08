package core.math;

import static java.lang.Math.*;

import java.util.Objects;

public class Point2d {
	private final double x;
	private final double y;

	public Point2d() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2d(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double x() {return x;}
	public double y() {return y; }
	public double r() {return hypot(x, y);}
	public double theta() {return atan2(y, x);}

	public String toString() {
		return String.format("(%.3f, %.3f)", x, y);
	}

	public String toStringPolar() {
		return String.format("(%.3f, %.3f)", r(), theta());
	}
	
	public double distanceTo(Point2d that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
	}
	
	public Point2d translate(double x, double y) {
		return new Point2d(this.x + x, this.y +y);
	}

	public Point2d rotate(double deg) {
		deg = toRadians(deg);
		double xp = x*cos(deg) - y*sin(deg);
		double yp = x*sin(deg) + y*cos(deg);
		return new Point2d(xp, yp);

	}

	
	public boolean equals(Object obj) {
		if(obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Point2d that = (Point2d) obj;
        return (this.x == that.x) && (this.y == that.y);
	}
	
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    public Point2d clone() {
    	return new Point2d(x, y);
    }
	
}
