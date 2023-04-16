package starter;

import java.util.ArrayList;

public class ArrLists {

	public static void main(String[] args) {
		// ArrayLists only store reference data-types.
		// Elements can be added and removed after compilation phase.

		ArrayList<String> food = new ArrayList<String>();
		food.add("lasagna");
		food.add("pasta");
		food.add("gyros");

		// on ArrayLists, size === length for arrays
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}

		food.set(2, "sushi");
		System.out.println(food.get(2));
		food.clear();
	}
}
