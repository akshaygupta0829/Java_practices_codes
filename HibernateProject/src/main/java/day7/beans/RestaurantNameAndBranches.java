package day7.beans;

public class RestaurantNameAndBranches {
	private String restaurantName;
	private String restaurantCuisine;
	
	public RestaurantNameAndBranches() {
		
	}
	
	public RestaurantNameAndBranches(String restaurantName, String restaurantCuisine) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantCuisine = restaurantCuisine;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantCuisine() {
		return restaurantCuisine;
	}

	public void setRestaurantCuisine(String restaurantCuisine) {
		this.restaurantCuisine = restaurantCuisine;
	}

	@Override
	public String toString() {
		return "RestaurantNameAndBranches [restaurantName=" + restaurantName + ", restaurantCuisine="
				+ restaurantCuisine + "]";
	}

}
