package classAndObjects;

public class Main {
	
	public static void main(String[] args) {
		greetings();
		Main main = new Main();
		main.greeting();
		
	}
	static void greetings() {
		System.out.println("Im in static method");
	}
	void greeting() {
		greetings();
		fun();
		System.out.println("Im in non-static method");
	}
	
	void fun() {
		System.out.println("Im at non - static fun method");
	}

}
