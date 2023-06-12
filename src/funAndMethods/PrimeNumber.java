package funAndMethods;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(!isPrime(num)) {
			System.out.println("Not prime");
		}else
			System.out.println("Prime");
//		System.out.println(isPrime(num));
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		else {
			for(int i = 2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
				
			}
			return true;
		}
	}

}
