package core.math;

import static java.lang.Math.*;

import java.util.Objects;

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

	 public static Vector2d toCartesion(double magnitude, double direction) {
		 return new Vector2d(magnitude*cos(direction),magnitude*sin(direction));
	 }
	 
	 public double i() {return i;}
	 public double j() {return j;}
	 public double magnitude() {return hypot(i,j);}
	 public double direction() {return atan2(j,i);}
	 
	 public String toString() {
		 return String.format("[%.3fi, %.3fj]", i, j);
	 }
	 
	 public Vector2d normalize() {
		 return new Vector2d( i / magnitude(), j / magnitude());
	 }

	 public Vector2d add(double vi, double vj) {
		 
		 return new Vector2d(this.i + vi, this.j+vj);
	 }
	 
	 public Vector2d add(Vector2d v ) {
		 return new Vector2d(this.i + v.i(), this.j + v.j());
	 }

	 public static Vector2d add(Vector2d v1, Vector2d v2) {
		 return new Vector2d(v1.i() + v2.i(), v1.j() + v2.j());
	 }
	 
	 public Vector2d subtract(double vi, double vj) {
		 return new Vector2d(this.i - vi, this.j - vj);
	 }
	 
	 
	 
	 public Vector2d subtract(Vector2d v) {
		 return new Vector2d(this.i - v.i(), this.j - v.j());
	 }
	 
	 
	 public static Vector2d subtract(Vector2d v1, Vector2d v2) {
		 return new Vector2d(v1.i() - v2.i(), v1.j() - v2.j());
	 }
	 
	 
	 public Vector2d scale(double alpha) {
		 return new Vector2d(alpha * i, alpha * j);
	 }
	 

	 public double dot(double vi, double vj){
		 return this.i * vi + this.j * vj;
	 }
	 
	 
	 public double dot(Vector2d v){
		 return this.i * v.i() + this.j * v.j();
	 }
	 
	 
	 public static double dot(Vector2d v1, Vector2d v2) {
		 return v1.i()*v2.i() + v1.j()*v2.j();
	 }
	 
	 
	 public double project(double vi, double  vj) {
		 return dot(vi, vj) / magnitude();
	 }
	 

	 public double project(Vector2d v) {
		 return dot(v) / magnitude();
	 }
	 
	 
	 public static double project(Vector2d v1, Vector2d v2) {
		 return dot(v1, v2) / v1.magnitude();
	 }
	 
	 
	 public Vector2d projectedVector(double vi, double vj) {
		 return  normalize().scale(project(vi, vj));
	 }
	 
	 
	 public Vector2d projectedVector(Vector2d v) {
		 return  normalize().scale(project(v));
	 }
	 
	 
	 public static Vector2d projectedVector(Vector2d v1, Vector2d v2) {
		 return  v1.normalize().scale(project(v1, v2));
	 }
	 
	 
	 public Vector2d rotate(double angle) {
		 return new Vector2d(i*cos(angle) - j*sin(angle), i*sin(angle) + j*cos(angle));
	 }
	 
	 
	 public Vector2d rotateTo(double angle) {
		 return Vector2d.toCartesion(magnitude(), angle);
	 }
	 
	 
	 public Vector2d reverse() {
		 return new Vector2d(-i, -j);
	 }
	 

	 public boolean equals(Object obj) {
		 if (obj == null) return false;
	     if (this.getClass() != obj.getClass()) return false;
	     Vector2d that = (Vector2d) obj;
	     return (this.i == that.i) && (this.j == that.j);
	    }
	 
	 
	 public int hashCode() {
	     return Objects.hash(i, j);
	 }
	 
	 
	 public Vector2d clone() {
	    return new Vector2d(i, j);
	 }
}
