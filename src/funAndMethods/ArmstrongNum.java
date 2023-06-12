package funAndMethods;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println(isArmstrong(number));
	}

	private static boolean isArmstrong(int number) {
		int original = number;
		int cube;
		int sum =0;
		
		while(number!=0) {
			int reminder = number%10;
			cube = reminder *reminder*reminder;
			sum = sum +cube;
			number = number/10;
		}
		return sum==original;
		
	}

}
