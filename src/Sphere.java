/**
 * Sphere.java
 * 
 * This class models a Sphere with radius and calculates the
 * Volume and Surface Area of said Sphere Object.
 */

/**
 * Programming Project 2
 * @author jkiper
 * CS131-01
 * Spring 2019
 */
public class Sphere {
	
	private double radius;

	/**
	 * Empty-argument constructor to put 
	 * Sphere object into a consistent state.
	 */
	public Sphere() {
		radius = 0.0;
	}//end empty-argument constructor
	
	
	/**
	 * Preferred Constructor accepts the 
	 * radius of the Sphere.
	 * @param radius
	 */
	public Sphere(double radius) {
		
		this.setRadius(radius);
		
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
	 * Getter for Volume
	 * @return
	 */
	public double getVolume(){
		return 4.0*Math.PI*radius*radius*radius/3.0;
	}//end getVolume
	
	
	/**
	 * Getter for Surface Area
	 * @return
	 */
	public double getSurfaceArea(){
		return 4.0*Math.PI*radius*radius;
	}//end getVolume

	
	@Override
	public String toString() {
		return "Sphere [radius" + radius + "]";
	}//end toString
}
