package core.math;

import static java.lang.Math.*;

import java.util.Objects;

public class Point3d {

	private final double x;
	private final double y;
	private final double z;

		
	public Point3d() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
		
	public Point3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double x() {return x;}
	public double y() {return y; }
	public double z() {return z; }
	public double r() {return sqrt(x*x + y*y +z*z);}
	public double theta() {return atan2(y, x);}
	public double phi() {return atan2(sqrt(x*x + y*y), z); }

	
	public String toString() {
		return String.format("(%.3f, %.3f, %.3f)", x, y, z);
	}

	public String toStringPolar() {
		return String.format("(%.3f, %.3f, %.3f)", r(), theta(), phi());
	}
		
	public double distanceTo(Point3d that) {
		double dx = this.x - that.x;
	    double dy = this.y - that.y;
	    double dz = this.z - that.z;
	    
	    return Math.sqrt(dx*dx + dy*dy + dz + dz);
	}
		
	public boolean equals(Object obj) {
		if(obj == null) return false;
	    if (this.getClass() != obj.getClass()) return false;
	    Point3d that = (Point3d) obj;
	    return (this.x == that.x) && (this.y == that.y) && (this.z == that.z);
	}
		
	public int hashCode() {
		return Objects.hash(x, y, z);
	}
	
    public Point3d clone() {
    	return new Point3d(x, y, z);
    }
	
}


