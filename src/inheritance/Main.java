package inheritance;

public class Main {

	public static void main(String[] args) {
	
		Box box = new Box();
		System.out.println(box.length);
		Box box1 = new Box(12.0,23.0,22.2);
		System.out.println(box1.length);
			
		BoxWeight weight = new BoxWeight("BigBoz", 23,10, 34);
		System.out.println(weight.BoxName);
		
		// accessing parent class properties by referncing the Box type to boxweight object
		
		Box box4 = new BoxWeight(12.9);
		//System.out.println(box4.length);
		//System.out.println(box4.weightInfo());  -- cant able to access boxweight properties from box type ref
		

	}

}
