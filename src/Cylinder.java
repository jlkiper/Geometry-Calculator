/**
 * Cylinder.java
 * 
 * This class models a Cylinder with radius and calculates the
 * Volume and Surface Area of said Cylinder Object.
 */

/**
 * Programming Project 2
 * @author jkiper
 * CS131-01
 * Spring 2019
 */
public class Cylinder {

	private double radius;
	private double height;
	
	/**
	 * Empty-argument constructor to put 
	 * Cylinder object into a consistent state.
	 */
	public Cylinder() {
		radius = 0.0;
		height = 0.0;
	}//end empty-argument constructor
	
	
	/**
	 * Preferred Constructor accepts the 
	 * radius and height of the Cylinder.
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius,double height) {
		
		this.setRadius(radius);
		this.setHeight(height);
		
	}//end preferred constructor
	
	
	/**
	 * Setter for radius
	 * Checks the bounds so 
	 * @param radius
	 */
	public void setRadius(double radius) {
		if(radius<0)
			this.radius = 0;
		else
			this.radius = radius;
	}//end setRadius
	
	
	/**
	 * Getter for radius
	 * @return
	 */
	public double getRadius() {
		return radius;
	}//end getRadius

	
	/**
	 * Setter for height
	 * Checks the bounds so 
	 * @param height
	 */
	public void setHeight(double height) {
		if(height<0)
			this.height = 0;
		else
			this.height = height;
	}//end setHeight
	
	
	/**
	 * Getter for height
	 * @return
	 */
	public double getHeight() {
		return height;
	}//end getHeight
		
	
	/**
	 * Getter for Volume
	 * @return
	 */
	public double getVolume(){
			return Math.PI*Math.pow(radius,2)*height;
	}//end getVolume
		
	
	/**
	 * Getter for Surface Area
	 * @return
	 */
	public double getSurfaceArea(){
			return (2.0*Math.PI*radius*height)+(2.0*Math.PI*Math.pow(radius,2));
	}//get getSurfaceArea
	
	
	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}//end toString
	
}