package classAndObjects;

public class Swapping{
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		swap(a, b);
		//System.out.println(a + " " + b);
		SwapWithTemp(a, b);
		System.gc();
	}
	
	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		
		// Print the swapped values to verify within the method
		System.out.println(a + " " + b);
	}
	
	static void SwapWithTemp(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a+" "+b);
	}
}
