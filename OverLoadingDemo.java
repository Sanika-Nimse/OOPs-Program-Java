
public class OverLoadingDemo {
	public static void area(int len, int bre) {
		System.out.println("Area of Rectangle:-"+(len*bre));
	}
	public static void area(float radius) {
		System.out.println("Area of Circle:-"+(3.14f*radius*radius));
	}
	public static void main(String[]args) {
		area(5,7);
		area(4.5f);
	}
}
