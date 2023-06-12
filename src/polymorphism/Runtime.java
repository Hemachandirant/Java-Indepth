package polymorphism;

public class Runtime {
	
	public void company() {
		System.out.println("This is an electricity company");
	}

	
	static class B extends Runtime {
	
		@Override
		public void company() {
			System.out.println("This is an electrical company");
		}
	}

	public static void main(String[] args) {
		B b = new B();
		b.company();
	}
}
