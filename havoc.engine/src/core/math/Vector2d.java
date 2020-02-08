package core.math;

import static java.lang.Math.*;

public class Vector2d {
	private final double i;
	private final double j;
	
	 Vector2d(double x, double y){
		 i = x;
		 j = y;
	 }
	 
	 Vector2d(Point2d point) {
		 i = point.x();
		 j = point.y();
	 }
	 
	 Vector2d(double x1, double y1, double x2, double y2){
		 i = x2 - x1;
		 j = y2 - y1;
	 }
	 
	 Vector2d(Point2d from, Point2d to){
		 i = to.x() - from.x();
		 j = to.y() - from.y();
	 }

	 public static Vector2d toCartesion(double magnitude, double angle) {
		 return new Vector2d(magnitude*cos(angle),magnitude*sin(angle));
	 }
	 
	 public double i() {return i;}
	 public double j() {return j;}
	 
	 
	 
}
