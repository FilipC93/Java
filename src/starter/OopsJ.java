package starter;

public class OopsJ {

	public static void main(String[] args) {
		CarsOop myDreamCar = new CarsOop("Mercedes-Benz", "SLS-AMG", 2021, "black-matte", 350.000);
		CarsOop myCurrentCar = new CarsOop("Mazda", "MX-5", 2010, "white", 25000);

		System.out.println(myDreamCar.maker);
		System.out.println(myDreamCar.model);
		System.out.println(myCurrentCar.maker);
		System.out.println(myCurrentCar.model);
		
		myCurrentCar.drive();

	}
}
