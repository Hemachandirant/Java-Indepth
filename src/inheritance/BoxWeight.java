package inheritance;

public class BoxWeight extends Box{
	
	String BoxName;
	
	BoxWeight(double square){
		super(square);
		
	}

	BoxWeight(String name, double length, double width, double weight){
		super(length, width, weight);
		this.BoxName = name;
	}
	
	public void weightInfo() {
		System.out.println("This is from Boxweight class");
	}
	

}
