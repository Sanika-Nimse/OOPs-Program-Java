
public class Worker implements Printable, Playable{

	public void play() {
		System.out.println("Plays Football");		
	}

	public void print() {
		System.out.println("Worker is Printed");
	}

	
	public void show() {
		System.out.println("Showing worker details");
	}
	
		public static void main(String[]args) {
			Worker w1= new Worker();
			w1.print();
			w1.play();
			w1.show();
			
			
		}
}
