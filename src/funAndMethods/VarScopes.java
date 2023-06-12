package funAndMethods;

public class VarScopes {
	
	static int YEAR = 2023;  // Global scope
	
	public static void main(String[] args) {
		
		
		int a = 10;  // --> Local scope
		int b = 20;
		
		{
			//int a = 10; A new variables cannot be created int the block because the var a is already 
			// initialized
			
			int c =100;
		}
		int c =1000; // variables decleared previously in the block can be used outside of the scope
	}
	
	static int num() {
		int num = 100; // Local scope
		return num;
	}

}
