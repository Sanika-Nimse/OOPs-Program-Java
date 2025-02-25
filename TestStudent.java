
public class TestStudent {
	public static void main(String[] args) { 
		  SchoolStudent s1 = new SchoolStudent(); 
		  s1.setRoll(101); 
		  s1.setName("Rohit Pawar"); 
		  s1.setStd(7); 
		  s1.setMarks(95); 
		   
		  CollegeStudent s2 = new CollegeStudent(); 
		  s2.setRoll(103); 
		  s2.setName("Sham Patil"); 
		  s2.setYear(4); 
		  s2.setBranch("BE Comp"); 
		  s2.setMarks(67); 
		   
		  System.out.println("School Student Details: "); 
		  System.out.println("Roll: " + s1.getRoll()); 
		  System.out.println("School Std." + s1.getStd()); 
		  System.out.println("Name : " + s1.getName()); 
		  System.out.println("Marks :  "+ s1.getMarks()); 
		   
		   
		  System.out.println("College Student Details: "); 
		  System.out.println("Roll: " + s2.getRoll()); 
		  System.out.println("College Year" + s2.getYear()); 
		  System.out.println("College branch : " + s2.getBranch()); 
		  System.out.println("Name : " + s2.getName()); 
		  System.out.println("Marks :  "+ s2.getMarks()); 
		   
		 } 
}
