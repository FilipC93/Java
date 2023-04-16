package starter;

import java.util.*;

public class TwoDArrayLists {
	public static void main(String[] args) {

		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("bread");
		bakeryList.add("pasta");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("cucumber");
		produceList.add("peppers");

		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("cola");
		drinkList.add("water");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0).get(1));
	}
}
