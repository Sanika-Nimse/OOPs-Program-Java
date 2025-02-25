//constructor chaining 
public class Medicine {
	String name;
	float price;
	
	Medicine(){
		this("Crocin");
	}
	Medicine(String name){
		this(name,20.0f);
		//this will call then constructor which have the string and float argument
	}
	Medicine(String name, float price){
		this.name= name;
		this.price= price;
		
	}
	public String  toString(){
		return "Medicine name: "+ name+ "Price: "+ price;	
	}
	public static void main(String[]args) {
		Medicine M1 = new Medicine();
				System.out.println(M1);
	}
	
}
