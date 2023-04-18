package starter;

public class CarsOop {
	String maker;
	String model;
	int year;
	String color;
	double price;
	Object drive;
	Object breaking;

	public CarsOop(String maker, String model, int year, String color, double price) {
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	void drive() {
		System.out.println("You're driving the "+ this.model+ " right now.");
	}

	void breaking() {
		System.out.println("You're stepping on the brakes");
	}
}
