package classAndObjects;

public class StaticBlock {
	
	static int a = 4;
	static int b = 5;
	
	static { // static block will be loaded only once when a class is loaded
		System.out.println("This is a static block");
	}
	
	public static void main(String[] args) {
		
		//StaticBlock block = new StaticBlock();
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
		
		StaticBlock.a+=4;
		
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
		
		
	}
	
	
	}


