package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.rentAreaRepository;
import com.javaweb.repository.entity.RentAreaEntity;

@Repository
public class RentAreaRepositoryImpl implements rentAreaRepository{
    
	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "123456";
	@Override
	public List<RentAreaEntity> searchRentArea(Long buildingId) {
		String sql = "SELECT * FROM rentarea WHERE buildingid = " + buildingId;
        List<RentAreaEntity> rentAreas = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			 while (rs.next()) {
	                RentAreaEntity rentArea = new RentAreaEntity();
	                rentArea.setId(rs.getLong("id"));
	                rentArea.setValue(rs.getLong("value"));
	                rentArea.setBuildingid(rs.getLong("buildingid"));
	                rentArea.setCreateddate(rs.getDate("createddate"));
	                rentArea.setModifieddate(rs.getDate("modifieddate"));
	                rentArea.setCreatedby(rs.getString("createdby"));;
	                rentArea.setModifiedby(rs.getString("modifiedby"));;

	                

	                rentAreas.add(rentArea);
	            }
		  } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return rentAreas;
		}
	
	
	
	
	

	
}
	

	


