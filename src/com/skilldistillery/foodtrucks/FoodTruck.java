package com.skilldistillery.foodtrucks;


public class FoodTruck {
	
	// F i e l d s
	private int numericId;
	private String name;
	private String foodType;
	private int rating;
	private static int nextUniqueId = 1;	// Pi is 3.14 in any instance
	
	// C o n s t r u c t o r s
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodType, int rating) {
		super();
		this.numericId = nextUniqueId++;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	

	@Override
	public String toString() {
		return "FoodTruck [numericId=" + numericId + ", " + (name != null ? "name=" + name + ", " : "")
				+ (foodType != null ? "foodType=" + foodType + ", " : "") + "rating=" + rating;
	}


	public int getNumericId() {
		return numericId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
}
