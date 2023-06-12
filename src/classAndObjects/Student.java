package classAndObjects;

public class Student {
	
	@SuppressWarnings("unused")
	private int rollno;
	@SuppressWarnings("unused")
	private float marks;
	private String dept;
	
	
	
	Student(){
		//calling a constructor from another constructor
		this(18,89.3f,"Mechatronics");
	}
	Student(int rollno, float marks, String dept){
		this.rollno = rollno;
		this.marks = marks;
		this.dept = dept;
		
	}
	
	public static void main(String[] args) {
		
		Student student = new Student(1,12.3f,"IT");
		Student student1 = new Student();
		System.out.println(student.dept);
		System.out.println(student1.dept);
	}

}
