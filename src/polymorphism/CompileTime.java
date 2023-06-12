package polymorphism;

public class CompileTime {
	
	public void game(String name) {
		System.out.println("Playing cricket");
	}
	
	public void game(int score){
		System.out.println("100runs scored");
	}
	
	public void box(int size, String color) {
		System.out.println("Black color");
	}
	
	public void box(String size, int color) {
	}
}
