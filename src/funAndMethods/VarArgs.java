package funAndMethods;

import java.util.Arrays;

public class VarArgs {
	
	public static void main(String[] args) {
		
		System.out.println(nums(1,2,3,4,5,6));
		multiples(1,2,3,4);
	}
	
	static String nums(int ...v) {
		return Arrays.toString(v);
	}
	
	static void multiples(int a, int b, int ...c) {
		System.out.println(Arrays.toString(c));
	}

}
