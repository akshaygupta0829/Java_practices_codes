package day;


import java.util.Collection;

public class RestaurantMain {

	public static void showAll() {
		InterfaceDao< Restaurant, Integer> dao = new RestaurantDao();
		Collection<Restaurant> availbleRestaurant = dao.getAll();
		
		for(Restaurant rst : availbleRestaurant) 
			System.out.println(rst);
	}
	
	private static void showOneCourse() {
		InterfaceDao<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant crs = idao.getOne(101);
		if(crs != null)
			System.out.println(crs);
		else 
			System.out.println("Course id does not exist");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showAll();
		showOneCourse();
	}

}
