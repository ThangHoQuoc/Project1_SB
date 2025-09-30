package com.javaweb.service.Impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.dto.BuildingResponseDTO;
import com.javaweb.model.dto.BuildingSearchRequestDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.rentAreaRepository;
import com.javaweb.repository.Impl.RentAreaRepositoryImpl;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.RentAreaEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
    private rentAreaRepository rentAreaRepository;


	@Override
	public List<BuildingResponseDTO> searchBuildings(BuildingSearchRequestDTO request) {
		 
		List<BuildingEntity> entities = buildingRepository.searchBuildings(request);
		
		List<BuildingResponseDTO> result = new ArrayList<>();
		
		for(BuildingEntity entity: entities) {
			BuildingResponseDTO dto = new BuildingResponseDTO();
			
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setNumberOfBasement(entity.getNumberOfBasement());
			dto.setRentPrice(entity.getRentPrice());
			dto.setAddress(entity.getStreet() + ", " + entity.getWard());
			dto.setNameOfManager(entity.getManagerName());
			dto.setPhoneOfManager(entity.getManagerPhonenumber());
			dto.setFloorArea(entity.getFloorArea());
			
			  List<RentAreaEntity> rentAreas = rentAreaRepository.searchRentArea(entity.getId());

	            List<Long> rentAreaValues = new ArrayList<>();
	            for (RentAreaEntity r : rentAreas) {
	                rentAreaValues.add(r.getValue());
	            }
	            dto.setRentArea(rentAreaValues);

	            dto.setEmptyRentArea(null);

	            System.out.println(">>> Filter name = " + request.getNameOfBuilding());
	            System.out.println(">>> Filter basement = " + request.getNumberOfBasement());
			
            dto.setServiceFee(entity.getServiceFee());
			dto.setBrokerageFee(entity.getBrokerageFee());
			
			result.add(dto);
		}
		return result;
		
		
	}
	
	
	

	
	

}
