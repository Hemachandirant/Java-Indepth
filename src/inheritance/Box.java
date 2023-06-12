package inheritance;

public class Box {
	
	double length;
	double width;
	double weight;
	
	Box(){
		this.length = -1;
		this.width = -1;
		this.weight =  -1;
	}
	
	Box(double length, double width, double weight){
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	Box(double square){
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	Box(Box box){
		this.length = box.length;
		this.width = box.width;
		this.weight = weight;
	}

	public void info() {
		System.out.println("This is the Box (Parent) class");
	}
}
