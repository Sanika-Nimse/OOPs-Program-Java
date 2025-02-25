
public class Volume {
	public static void volume(int len, int bre, int hei) {
		System.out.println("The volume of rectangular box is : "+(len*bre*hei));
	}
	public static void volume(float radius, int hei) {
		System.out.println("The volume of Cylinder is:-" + (3.14f*radius*radius*hei));
	}
	public static void volume(float radius) {
		System.out.println("The Volume of Sphere is:-"+ (4/3*3.14f*radius*radius));
	}
	
	public static void main(String[]args) {
		volume(23,55,66);
		volume(4f,7);
		volume(5f);
	}
}
