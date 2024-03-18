package day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> getAll() {
		
		String sqlQuery = "select * from Restaurant";
		Collection<Restaurant> allRestaurant = new ArrayList<>();
		try (
				Connection conn = JDBCUtil.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				){
			while(rs.next()) {
				int id = rs.getInt(1);
				int count = rs.getInt(2);
				String name = rs.getString(3);
				String cuisine = rs.getString(4);
				
				Restaurant rst = new Restaurant(id,count,name,cuisine);
				allRestaurant.add(rst);				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return allRestaurant;
	}

	@Override
	public Restaurant getOne(Integer id) {
		Restaurant foundRestaurant = null;
		String sqlQuery = "select * from restaurant where rest_Id = ?";
		try (
				Connection conn = JDBCUtil.buildConnection();
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
	public void create(Restaurant rst) {
		String sqlQuery = "insert into restaurant value (?,?,?,?)";
		try (
				Connection conn = JDBCUtil.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			int id = rst.getRestId();
			int bcount = rst.getBranchCount();
			String name = rst.getRestName();
			String cuisine = rst.getRestCuisine();
			
			pstmt.setInt(2, bcount);
			pstmt.setInt(1, id);
			pstmt.setString(3, name);
			pstmt.setString(4, cuisine);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Record has been successfully insert");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOne(Integer id) {
		String sqlQuery = "delete from restaurant where rest_Id = ?";
		
		try (
				Connection conn = JDBCUtil.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			System.out.println(count + " record deleted");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurant rst) {
		String sqlQuery = "update restaurant set branchCount = ?,rest_Name = ?,rest_Cuisine = ? where rest_Id = ? ";
		try (
				Connection conn = JDBCUtil.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			int id = rst.getRestId();
			int bcount = rst.getBranchCount();
			String name = rst.getRestName();
			String cuisine = rst.getRestCuisine();
			
			pstmt.setInt(4, id);
			pstmt.setInt(1, bcount);
			pstmt.setString(2, name);
			pstmt.setString(3, cuisine);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record updated ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
