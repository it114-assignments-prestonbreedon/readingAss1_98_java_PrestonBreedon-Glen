public class Main {

	public static void main(String[] args) {
//creating fan1		
		Fan fan1 = new Fan();
		fan1.setColor("yellow");
		fan1.setOn(true);
		fan1.setRadius(10);
		fan1.setSpeed(Fan.FAST);
//creating fan2
		Fan fan2 = new Fan();
		fan2.setColor("blue");
		fan2.setOn(false);
		fan2.setRadius(5);
		fan2.setSpeed(Fan.MEDIUM);
		
		System.out.println(fan1);
		System.out.println(fan2);
	}

}