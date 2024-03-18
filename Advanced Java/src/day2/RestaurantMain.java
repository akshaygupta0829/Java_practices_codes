package day2;

import java.util.Collection;

public class RestaurantMain {

	private static void showAll() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Collection<Restaurant> availbleRestaurant = idao.getAll();
		
		for(Restaurant rst : availbleRestaurant) 
			System.out.println(rst);
	}
	
	private static void showOne() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = idao.getOne(101);
		
		System.out.println(rst);
	}
	
	private static void recordCreate() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = new Restaurant(106,20,"Aksh","Marathvada Special");
		
		idao.create(rst);
	}
	
	private static void recordDelete() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		
		idao.deleteOne(104);
	}
	
	private static void recordUpdate() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = idao.getOne(102);
		
		rst.setBranchCount(10);
		rst.setRestCuisine("Ice-Cream");
		
		idao.update(rst);
	}
	
	
	public static void main(String[] args) {

		//showAll();
		//showOne();
		recordCreate();
		//recordDelete();
		//recordUpdate();
	}

}
