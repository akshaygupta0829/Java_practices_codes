package day;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;


public class RestaurantDao implements InterfaceDao<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> getAll() {
		String query = "Select * from Restaurant";
		Collection<Restaurant> getRestaurants = new ArrayList<>();
		
		try (
				Connection cn = Utils.buildConn();
				Statement stmt = cn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				){
			while(rs.next()) {
				int id = rs.getInt(1);
				int count = rs.getInt(2);
				String name = rs.getString(3);
				String cuisine = rs.getString(4);
				
				Restaurant rst = new Restaurant(id,count,name,cuisine);
				getRestaurants.add(rst);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getRestaurants;
	}

	@Override
	public Restaurant getOne(Integer id) {
		Restaurant foundRestaurant = null;
		String sqlQuery = "select * from restaurant where rest_Id = ?";
		try (
				Connection conn =Utils.buildConn();
				){
			PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int r_id = rs.getInt(1);
				int count = rs.getInt(2);
				String name = rs.getString(3);
				String cuisine = rs.getString(4);
				
				foundRestaurant = new Restaurant(r_id,count,name,cuisine);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();		}
		
		return foundRestaurant;
	}

	@Override
	public void create(Restaurant t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOne(Integer key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Restaurant t) {
		// TODO Auto-generated method stub

	}

}
