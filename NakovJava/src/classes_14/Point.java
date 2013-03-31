package classes_14;

public class Point {

	private double[] coordinates;
	
	public Point(final double x, final double y){
		this.coordinates = new double[2];
		
		this.coordinates[0] = x;
		this.coordinates[1] = y;
	}
	
	public Point(){
		this(0.0d, 0.0d);
	}
	
	public void setX(final double x){
		this.coordinates[0] = x;
	}
	
	public double getX(){
		return this.coordinates[0];
	}
	
	public void setY(final double y){
		this.coordinates[1] = y;
	}
	
	public double getY(){
		return this.coordinates[1];
	}
	
	public void showPoint(){
		System.out.println("The point is with coordinates: " 
					+ this.coordinates[0] + ", " + this.coordinates[1]);
	}
}
