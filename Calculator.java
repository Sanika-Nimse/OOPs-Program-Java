
public class Calculator {
	public static void sum(int a, int b) {
		System.out.println("The sum of integer is :-"+ (a+b));
	}
	public static void sum(String a, String b) {
		System.out.println("The String concatenation:-"+(a+b));
	}
	public static void sum(float a, float b, float c) {
		System.out.println("The sum of float is:-"+(a+b+c));
	}
	public static void main(String[]args) {
		sum(12, 24);
		sum("Hello","World");
		sum(12.4f,34.5f,22.5f);
	}
}
