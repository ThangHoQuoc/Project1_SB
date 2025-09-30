package com.javaweb.repository;

import java.util.List;

import com.javaweb.model.dto.BuildingSearchRequestDTO;
import com.javaweb.repository.entity.RentAreaEntity;

public interface rentAreaRepository {

	
	
	
	 List<RentAreaEntity> searchRentArea(Long id);
	
}
