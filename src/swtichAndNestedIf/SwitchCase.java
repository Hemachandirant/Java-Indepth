package swtichAndNestedIf;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		
		switch(fruit) {
		
		case "Apple":
			System.out.println("Red fruit");
			break;
		case "Mango":
			System.out.println("King of fruits");
			break;
		case "Papaya":
			System.out.println("Very tasty");
			break;
		default:
			System.out.println("Enter a valid fruit name");
		}
		
	}
}
