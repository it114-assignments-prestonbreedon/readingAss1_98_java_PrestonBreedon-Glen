
public class Fan {
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;
	//--------------------------------------------------------Setters and Getters
	
	//speed
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public int getSpeed(){
		return speed;
	}
	//bool on
	public void setOn(boolean on){
		this.on=on;
	}
	public boolean getOn(){
		return on;
	}
	//radius
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	//color
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	//---------------------------------------------------------------------------
	
	//fan constructor
	public Fan(){
		speed=FAST;
		on=true;
		radius=10;
		color="Purple";
	}
	//to string method
	public String toString(){
		String fanState;
		if (on){
			fanState= "The Fan is on." + " Speed is: " +speed + ", ";
		}
		else{
			fanState="The Fan is off. ";
		}
		return fanState + "Color is: " + color+ ", "+ "Radius is: " + radius + ".";
	}
}
