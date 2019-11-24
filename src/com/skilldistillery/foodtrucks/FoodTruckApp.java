package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	int highestRating = 0;
	int averageRating = 0;
	int choice = 1;
	int ratingTotal = 0;
	int numOfArrays = 0;
	int rating;
	Scanner kb = new Scanner(System.in);
	FoodTruck foodTrucks[] = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();

		app.createFoodTruck();

	}

	// M e t h o d s
	public void createFoodTruck() {
		String newTruckChoice;
		String name;
		String type;

		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.println("Do you want to create a new food truck: (Yes/Quit)");
			newTruckChoice = kb.nextLine();
			if (newTruckChoice.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("Enter food truck name: ");
			name = kb.nextLine();
			if (newTruckChoice.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("Enter food type: ");
			type = kb.nextLine();

			System.out.println("Enter rating (1-5): ");
			rating = kb.nextInt();
			kb.nextLine();

			FoodTruck truck = new FoodTruck(name, type, rating);
			foodTrucks[i] = truck;
		}
		displayMenu();

	}

	public void displayMenu() {

		do {
			System.out.println();
			System.out.println("1. List Food Trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. See the highest rated food truck");
			System.out.println("4. Quit the Program");
			choice = kb.nextInt();

			switch (choice) {
				case 1:
					System.out.println();
					listExistingTrucks();
					break;
				case 2:
					System.out.println();
					System.out.println("Average Rating: " + averageRating());
					break;
				case 3:
					System.out.println();
					System.out.println("Highest Rating: " + highestRating());
			}

		} while (!(choice == 4));
	}

	public double averageRating() {

		for (int j = 0; j < foodTrucks.length; j++) {
			if (foodTrucks[j] == null) {
				break;
			}
			ratingTotal += foodTrucks[j].getRating();
			numOfArrays++;
		}

		averageRating = (ratingTotal / numOfArrays);
		return averageRating;

	}

	public double highestRating() {
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] == null) {
				break;
			}
			if (foodTrucks[i].getRating() > highestRating) {
				highestRating = foodTrucks[i].getRating();
			}

		}
		for (int j = 0; j < foodTrucks.length; j++) {
			if (foodTrucks[j].getRating() == highestRating) {
				System.out.println(foodTrucks[j].toString());
			}
		}

		return highestRating;
	}

	public void listExistingTrucks() {
		for (int i = 0; i < foodTrucks.length; i++) {
			if (!(foodTrucks[i] == null))
				System.out.println(foodTrucks[i].toString());
//				System.out.println("Name: " + foodTrucks[i].getName() + "\tFood Type: " + foodTrucks[i].getFoodType()
//						+ "\tRating: " + foodTrucks[i].getRating());

		}
	}
}
