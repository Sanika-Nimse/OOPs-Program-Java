
public class Main {
	public static void show(Vehicle v1) {
		v1.start();
	}
	public static void main(String[]Args) {
		Aeroplane a1 = new Aeroplane();
		Car c1= new Car();
		Bike b1= new Bike();
		show(c1);
		show(b1);
		show(a1);
	}
	
}
