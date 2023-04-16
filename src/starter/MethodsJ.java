package starter;

public class MethodsJ {

	public static void main(String[] args) {
		hello("Chad", 40);
		add(45, 90);
	}

	static void hello(String x, int z) {
		System.out.println("Hello " + x + z);
	}

	static int add(int num1, int num2) {
		return num1 + num2;
	}
}
