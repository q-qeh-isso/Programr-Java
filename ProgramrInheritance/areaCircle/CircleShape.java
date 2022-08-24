package areaCircle;

public abstract class CircleShape {
	public double radius;   

	public CircleShape() {   
	}   

	public CircleShape(double radius) {   
		this.radius = radius;   
	}   

	public void setradius(double radius) {   
		this.radius = radius;   
	}   

	public String toString() {   
		return "Radius " + radius;   
	}   

	abstract String getDisplayText();   
}
