package funAndMethods;


// Overloading --> In a class, two methods with same name and different parameters
// It decides at compile time to which method needs to be called
public class MethodOverload {
	public static void main(String[] args) {
		
		System.out.println(age(12));
		System.out.println(age("mango"));
		
	}
	
	static int age(int age) {
		return age;
	}
	
	static String age(String age) {
		return "Twenty";
	}
	static int num(int num) {
		return num;
	}
	static int num(int num1, int num2) {
		return num1;
	}
}
