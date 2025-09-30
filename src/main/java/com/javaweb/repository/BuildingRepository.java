package com.javaweb.repository;

import java.util.List;

import com.javaweb.model.dto.BuildingSearchRequestDTO;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository  {

	
	List<BuildingEntity> searchBuildings(BuildingSearchRequestDTO request);
	
}
