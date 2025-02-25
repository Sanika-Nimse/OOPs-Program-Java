
public class Doctor {
	int did;
	String name;
	static String hospitalname;
	
	static void setHospitalName() {
		hospitalname="Super Hospital ";
	}
	//Static block gets call automatically before main method gets called
	static {
		System.out.println("I'm in Static block ");
	}
	Doctor(int did, String name){
		this.did= did;
		this.name= name;
	}
	public String toString() {
		return "Doctor ID: "+ did + "Name: "+ name +"  "+hospitalname;
	}
	public static void main(String[]args) {
		Doctor.setHospitalName();
		Doctor d1 = new Doctor(103,"Dr.Patil");
		System.out.println(d1);
	} 
}
