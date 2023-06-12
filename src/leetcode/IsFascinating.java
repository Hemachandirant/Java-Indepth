package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsFascinating {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(isFasc(num));
	}
	
	public static boolean isFasc(int num) {
		String concat = String.valueOf(num) + String.valueOf(num*2) + String.valueOf(num*3);
		System.out.println(concat);
		
		if (concat.length() != 9) {
			return false;
		}
		
		Set<Character> letters = new HashSet<>();
		
		for (char c : concat.toCharArray()) {
			if (letters.contains(c)) {
				return false;
			}
			letters.add(c);
		}
		
		return true;
	}
}
