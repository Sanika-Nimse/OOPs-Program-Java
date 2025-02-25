
public class Tree {
	int id;
	String name;
	float height;
//if the parameter is same as the instance variable then it is called shodowing of instance field
	public void setId(int id) {
		this.id= id;
	}
	public void setName(String name) {
		this.name= name;
	}
	Tree(int id, String name, float height){
		this.id= id;
		this.name= name;
		this.height= height;
		
	}
	public void setData(){
		this.id =1;
		this.name="Mango";
		this.height=3.5f;
		
		
	}
	public void showData() {
		System.out.println();
		
	}
	

}
