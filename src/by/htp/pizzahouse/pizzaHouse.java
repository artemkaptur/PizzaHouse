package by.htp.pizzahouse;

import java.util.Arrays;
import java.util.Scanner;

public class pizzaHouse {

	public String choosePizza() {
		// In this method user choosing one of four possible pizza
		String[] arr = new String[] { "Americana", "Roman", "Chili", "Mamma_mia" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose pizza " + Arrays.toString(arr));
		String c = sc.next();
		int j = 0;
		// Check correctness of typed info
		for (int i = 0; i < 4; i++) {
			if (c.equals(arr[i]))
				j++;
		}
		if (j ==1)
			return c;
		else
			return "Invalid name";
	}

	public int chooseSize() {
		// In this method user choosing one of four possible size
		int[] arr = new int[] { 30, 35, 40, 45 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose pizza " + Arrays.toString(arr));
		int a = sc.nextInt();
		int j = 0;
		// Check correctness of chosen size
		for (int i = 0; i < 4; i++) {
			if (a == arr[i])
				j++;
		}
		if (j == 1)
			return a;
		else
			return 0;
	}

	public Pizza orderPizza() {
		String c = choosePizza();
		int a = chooseSize();
		System.out.println("Do you prefer spicy or not? Type yes/no");
		Scanner sc = new Scanner(System.in);
		String spicy = sc.next();
		System.out.println("Do you wanna double cheese? Type yes/no");
		String doubleCheese = sc.next();
		// Assign meanings depending on typed info
		if (spicy.equals("yes"))
			spicy = "spicy";
		else spicy = "not spicy";
		if (doubleCheese.equals("yes"))
			doubleCheese = "with doublecheese";
		else doubleCheese = "one cheese";
		return cookPizza(c, a, spicy, doubleCheese);
	}

	public Pizza cookPizza(String name, int size, String spicy, String cheese) {
		Pizza pizza = new Pizza(); // Create new object of class Pizza and assign meanings to class fields
		pizza.pizzaName = name;
		pizza.pizzaSize = size;
		pizza.spicy = spicy;
		pizza.doubleCheese = cheese;
		deliverPizza(name, size, spicy, cheese);
		return pizza;
	}

	public void deliverPizza(String name, int size, String spicy, String cheese) {
		System.out.println("Your " + name + ", " + size + "cm, " + spicy+ ", " + cheese);
		// Choose price depending on cheese
		if (cheese.equals("with doublecheese"))
			System.out.println("11 dollars please");
		else
			System.out.println("10 dollars please");
	}

}
