package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.model.dto.BuildingSearchRequestDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "123456";
	

	@Override
	public List<BuildingEntity> searchBuildings(BuildingSearchRequestDTO request) {
		 StringBuilder sql = new StringBuilder("SELECT * FROM building b WHERE 1 = 1");

		    if (request.getNameOfBuilding() != null && !request.getNameOfBuilding().isEmpty()) {
		        sql.append(" AND b.name LIKE '%").append(request.getNameOfBuilding()).append("%'");
		    }

		    if (request.getStreet() != null && !request.getStreet().isEmpty()) {
		        sql.append(" AND b.street LIKE '%").append(request.getStreet()).append("%'");
		    }

		    if (request.getWard() != null && !request.getWard().isEmpty()) {
		        sql.append(" AND b.ward LIKE '%").append(request.getWard()).append("%'");
		    }

		    if (request.getDictrictId() != null && !request.getDictrictId().isEmpty()) {
		        sql.append(" AND b.districtid = ").append(request.getDictrictId());
		    }

		    if (request.getNumberOfBasement() != null) {
		        sql.append(" AND b.numberofbasement = ").append(request.getNumberOfBasement());
		    }

		    if (request.getFloorArea() != null) {
		        sql.append(" AND b.floorarea = ").append(request.getFloorArea());
		    }

		    if (request.getNameOfManager() != null && !request.getNameOfManager().isEmpty()) {
		        sql.append(" AND b.managername LIKE '%").append(request.getNameOfManager()).append("%'");
		    }

		    if (request.getPhoneOfManager() != null && !request.getPhoneOfManager().isEmpty()) {
		        sql.append(" AND b.managerphonenumber LIKE '%").append(request.getPhoneOfManager()).append("%'");
		    }

		    if (request.getMinRentPrice() != null) {
		        sql.append(" AND b.rentprice >= ").append(request.getMinRentPrice());
		    }
		    if (request.getMaxRentPrice() != null) {
		        sql.append(" AND b.rentprice <= ").append(request.getMaxRentPrice());
		    }

		    // filter theo min - max area (thực chất liên quan rentArea nên thường tách riêng)
		    if (request.getMinArea() != null) {
		        sql.append(" AND b.floorarea >= ").append(request.getMinArea());
		    }
		    if (request.getMaxArea() != null) {
		        sql.append(" AND b.floorarea <= ").append(request.getMaxArea());
		    }

		List<BuildingEntity> buildingEntities = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql.toString())) {

			while (rs.next()) {
				 BuildingEntity building = new BuildingEntity();
	                building.setId(rs.getLong("id"));
	                building.setName(rs.getString("name"));
	                building.setStreet(rs.getString("street"));
	                building.setWard(rs.getString("ward"));
	                building.setDistrictId(rs.getLong("districtid"));
	                building.setNumberOfBasement(rs.getLong("numberofbasement"));
	                building.setFloorArea(rs.getLong("floorarea"));
	                building.setRentPrice(rs.getLong("rentprice"));
	                building.setManagerName(rs.getString("managername"));
	                building.setManagerPhonenumber(rs.getString("managerphonenumber"));
	                buildingEntities.add(building);
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return buildingEntities;
	}

	


}
