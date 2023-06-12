package swtichAndNestedIf;
import java.util.*;

public class NestedSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int empId = sc.nextInt();
		String department = sc.next();
		
		switch(empId) {
		case 1 -> System.out.println("Hemchandiran");
		case 2 -> System.out.println("Kunal");
		case 3 -> {System.out.println("Employee 3");
			switch(department) {
			case "IT" -> System.out.println("IT deparment");
			case "Mechanical" -> System.out.println("Mechanical department");
			}
		}
	
		default -> System.out.println("Enter a valid department");
		}
	}

}
